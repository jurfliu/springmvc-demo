package com.ljf.spring.mvc.demo.controller;

import com.ljf.spring.mvc.demo.bean.UserLogin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * @ClassName: UserLoginController
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/01/16 17:31:01 
 * @Version: V1.0
 **/
@Controller
@RequestMapping("/login")
public class UserLoginController
{
    /**
     * 接收请求
     * @return
     */
    @RequestMapping("/toLogin")
    public String toLogin(UserLogin user, HttpSession session) {
        System.out.println("用户登录:"+user.getUserName()+"  "+user.getPassword());
        if(user.getUserName()!=null&&"admin".equals(user.getUserName())&&(user.getPassword()!=null&&"123".equals(user.getPassword()))){
           System.out.println("登录成功!!!,将用户信息放入session中");
            session.setAttribute("userName",user.getUserName());
          return "menu";
        }
        else{
            return "error";
        }
    }
    /**
     * 接收请求
     * @return
     */
    @RequestMapping("/findUser")
    public String findUser(UserLogin user, HttpSession session) {
        String name=(String)session.getAttribute("userName");
        System.out.println("从session中取得用户名:"+name);
        return "user";
    }
}
