package com.ljf.spring.mvc.demo.bean;

/**
 * @ClassName: UserLogin
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/01/16 17:35:34 
 * @Version: V1.0
 **/
public class UserLogin {
    private String userName;
    private  String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
