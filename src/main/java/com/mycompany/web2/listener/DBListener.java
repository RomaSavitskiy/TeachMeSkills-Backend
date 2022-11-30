package com.mycompany.web2.listener;

import com.mycompany.web2.entity.Student;
import com.mycompany.web2.service.StudentResultSetConvert;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBListener implements ServletContextListener {
    public static final String SELECT_FROM_STUDENT = "select * from student";
    public static StudentResultSetConvert converter = new StudentResultSetConvert();

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        List<Student> studentList = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "12345678");
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(SELECT_FROM_STUDENT)) {

            studentList = new ArrayList<>();

            System.out.println(converter.convert(resultSet));

            while (resultSet.next()) {
                studentList.add(converter.convert(resultSet));
            }

            System.out.println(studentList + " --------------------------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println(studentList);
        sce.getServletContext().setAttribute("studentList", studentList);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContextListener.super.contextDestroyed(sce);
    }
}
