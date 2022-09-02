package org.skq.shopping;

import java.util.HashMap;

public class ShoppingCart {

    private HashMap<Product, Integer> shoppingCart;
    private Customer customer;

    public ShoppingCart(Customer customer) {
        this.customer = customer;
        this.shoppingCart = new HashMap<>();
    }

    public void addToCart(Product product) {
        if (shoppingCart.containsKey(product)) {
            shoppingCart.put(product, shoppingCart.get(product) + 1);
        } else {
            shoppingCart.put(product, 1);
        }
    }

    public Order checkOut() {
        double totalPrice = 0;
        int totalPoints = 0;
        for (Product product : shoppingCart.keySet()) {
            if (product.getCode().equals("")) {
                totalPrice += product.getPrice() * this.getQuantity(product);
                totalPoints += (int)Math.ceil(product.getPrice() * this.getQuantity(product) / 5);
            }
        };
        return new Order(totalPrice, totalPoints);
    }

    public int getQuantity(Product product) {
        if (shoppingCart.containsKey(product)) {
            return shoppingCart.get(product);
        } else {
            return 0;
        }
    }
}
