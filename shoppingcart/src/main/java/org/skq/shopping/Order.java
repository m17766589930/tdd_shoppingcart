package org.skq.shopping;

import lombok.Data;

@Data
public class Order {

    private double totalPrice;

    private int totalPoints;

    public Order(double totalPrice, int totalPoints) {
        this.totalPrice = totalPrice;
        this.totalPoints = totalPoints;
    }
}
