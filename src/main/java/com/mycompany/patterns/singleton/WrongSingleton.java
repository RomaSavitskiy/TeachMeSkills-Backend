package com.mycompany.patterns.singleton;

public class WrongSingleton {
    private int value;

    // Конструкторы должны быть приватные
    private WrongSingleton() {
    }

    // Приватные конструкторы можно вызывать в самом этом классе
    private static WrongSingleton singleton;

    // В отличие от Test создаётся не при запуске приложения, а при вызове метода
    public static WrongSingleton getInstance() {
        if (singleton == null) {
            singleton = new WrongSingleton();
        }

        return singleton;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
