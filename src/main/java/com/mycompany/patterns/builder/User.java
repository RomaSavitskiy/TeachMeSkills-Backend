package com.mycompany.patterns.builder;

import lombok.Data;

@Deprecated
@Data
// Реализация паттерна builder
public class User {
    private int age;
    private String name;
    private String phone;
    private String address;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "UserBuilder{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    private User(UserBuilder builder) {
        this.name = builder.name;
        this.address = builder.address;
        this.age = builder.age;
        this.phone = builder.phone;
    }

    public static class UserBuilder {
        private int age;
        private String name;
        private String phone;
        private String address;

        // Метод билдера для присваивания поля age
        // Возвращает этот же объект, но с новым значением поля age (Так же с остальными параметрами)
        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        // Метод build возвращает готовый объект
        public User build() {
            if (this.age < 0) throw new RuntimeException("Age can't be less then zero");
            return new User(this);
        }
    }
}
