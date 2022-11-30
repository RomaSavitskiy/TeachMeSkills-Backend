package com.mycompany.web1.filter;

import com.mycompany.web1.entity.User;
import jakarta.servlet.*;
import java.io.IOException;

public class FirstFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        /*User user = (User) servletRequest.getServletContext().getAttribute("user");
        System.out.println("User from filter " + user);

        filterChain.doFilter(servletRequest, servletResponse);*/
    }
}
