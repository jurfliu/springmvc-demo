package com.ljf.spring.mvc.demo.bean;

import java.util.List;

/**
 * @ClassName: Vo
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/01/10 22:55:01 
 * @Version: V1.0
 **/
public class Vo {
    private List<User> userList;

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "Vo{" +
                "userList=" + userList +
                '}';
    }
}
