package com.ljf.spring.mvc.demo.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName: MyExceptionController
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/01/17 11:25:23 
 * @Version: V1.0
 **/
public class MyExceptionController implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
       ModelAndView modelAndView=new ModelAndView();
       if(e instanceof  NullPointerException){
           modelAndView.addObject("info","空指针异常");
       }
       modelAndView.setViewName("exception_demo");
        return  modelAndView;
    }
}
