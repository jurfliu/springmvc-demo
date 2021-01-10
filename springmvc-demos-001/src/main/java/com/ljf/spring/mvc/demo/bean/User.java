package com.ljf.spring.mvc.demo.bean;

/**
 * @ClassName: User
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/01/10 17:26:08 
 * @Version: V1.0
 **/
public class User {
    private  String userName;
    private int age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
