package org.example;

import java.util.List;

public class ShoppingCart {

    private List<Item> items;

    public ShoppingCart(List<Item> items) {
        this.items = items;
    }

    // Method to calculate the total price of items in the cart
    public double calculateTotalPrice() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    // Method to add an item to the cart
    public void addItem(Item item) {
        items.add(item);
    }
}

