package com.restful.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by yuanqiang on 2018/1/12.
 */
public class SecurityServletFilter implements Filter {

    private static Logger logger = LoggerFactory.getLogger(SecurityServletFilter.class);
    private static String loginUrl = "/oauth2/token";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String requestUrl = request.getRequestURI();

        logger.debug("当前请求URL地址：" + requestUrl);

        if(StringUtils.isEmpty(requestUrl))
            response.sendError(404 , "当前请求的URL不存在！");

        if(requestUrl.indexOf(loginUrl) != -1 || requestUrl.indexOf(".css") != -1 ||
                requestUrl.indexOf(".js") != -1 || requestUrl.indexOf(".html") != -1 ||
        requestUrl.indexOf(".png") != -1 || requestUrl.indexOf("/share/") != -1) {
            filterChain.doFilter(servletRequest ,servletResponse);
            return;
        }



        String token = request.getHeader("Authorization");
        if(StringUtils.isEmpty(token))
            response.sendError(403 , "当前请求未带授权令牌，请求无效！");

        filterChain.doFilter(servletRequest ,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
