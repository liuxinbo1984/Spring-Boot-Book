package com.example.demo.Servlet.Filter;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import org.springframework.core.annotation.Order;

//@Order(1)//多个filter的时候,该序号越小,越早执行
//@WebFilter(filterName = "FilterDemo", urlPatterns = "/tttt")//url过滤配置,非包配置
public class FilterDemo implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //init逻辑,该init将在服务器启动时调用
        System.out.println("FilterDemo init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        //request处理逻辑
        //request在封装逻辑
        //chain重新写回request和response
        System.out.println("拦截器 filter demo");
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {
        //写destroy逻辑,该destroy逻辑将在服务器关闭时调用
        System.out.println("FilterDemo destroy");
    }
}