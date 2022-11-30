package com.mycompany.web3.servlet;

import com.mycompany.web1.entity.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/login")
public class JspServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("first_name");
        String age = req.getParameter("age");

        req.setAttribute("user", new User(username, Integer.parseInt(age)));

        List<User> userList = new ArrayList<>();
        userList.add(new User(username, Integer.parseInt(age)));
        userList.add(new User(age, 33));

        req.getSession().setAttribute("myUsers", userList);

        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
