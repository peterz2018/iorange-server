package com.iorange.web.controller.system;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * 页面资源处理 Controller
 *
 * @author 谢烟客
 * @version 5.0 createTime: 2018/5/3
 */
@Log4j2
@Controller
@RequestMapping("/resource")
public class ResourceController {
    
    @RequestMapping("/html")
    public ModelAndView requestHtml(HttpServletRequest request, @RequestParam("url") String url) {
        ModelAndView model = new ModelAndView();
        
        log.info("Call resource/html?url={}", url);
        model.setViewName(url);
        
        return model;
    }
}
