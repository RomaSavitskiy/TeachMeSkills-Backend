package com.mycompany.object;

public class TestObject {
    private int value;
    private String secondValue;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestObject that = (TestObject) o;

        if (value != that.value) return false;
        return secondValue.equals(that.secondValue);
    }

    // Хэш-функция создаёт рандомное число
    @Override
    public int hashCode() {
        int result = value;
        result = 31 * result + secondValue.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    // Гарантирует, что перед тем как мусорщик удалит объект, он выполнится
    @Override
    protected void finalize() throws Throwable {
        System.out.println("This is done before deleting");
        super.finalize();
    }
}
