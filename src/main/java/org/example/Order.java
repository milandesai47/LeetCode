package org.example;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Order {
    private List<Item> items;

    public Order() {
        this.items = new ArrayList<>();
    }

    // Method to add an item to the order
    public void addItem(Item item) {
        if (item != null && item.getPrice() > 0) {
            items.add(item);
        }
    }

    // Method to remove an item from the order by name
    public void removeItem(String itemName) {
        Iterator<Item> iterator = items.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            if (item.getName().equals(itemName)) {
                iterator.remove();
                break;
            }
        }
    }

    // Method to calculate the total price of the order
    public double calculateTotalPrice() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    // Method to get a summary of the order
    public String getOrderSummary() {
        StringBuilder summary = new StringBuilder();
        for (Item item : items) {
            summary.append(item.getName()).append(": $").append(item.getPrice()).append("\n");
        }
        summary.append("Total: $").append(calculateTotalPrice());
        return summary.toString();
    }

    public static void main(String[] args) {
        Order order = new Order();
        order.addItem(new Item("Apple", 0.99));
        order.addItem(new Item("Banana", 1.29));
        order.removeItem("Apple");
        System.out.println(order.getOrderSummary());
    }
}
