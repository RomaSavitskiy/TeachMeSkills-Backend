package com.mycompany.web2.servlet;

import com.mycompany.web2.entity.Student;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

public class DBmainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();
        List<Student> studentArray = (List<Student>) req.getServletContext().getAttribute("studentList");
        servletContext.setAttribute("SA", studentArray);
        getServletContext().getRequestDispatcher("/students.jsp").forward(req, resp);
    }
}
