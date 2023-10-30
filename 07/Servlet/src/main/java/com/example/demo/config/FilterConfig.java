package com.example.demo.config;

import com.example.demo.Servlet.EncoderFilter;
import com.example.demo.Servlet.Filter.FilterDemo;
import com.example.demo.Servlet.Filter.FilterDemo01;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import javax.servlet.Filter;
import java.util.List;

/**
 * 手动注册Filter，并保证顺序
 */
@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<Filter> filter01() {
        FilterRegistrationBean<Filter> registrationBean01 = new FilterRegistrationBean<>();
        registrationBean01.setFilter(new FilterDemo());
        registrationBean01.setUrlPatterns(List.of("/tttt"));
        registrationBean01.setOrder(1);
        return registrationBean01;
    }

    @Bean
    @Order(2)
    public FilterRegistrationBean<Filter> filter02() {
        FilterRegistrationBean<Filter> registrationBean01 = new FilterRegistrationBean<>();
        registrationBean01.setFilter(new FilterDemo01());
        registrationBean01.setUrlPatterns(List.of("/tttt"));
        registrationBean01.setOrder(2);
        return registrationBean01;
    }

    @Bean
    public FilterRegistrationBean<Filter> filter03() {
        FilterRegistrationBean<Filter> registrationBean01 = new FilterRegistrationBean<>();
        registrationBean01.setFilter(new EncoderFilter());
        registrationBean01.setUrlPatterns(List.of("/tttt"));
        registrationBean01.setOrder(3);
        return registrationBean01;
    }
}
