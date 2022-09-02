package com.skq.shopping;

import org.junit.Before;
import org.junit.Test;
import org.skq.shopping.Customer;
import org.skq.shopping.ShoppingCart;

public class ShoppingCartTest {

    private static final double price = 100;
    private static final String productNum = "No.1";
    private Customer customer;
    private ShoppingCart shoppingCart;

    @Before
    public void setUp() {
        customer = new Customer("test");
        shoppingCart = new ShoppingCart(customer);
    }

    @Test
    public void shouldCalculateLoyaltyPointsWithNoDiscount() {

    }

}
