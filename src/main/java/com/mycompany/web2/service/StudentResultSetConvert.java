package com.mycompany.web2.service;

import com.mycompany.web2.entity.Student;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentResultSetConvert {
    public Student convert(final ResultSet resultSet) {
        Student student = new Student();

        try {
            student.setName(resultSet.getString("name"));
            student.setSurname(resultSet.getString("surname"));
            student.setAge(resultSet.getInt("age"));
        } catch (SQLException e) {
            System.out.println("incorrect result set: " + e);
        }

        return student;
    }
}
