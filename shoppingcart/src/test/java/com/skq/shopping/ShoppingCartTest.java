package com.skq.shopping;

import org.junit.Before;
import org.junit.Test;
import org.skq.shopping.Customer;
import org.skq.shopping.Order;
import org.skq.shopping.Product;
import org.skq.shopping.ShoppingCart;

import static org.junit.Assert.assertEquals;

public class ShoppingCartTest {

    private static final Product banana = new Product("", "banana", 4);
    private static final Product orange = new Product("DISCOUNT_10", "orange", 4.5);
    private static final Product apple = new Product("DISCOUNT_15", "apple", 5.5);
    private static final Product chair = new Product("BULK_BUY_2_GET_1", "chair", 50);
    private Customer customer;
    private ShoppingCart shoppingCart;

    @Before
    public void setUp() {
        customer = new Customer("test");
        shoppingCart = new ShoppingCart(customer);
    }

    @Test
    public void shouldCalculatePriceWithNoDiscount() {
        shoppingCart.addToCart(banana);
        Order order = shoppingCart.checkOut();
        assertEquals(banana.getPrice() * shoppingCart.getQuantity(banana), order.getTotalPrice(), 0.00);
    }

    @Test
    public void shouldCalculatePointsWithNoDiscount() {
        shoppingCart.addToCart(banana);
        Order order = shoppingCart.checkOut();
        assertEquals((int)Math.ceil(banana.getPrice() * shoppingCart.getQuantity(banana) / 5), order.getTotalPoints());
    }
}
