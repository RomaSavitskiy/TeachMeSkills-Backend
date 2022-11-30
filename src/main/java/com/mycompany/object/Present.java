package com.mycompany.object;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Present implements Cloneable {
    private String sender;
    private String receiver;
    private Product product;


    // Реализация глубокого клонирования
    @Override
    protected Present clone() throws CloneNotSupportedException {
        Present present = (Present) super.clone();
        Product prod = product.clone();
        present.setProduct(prod);
        return present;
    }
}
