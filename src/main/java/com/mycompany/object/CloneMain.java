package com.mycompany.object;

public class CloneMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Product product1 = new Product("Milk", 100);
        // Неправильное копирование
        // Так как создаётся не новый такой же продукт, а просто копируется значение ссылки на старый объект
        Product product2 = product1;

        // Правильное копирование
        Product product = product1.clone();
        product1.setValue(50);

        System.out.println(product1.getValue());
        System.out.println(product.getValue());

        // Поверхностное копирование, которое не позволяет скопировать вложенные объекты.
        // То есть она копирует ссылки на вложенные объекты.
        // Чтобы избежать эту проблему, используют глубокое копирование
        Present present = new Present("sender", "receiver", product);
        Present secondPresent = present.clone();
        product.setValue(60);
        System.out.println(present);
        System.out.println(secondPresent);
    }
}
