package com.mycompany.web1.servlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DayOfTheYear extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String s = req.getParameter("date");
        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("dd.MM.yyyy");

        Date docDate;

        try {
            docDate = format.parse(s);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        Calendar c = Calendar.getInstance();
        c.setTime(docDate);

        int dayNumber = c.get(Calendar.DAY_OF_YEAR);

        ServletContext servletContext = getServletContext();
        servletContext.setAttribute("dayNumber", dayNumber);
        getServletContext().getRequestDispatcher("/dayOfTheYear.jsp").forward(req, resp);
    }
}
