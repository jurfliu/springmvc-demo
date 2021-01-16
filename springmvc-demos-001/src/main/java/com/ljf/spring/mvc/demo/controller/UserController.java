package com.ljf.spring.mvc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName: UserController
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/01/04 12:45:24 
 * @Version: V1.0
 **/
@Controller
public class UserController {
    /**
     * 接收请求
     * @return
     */
    @RequestMapping(path="/hello",method= RequestMethod.GET,params = {"username"} )
    public String sayHello() {
        System.out.println("Hello SpringMVC!!");
       //return "success";//请求转发
        //return "forward:/WEB-INF/pages/success.jsp";//请求转发
        //return "redirect:/WEB-INF/pages/success.jsp";//无法访问到web-info下面的页面
       return "redirect:/hello2?username=ljf";//通过访问controller的另一个方法，进行重定向
    }
    /**
     * 接收请求
     * @return
     */
    @RequestMapping(path="/hello2",method= RequestMethod.GET,params = {"username"} )
    public String sayHello2() {
        System.out.println("Hello SpringMVC!!222");
        //return "success";
        return "forward:/WEB-INF/pages/success.jsp";
    }


}
