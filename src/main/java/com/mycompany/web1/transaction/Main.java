package com.mycompany.web1.transaction;

import com.mycompany.web1.transaction.entity.School;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private final static String SELECT_FROM_SCHOOL_QUERY = "select * from school";
    private static SchoolResultSetConvertor convertor = new SchoolResultSetConvertor();

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root",
                "12345678")) {

                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(SELECT_FROM_SCHOOL_QUERY);

                conn.setAutoCommit(false);

                List<School> schoolList = new ArrayList<>();

                while (resultSet.next()) {
                    schoolList.add(convertor.convert(resultSet));
                }

                System.out.println(schoolList);
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }
}
