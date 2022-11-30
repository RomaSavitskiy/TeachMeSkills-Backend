package com.mycompany.SOLID.firstExample.service;

import com.mycompany.SOLID.firstExample.entity.User;

/*
*This class is used for calculating some data related in user
*/
public class MonthCalculator {
    /**
     * @param user - current user
     * @return full month of user's life
     */
    public int getCurrentMonthOfLife(User user) {
        return user.getAge() * 12;
    }
}
