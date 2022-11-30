package com.mycompany.object;

import com.mycompany.patterns.builder.User;
import com.mycompany.patterns.singleton.TestClass;

import java.util.Arrays;

public class ObjectMain {
    public static void main(String[] args) {
        Object object1 = new Object();
        Object object2 = "here";
        Object object3 = new User.UserBuilder().build();

        System.out.println(object1);
        System.out.println(object2);
        System.out.println(object3);

        Object object4 = new ObjectMain();
        System.out.println(object4);

        // Тест hashcode
        System.out.println(object1.hashCode());
        System.out.println(object2.hashCode());
        System.out.println(object3.hashCode());
        System.out.println(object4.hashCode());

        System.out.println("dads".hashCode());


        System.out.println(object1.getClass());
        System.out.println(object2.getClass());
        System.out.println(Arrays.toString(object3.getClass().getAnnotations()));
        System.out.println(object4.getClass());
    }
}
