package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: UserController
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2020/09/12 14:49:27 
 * @Version: V1.0
 **/
@Controller
public class UserController {
    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("helloMsg", "HelloWorld,你好世界");
        return "login";
    }
}