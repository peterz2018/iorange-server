package com.iorange.web.controller.system;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 系统模块Controller
 *
 * @author 谢烟客
 * @version 5.0 createTime: 2018/3/28
 */
@Log4j2
@Configuration
@RequestMapping("/")
public class SystemContorller {

    @RequestMapping("/")
    public ModelAndView home(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelMap = new ModelAndView();
        log.info("### > request: go home!");

        modelMap.setViewName("index");
        return modelMap;
    }
}
