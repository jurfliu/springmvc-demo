package com.ljf.spring.mvc.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String pwd="lkd";
        Map<String, String> path = new HashMap<String, String>(2) {
            {
                put("https://", pwd);//根据现场环境部署确认是http还是https
            }
        };
        System.out.println("pwd:"+path);
    }
}
