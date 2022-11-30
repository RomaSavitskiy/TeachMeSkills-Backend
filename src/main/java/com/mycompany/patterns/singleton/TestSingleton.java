package com.mycompany.patterns.singleton;

public class TestSingleton {
    private int value;

    // Конструкторы должны быть приватные
    private TestSingleton() {
    }

    // Приватные конструкторы можно вызывать в самом этом классе
    // Создаётся при запуске приложения, так как это static объект
    private static TestSingleton singleton = new TestSingleton();

    // С помощью этого get-ера будет передаваться единственный объект этого класса в другие классы
    public static TestSingleton getInstance() {
        return singleton;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
