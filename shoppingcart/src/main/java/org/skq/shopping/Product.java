package org.skq.shopping;

import lombok.Data;

@Data
public class Product {

    private String code;
    private String name;
    private double price;

    public Product(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }
}
