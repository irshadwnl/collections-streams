package com.bridgelabz.collections.collectionss.setinterface;

import java.util.*;

class ShoppingCart {
    private Map<String, Double> productPrices = new HashMap<>(); // Stores product prices
    private Map<String, Double> cart = new LinkedHashMap<>(); // Maintains order of items added
    private TreeMap<Double, String> sortedCart = new TreeMap<>(); // Sorts by price

    public void addProduct(String product, double price) {
        productPrices.put(product, price);
        cart.put(product, price);
    }

    public void displayCartInOrder() {
        System.out.println("\nShopping Cart (Order of Items Added):");
        for (Map.Entry<String, Double> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " -> $" + entry.getValue());
        }
    }

    public void displayCartSortedByPrice() {
        sortedCart.clear();
        for (Map.Entry<String, Double> entry : cart.entrySet()) {
            sortedCart.put(entry.getValue(), entry.getKey());
        }

        System.out.println("\nShopping Cart (Sorted by Price):");
        for (Map.Entry<Double, String> entry : sortedCart.entrySet()) {
            System.out.println(entry.getValue() + " -> $" + entry.getKey());
        }
    }

    public double getTotalPrice() {
        double total = 0;
        for (double price : cart.values()) {
            total += price;
        }
        return total;
    }

    public void removeProduct(String product) {
        if (cart.containsKey(product)) {
            cart.remove(product);
            productPrices.remove(product);
            System.out.println("\nRemoved: " + product);
        } else {
            System.out.println("\nProduct not found in cart!");
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct("Laptop", 1200.00);
        cart.addProduct("Phone", 800.00);
        cart.addProduct("Headphones", 150.00);
        cart.addProduct("Mouse", 50.00);

        cart.displayCartInOrder();
        cart.displayCartSortedByPrice();

        System.out.println("\nTotal Price: $" + cart.getTotalPrice());

        cart.removeProduct("Phone");
        cart.displayCartInOrder();
    }
}
