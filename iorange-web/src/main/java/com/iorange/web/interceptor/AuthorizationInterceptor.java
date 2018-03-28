package com.iorange.web.interceptor;

import com.iorange.web.config.MDC;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 简介
 *
 * @author 谢烟客
 * @version 5.0 createTime: 2018/3/27
 */
@Log4j2
@Component
public class AuthorizationInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        MDC.putUUID();
        response.addHeader("Set-Cookie", "uid=1; Path=/; Secure; HttpOnly");

        String contextPath = request.getContextPath();
        String uri = request.getRequestURI().replace(contextPath, "");
        log.info("----> uri:{}", uri);

        return true;
    }
}
