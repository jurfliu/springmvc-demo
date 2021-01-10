package com.ljf.spring.mvc.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @ClassName: UserController
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2020/09/12 14:49:27 
 * @Version: V1.0
 **/


public class UserController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv=new ModelAndView();
        mv.addObject("helloMsg", "HelloWorld,你好世界");
        return new ModelAndView("/login","helloMsg", "HelloWorld,你好世界");
    }
}