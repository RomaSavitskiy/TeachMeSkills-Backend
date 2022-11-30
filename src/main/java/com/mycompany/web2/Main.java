package com.mycompany.web2;

import com.mycompany.web2.entity.Student;
import com.mycompany.web2.service.StudentResultSetConvert;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static final String SELECT_FROM_STUDENT = "select * from student";
    public static StudentResultSetConvert converter = new StudentResultSetConvert();


    public static void main(String[] args) {
        List<Student> studentList = null;

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
        System.out.println("Data are moved");
    }
}
