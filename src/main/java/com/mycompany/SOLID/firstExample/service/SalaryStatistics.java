package com.mycompany.SOLID.firstExample.service;

import com.mycompany.SOLID.firstExample.entity.Company;
import com.mycompany.SOLID.firstExample.entity.User;

/**
 * This class is used for calculating some statistics for salary
 */
public class SalaryStatistics {
    /**
     * @param user - is selected for statistics
     * @return int value of year's salary
     */
    public int getSalaryStatistics(User user) {
        return user.getSalary() * 12;
    }

    /**
     * @param company - selected company
     * @return all company's users salaries
     */
    public long getSalaryStatistics(Company company) {
        long sum = 0;

        for (User user : company.getUsers()) {
            sum += getSalaryStatistics(user);
        }

        return sum;
    }
}
