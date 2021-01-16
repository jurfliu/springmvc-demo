package com.ljf.spring.mvc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName: CityController
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/01/15 12:53:34 
 * @Version: V1.0
 **/
@Controller
@RequestMapping("/city")
public class CityController {
    /**
     *       跳转到upload页面
     * @return
     */
    @RequestMapping("/cityData")
    public ModelAndView city(@RequestParam(value="name",required = false,defaultValue = "ljf") String username){
        System.out.println("controller层获取的参数:"+username);
        ModelAndView  modelAndView=new ModelAndView();
        modelAndView.addObject("username",username);
        modelAndView.setViewName("city");
        return modelAndView;
    }
}
