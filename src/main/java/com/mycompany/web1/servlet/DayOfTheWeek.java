package com.mycompany.web1.servlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DayOfTheWeek extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Перевод строки в дату
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

        String dayOfWeek = null;

        switch(c.get(Calendar.DAY_OF_WEEK) - 1) {
            case 1: dayOfWeek = "Monday";
                break;
            case 2: dayOfWeek = "Tuesday";
                break;
            case 3: dayOfWeek = "Wednesday";
                break;
            case 4: dayOfWeek = "Thursday";
                break;
            case 5: dayOfWeek = "Friday";
                break;
            case 6: dayOfWeek = "Saturday";
                break;
            case 0: dayOfWeek = "Sunday";
                break;
        }

        ServletContext servletContext = getServletContext();
        servletContext.setAttribute("dayOfWeek", dayOfWeek);
        getServletContext().getRequestDispatcher("/dayOfTheWeek.jsp").forward(req, resp);
    }
}
