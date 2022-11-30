package com.mycompany.object;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product implements Cloneable {
    private String name;
    private int value;

    // Для того, чтобы мы могли копировать объекты необходимо имплементировать
    // класс до Cloneable, переопределить метод clone и привести return к нашему объекту (Тут это product)
    //
    @Override
    protected Product clone() throws CloneNotSupportedException {
        return (Product) super.clone();
    }
}
