package com.mycompany.web1.transaction;

import com.mycompany.web1.transaction.entity.School;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SchoolResultSetConvertor {
    public School convert(final ResultSet resultSet) {
        School school = new School();

        try {
            school.setId(resultSet.getInt("id"));
            school.setName(resultSet.getString("name"));
            school.setAddress(resultSet.getString("address"));
            school.setNumber(resultSet.getInt("number"));
        } catch (SQLException e) {
            System.out.println("incorrect result set " + e);
        }

        return school;
    }
}
