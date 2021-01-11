package com.ljf.spring.mvc.demo.controller;

import com.ljf.spring.mvc.demo.bean.User;
import com.ljf.spring.mvc.demo.bean.Vo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName: BikeOrderController
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/01/10 22:08:37 
 * @Version: V1.0
 **/
@Controller
public class BikeOrderController {
    /**
    * @author   controller中业务方法的参数名要和请求参数的名称一致，参数值灰自动映射匹配
    * @description
    * @date 2021/1/10 22:09
    * @param
     * * @return void
    */

    @RequestMapping("/bike")
    @ResponseBody
    public String  bike(String name,int age){
      System.out.println("获取的参数name:"+name+" age:"+age);
      String result=name+">>"+age;
      return result;
    }
    /**
    * @author liujianfu
    * @description      controller中业务方法的pojo参数属性名与请求参数名称一致，参数值会自动映射匹配
    * @date 2021/1/10 22:14
    * @param
    * @return
    */
    @RequestMapping("/bike2")
    @ResponseBody
    public String bike2(User user){
        System.out.println("获取的参数name:"+user.getUserName()+" age:"+user.getAge());
        String result=user.getUserName()+">>"+user.getAge();
        return result;
    }
    /**
     * @author liujianfu
     * @description      controller中业务方法的pojo参数属性名与请求参数名称一致，参数值会自动映射匹配
     * @date 2021/1/10 22:14
     * @param
     * @return
     */
    @RequestMapping("/bike3")
    @ResponseBody
    public String bike3(String [] strArray){
        System.out.println("获取的参数name:"+strArray[0]+" age:"+strArray[1]);
        String result=strArray[0]+">>"+strArray[1];
        return result;
    }
    @RequestMapping("/bike4")
    public String bike4(){
        return "bike";
    }

    /**
     * @author liujianfu
     * @description      controller中业务方法的集合参数获取，要将集合参数封装到一个pojo中才可以
     * 参数属性名与请求参数名称一致，参数值会自动映射匹配
     * @date 2021/1/10 22:14
     * @param
     * @return
     */
    @RequestMapping("/bike5")
    @ResponseBody
    public String bike5(Vo v){
        System.out.println("v:"+v);
     List<User> userList= v.getUserList();
     for(User u:userList){
         System.out.println("user:"+u.getUserName());
     }
        return "ok";
    }
}
