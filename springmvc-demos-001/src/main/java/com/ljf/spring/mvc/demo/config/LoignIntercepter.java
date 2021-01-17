package com.ljf.spring.mvc.demo.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @ClassName: LoignIntercepter
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/01/16 18:21:00 
 * @Version: V1.0
 **/
public class LoignIntercepter implements HandlerInterceptor {
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
        System.out.println("第1个intercepter，正在执行preHandle()方法......");
        //1.session是否已经存在用户名
        HttpSession session=request.getSession();
        String name=(String)session.getAttribute("userName");
        if(name==null||"".equals(name)){
            System.out.println("sessuon没有信息，则没有登录，跳转到登录首页");
        response.sendRedirect(request.getContextPath()+"/login.jsp");
          return false;
        }
        //session中存在用户信息，表明已经登录，放行
        return true;

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
        System.out.println("第1个intercepter，正在执行postHandle()方法......");
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
        System.out.println("第1个intercepter，正在执行afterCompletion()方法......");
    }
}
