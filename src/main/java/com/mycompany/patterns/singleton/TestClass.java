package com.mycompany.patterns.singleton;

import com.mycompany.patterns.singleton.TestSingleton;

public class TestClass {
    public static void main(String[] args) {
        TestSingleton singleton = TestSingleton.getInstance();
        singleton.setValue(100);
        checkSingleton();
    }

    private static void checkSingleton() {
        TestSingleton singleton = TestSingleton.getInstance();
        System.out.println(singleton.getValue());
    }
}
