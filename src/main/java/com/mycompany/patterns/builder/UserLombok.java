package com.mycompany.patterns.builder;

import lombok.Builder;

// Реализация паттерна builder через lombok
@Builder
public class UserLombok {
    private int age;
    private String name;
    private String phone;
    private String address;
}
