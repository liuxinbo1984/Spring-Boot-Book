package com.example.demo.Servlet.Filter;

import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@Order(2)
////作用范围
//@WebFilter(urlPatterns = "/*")
public class FilterDemo01 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("FilterDemo01 init");
    }
 
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
            System.out.println("拦截器 filter demo1");
            filterChain.doFilter(servletRequest,servletResponse);
    }
 
    @Override
    public void destroy() {
        System.out.println("FilterDemo01 destroy");
    }
}
