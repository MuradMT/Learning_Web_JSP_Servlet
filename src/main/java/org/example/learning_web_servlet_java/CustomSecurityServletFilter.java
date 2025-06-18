package org.example.learning_web_servlet_java;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/*")
public class CustomSecurityServletFilter implements Filter {

    @Override
    public void doFilter(
            final ServletRequest servletRequest,
            final ServletResponse servletResponse,
            final FilterChain filterChain
    ) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        String path = request.getRequestURI();

        //In mvc apps we should block our access to
        //direct jsp files ,servlet is main entry point
        if(path.contains("jsp")){
            response.sendRedirect("login");
            return;
        }
        // Let login page through without checking session
        if (path.endsWith("login")) {
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }

        // Check if user is logged in
        final Object loggedInUser = request.getSession().getAttribute("loggedInUser");

        if (loggedInUser == null) {
            // Not logged in, redirect to login
            response.sendRedirect("login");
        } else {
            // User is logged in, allow request
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }
}
