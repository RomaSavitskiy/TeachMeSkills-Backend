package com.mycompany.patterns.builder;

public class TestBuilderMain {
    public static void main(String[] args) {
        //Реализация паттерна builder
        /*User user1 = User.builder()
                .name("Roman")
                .age(18)
                .phone("+375299221474").build();

        User user2 = User.builder()
                .address("Filimonova 52")
                .name("Anton")
                .age(18).build();

        User.UserBuilder builder = User.builder();
        int i = 3;
        if (i > 3) {
            builder.age(23);
        }*/

        User user = new User.UserBuilder()
                .age(18)
                .name("Roman")
                .build();

        System.out.println(user.toString());
    }
}
