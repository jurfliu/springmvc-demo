package com.ljf.spring.mvc.demo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ljf.spring.mvc.demo.bean.User;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName: OrderUserController
 * @Description: TODO
 * @Author: liujianfu
 * spring mvc的数据响应方式
 * 1.页面跳转
 *  直接返回字符串
 *  通过ModelAndView对象返回
 *  2.返回写数据
 *   直接返回字符串
 *   返回对象或集合
 * @Date: 2021/01/10 14:18:14 
 * @Version: V1.0
 **/
@Controller
public class OrderUserController {

    /**返回字符串形式： 此种方式会将返回的字符串豫试图解析器的前后后缀拼接后跳转
     * 方法一
     * @return
     */
   @RequestMapping("/product")
    public String  productDemo1(){
       System.out.println("进入controoler层.....");
        return "product";
    }
    /**
    * @author liujianfu
    * @description       方法二： Model 模型  用于封装数据
     *                             view  视图  用于展示数据
    * @date 2021/1/10 14:44
    * @param
    * @return org.springframework.web.servlet.ModelAndView
    */
    @RequestMapping("/product2")
    public ModelAndView productDemo2(){
        System.out.println("进入controoler2层.....");
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("pname","面包");
        //modelAndView.setViewName("/prodcut");
        modelAndView.setViewName("product");
        return modelAndView;
    }
    /**
     * @author liujianfu
     * @description       方法二： Model 模型  用于封装数据
     *                             view  视图  用于展示数据
     * @date 2021/1/10 14:44
     * @param
     * @return org.springframework.web.servlet.ModelAndView
     */
    @RequestMapping("/product3")
    public ModelAndView productDemo3(ModelAndView modelAndView){
        System.out.println("进入controoler3层.....");
        modelAndView.addObject("pname","面包");
        modelAndView.setViewName("product");
        return modelAndView;
    }
    /**
     * @author liujianfu
     * @description       方法二： Model 模型  用于封装数据
     *                             view  视图  用于展示数据
     * @date 2021/1/10 14:44
     * @param
     * @return org.springframework.web.servlet.ModelAndView
     */
    @RequestMapping("/product4")
    public String productDemo4(Model model){
        System.out.println("进入controoler4层.....");
        model.addAttribute("pname","面包");
        return "product";
    }
    /**
     * @author liujianfu
     * @description       方法五： 使用HttpServletRequest
     * @date 2021/1/10 14:44
     * @param
     * @return org.springframework.web.servlet.ModelAndView
     */
    @RequestMapping("/product5")
    public String productDemo5(HttpServletRequest request){
        System.out.println("进入controoler5层.....");
        request.setAttribute("pname","面包");
        return "product";
    }
    /**
     * @author liujianfu
     * @description       直接返回字符串 ：通过springmvc框架注入response对象，使用response.getWriter().print("hello world")
       回写数据，此时不需要视图跳转，业务方法返回值为void
     * @date 2021/1/10 14:44
     * @param
     * @return org.springframework.web.servlet.ModelAndView
     */
    @RequestMapping("/product6")
    public void productDemo6(HttpServletResponse response) throws IOException {
        System.out.println("进入controoler6层.....");
        response.getWriter().print("hello world");
    }
    /**
     * @author liujianfu
     * @description       直接返回字符串 ：通过springmvc框架注入response对象，使用response.getWriter().print("hello world")
    回写数据，此时不需要视图跳转，业务方法返回值为void
     * @date 2021/1/10 14:44
     * @param
     * @return org.springframework.web.servlet.ModelAndView
     */
    @RequestMapping("/product7")
    @ResponseBody  //告诉springmvc 不进行页面跳转，直接进行数据返回响应，方法返回的字符串不是跳转而是直接在http响应体种返回。
    public String productDemo7(HttpServletResponse response) throws IOException {
        System.out.println("进入controoler7层.....");
        return "hello world 7";
    }
    /**
     * @author liujianfu
     * @description       直接返回字符串 ：通过springmvc框架注入response对象，使用response.getWriter().print("hello world")
    回写数据，此时不需要视图跳转，业务方法返回值为void
     * @date 2021/1/10 14:44
     * @param
     * @return org.springframework.web.servlet.ModelAndView
     */
    @RequestMapping("/product8")
    @ResponseBody  //告诉springmvc 不进行页面跳转，直接进行数据返回响应，方法返回的字符串不是跳转而是直接在http响应体种返回。
    public String productDemo8(HttpServletResponse response) throws IOException {
        System.out.println("进入controoler8层.....");
        return "{\"usernname\":\"ljf\",\"age\":\"34\"}";
    }
    /**
     * @author liujianfu
     * @description       直接返回字符串 ：通过springmvc框架注入response对象，使用response.getWriter().print("hello world")
    回写数据，此时不需要视图跳转，业务方法返回值为void
     * @date 2021/1/10 14:44
     * @param
     * @return org.springframework.web.servlet.ModelAndView
     */
    @RequestMapping("/product9")
    @ResponseBody  //告诉springmvc 不进行页面跳转，直接进行数据返回响应，方法返回的字符串不是跳转而是直接在http响应体种返回。
    public String productDemo9(HttpServletResponse response) throws IOException {
        System.out.println("进入controoler9层.....");
         User u=new User();
         u.setAge(34);
         u.setUserName("ljf");
        ObjectMapper objectMapper=new ObjectMapper();
        return objectMapper.writeValueAsString(u);//javabean转成json串
    }
    /**
     * @author liujianfu
     * @description       方法10：配置springmvc 让框架自动转成json串
     * @date 2021/1/10 14:44
     * @param
     * @return org.springframework.web.servlet.ModelAndView
     */
    @RequestMapping("/product10")
    @ResponseBody  //告诉springmvc 不进行页面跳转，直接进行数据返回响应，方法返回的字符串不是跳转而是直接在http响应体种返回。
    public User productDemo10(HttpServletResponse response) throws IOException {
        System.out.println("进入controoler10层.....");
        User u=new User();
        u.setAge(344);
        u.setUserName("ljf");
        return u;
    }

}
