package com.bridgelabz.collections.generics.warehousemngment;

public class WarehouseManagement {
    public static void main(String[] args) {
        // Create storage for different item types
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        // Add items to the storage
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Referigerator"));

        groceriesStorage.addItem(new Groceries("Apples"));
        groceriesStorage.addItem(new Groceries("Bread"));

        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Table"));

        // Display items using wildcard method
        System.out.println("Electronics in storage:");
        electronicsStorage.displayItems(electronicsStorage.getItems());

        System.out.println("\nGroceries in storage:");
        groceriesStorage.displayItems(groceriesStorage.getItems());

        System.out.println("\nFurniture in storage:");
        furnitureStorage.displayItems(furnitureStorage.getItems());
    }
}
