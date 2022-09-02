package org.skq.shopping;

import java.util.HashMap;

public class ShoppingCart {

    private HashMap<Product, Integer> shoppingCart;
    private Customer customer;

    public ShoppingCart(Customer customer) {
        this.customer = customer;
        this.shoppingCart = new HashMap<>();
    }

}
