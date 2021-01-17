package com.ljf.spring.mvc.demo.utils;

import java.util.List;

/**
 * @ClassName: Test
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/01/17 11:07:30 
 * @Version: V1.0
 **/
public class Test {
    public static void main(String[] args) {
        System.out.println("空指针异常:");
        List list=null;
        list.get(0);
    }
}
