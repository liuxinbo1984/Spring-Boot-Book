package com.example.demo.Servlet;

import org.springframework.core.annotation.Order;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

 
//@Order(3) // Order注解无法确定filter顺序
//@WebFilter(filterName = "EncoderFilter", urlPatterns = "/*")
public class EncoderFilter implements Filter {

	@Override
	public void destroy() {
		System.out.println("Encoder 销毁过滤器");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filter)
			throws IOException, ServletException {
		/*HttpServletRequest req = (HttpServletRequest) request;
		System.out.println("sessionId\t"+req.getSession().getId());
		System.out.println(req.getRemoteAddr()+"设定编码");*/
		//设定编码
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		System.out.println("doFilter Encoder");
		filter.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig filter) throws ServletException {
		//画面初期化
		System.out.println("doFilter Encoder init");
	}
}