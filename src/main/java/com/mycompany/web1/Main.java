package com.mycompany.web1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

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

        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK) - 1;
        System.out.println(dayOfWeek);

        String day = null;

        switch(dayOfWeek) {
            case 1: day = "Monday";
                break;
            case 2: day = "Tuesday";
                break;
            case 3: day = "Wednesday";
                break;
            case 4: day = "Thursday";
                break;
            case 5: day = "Friday";
                break;
            case 6: day = "Saturday";
                break;
            case 0: day = "Sunday";
                break;
        }

        System.out.println(day);
    }
}
