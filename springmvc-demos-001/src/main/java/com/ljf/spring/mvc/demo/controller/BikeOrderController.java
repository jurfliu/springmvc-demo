package com.ljf.spring.mvc.demo.controller;

import com.ljf.spring.mvc.demo.bean.User;
import com.ljf.spring.mvc.demo.bean.Vo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Date;
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
    /**
     * @author liujianfu
     * @description      controller中业务方法的集合参数获取，要将集合参数封装到一个pojo中才可以
     * 参数属性名与请求参数名称一致，参数值会自动映射匹配
     * @date 2021/1/10 22:14
     * @param
     * @return
     */
    @RequestMapping("/bike6")
    public String bike6(){
      System.out.println("controller6:::::::");
        return "ajax";
    }
    /**
     * @author liujianfu
     * @description      controller中业务方法的集合参数获取，要将集合参数封装到一个pojo中才可以
     * 参数属性名与请求参数名称一致，参数值会自动映射匹配
     * @date 2021/1/10 22:14
     * @param
     * @return
     */
    @RequestMapping("/bike7")
    @ResponseBody
    public String bike7(@RequestBody List<User> userList){
        for(User u:userList){
            System.out.println("user:"+u.getUserName());
        }
        return "ok";
    }
    /**
     * @author liujianfu
     * @description      参数绑定注解@requestParam
     *                   value ：与请求参数名称
     *                   required:  此在制定的请求参数是否必须包括，默认true，提交参数如果没有则报错
     *                   defaultvalue 当没有制定请求参数时，则使用制定的默认值赋值。
     * 参数属性名与请求参数名称一致，参数值会自动映射匹配
     * @date 2021/1/10 22:14
     * @param
     * @return
     */
    @RequestMapping("/bike8")
    @ResponseBody
    public String bike8(@RequestParam(value="name",required = false,defaultValue = "ljf") String username){
        System.out.println("username:"+username);
        return "ok";
    }
    /**
     * @author liujianfu
     * @description      参数绑定注解@requestParam
     *                   value ：与请求参数名称
     *                   required:  此在制定的请求参数是否必须包括，默认true，提交参数如果没有则报错
     *                   defaultvalue 当没有制定请求参数时，则使用制定的默认值赋值。
     * 参数属性名与请求参数名称一致，参数值会自动映射匹配
     * @date 2021/1/10 22:14
     * @param
     * @return
     */
    @RequestMapping("/bike9/{pname}")
    @ResponseBody
    public String bike9(@PathVariable(value="pname",required = false) String username){
        System.out.println("username:"+username);
        return "ok";
    }
    /**
      * @param
     * @return
             */
    @RequestMapping("/bike10")
    @ResponseBody
    public String bike10(Date date){
        System.out.println("date:"+date);
        return "ok";
    }
    /**
     * @param
     * @return
     */
    @RequestMapping("/bike11")
    @ResponseBody
    public String bike11(HttpServletRequest request, HttpServletResponse response, HttpSession session){
        System.out.println("request:"+request);
        System.out.println("reponse:"+response);
        System.out.println("session:"+session);
        String s=request+" "+response+" "+session;
        return s;
    }
    /**
     * @param       @RequestHeader注解  可以获得请求头的信息  相当于  request.getHeader(name);
     *           value: 请求头的名称；required ： 是否必须携带此请求头
     * @return
     */
    @RequestMapping("/bike12")
    @ResponseBody
    public String bike12(@RequestHeader(value="USER-AGENT",required=false ) String header){

        String s=header;
        return s;
    }
    /**
     * @param       @RequestHeader注解  可以获得请求头的信息  相当于  request.getHeader(name);
     *           value: 请求头的名称；required ： 是否必须携带此请求头
     * @return
     */
    @RequestMapping("/bike13")
    @ResponseBody
    public String bike13(@CookieValue(value = "JESSSIONID") String cookieId){

        String s=cookieId;
        System.out.println("s:"+s);
        return s;
    }
    /**
     *       跳转到upload页面
     * @return
     */
    @RequestMapping("/upload")
    public String bike14(){
     System.out.println("upload:");
        return "upload";
    }
    /**
     *       跳转到upload页面
     * @return
     */
    @RequestMapping("/uploadFile")
    @ResponseBody
    public void bike15(String userName, MultipartFile uploadFile) throws IOException {
        System.out.println("upload:");
        //带有file路径的文件名称
       String fileName= uploadFile.getOriginalFilename();
       uploadFile.transferTo(new File("d:\\upload\\"+fileName));
    }
    /**
     *       跳转到upload页面
     * @return
     */
    @RequestMapping("/uploads")
    public String bike15(){
        System.out.println("uploads:");
        return "uploads";
    }
    /**
     *       跳转到upload页面
     * @return
     */
    @RequestMapping("/uploadFiles")
    @ResponseBody
    public void bike16(String userName, MultipartFile uploadFiles[]) throws IOException {
        System.out.println("uploads:");
        //带有file路径的文件名称
        for(MultipartFile uploadFile:uploadFiles){
            String fileName= uploadFile.getOriginalFilename();
            uploadFile.transferTo(new File("d:\\upload\\"+fileName));
        }
        System.out.println("上传完成!!!");

    }
}
