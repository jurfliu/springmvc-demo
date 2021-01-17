package com.ljf.spring.mvc.demo.controller;

import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ClassName: ExceptionHandler
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/01/17 10:55:06 
 * @Version: V1.0
 **/
@Controller
public class ExceptionHandler  {

    @RequestMapping("/exception")
    public  void  exceptionDemo() throws Exception{
        System.out.println("空指针异常:");
        List list=null;
        list.get(0);

    }
}
