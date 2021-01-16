package com.ljf.spring.mvc.demo.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName: MyDefinedIntercepter2
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/01/15 12:51:27 
 * @Version: V1.0
 **/
public class MyDefinedIntercepter2 implements HandlerInterceptor {
    /**
     * 预处理，controller方法执行前
     * return true 放行，执行下一个拦截器，如果没有，执行controller中的方法
     * return false不放行
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("第2个intercepter，正在执行preHandle()方法......");
        String param=request.getParameter("name");
        if(param!=null&&!"".equals(param)){
            System.out.println("获取的参数为:"+param);
            return true;
        }
        else{
            request.getRequestDispatcher("/WEB-INF/pages/error.jsp").forward(request,response);
            return false;
        }
    }

    /**
     * 后处理方法，controller方法执行后，success.jsp执行之前
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("第2个intercepter，正在执行postHandle()方法......");
        modelAndView.addObject("username","第二个intercepter 设置");
        // request.getRequestDispatcher("/WEB-INF/pages/error.jsp").forward(request,response);
    }

    private void modelAndView(String dsf, String dsfds) {
    }

    /**
     * success.jsp页面执行后，该方法会执行
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("第2个intercepter，正在执行afterCompletion()方法......");
    }
}
