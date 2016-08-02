package com.xinguan14.zidingyiProperties;


import javax.servlet.*;
import java.io.IOException;

/**
 * Created by XL on 2016/8/1.
 */
public class TestFilter  implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
      System.out.println("自定义拦截器处理中。。。。");
    }

    @Override
    public void destroy() {

    }
}
