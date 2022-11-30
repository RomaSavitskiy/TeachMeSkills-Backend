package com.mycompany.SOLID.firstExample.entity;

import lombok.Data;

import java.util.List;

@Data
public class Company {
    List<User> users;
}
