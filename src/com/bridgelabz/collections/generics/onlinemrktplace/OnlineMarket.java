package com.bridgelabz.collections.generics.onlinemrktplace;

public class OnlineMarket {
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Programming", 29.99, BookCategory.SCIENCE);
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 19.99, ClothingCategory.MEN);
        Product<GadgetCategory> phone = new Product<>("Smartphone", 699.99, GadgetCategory.PHONE);

        // Display original prices
        System.out.println("Original Prices:");
        System.out.println(book);
        System.out.println(shirt);
        System.out.println(phone);

        // Apply discounts
        ProductCatalog.applyDiscount(book, 10); // 10% discount
        ProductCatalog.applyDiscount(shirt, 15); // 15% discount
        ProductCatalog.applyDiscount(phone, 5); // 5% discount

        // Display new prices
        System.out.println("\nPrices after Discount:");
        System.out.println(book);
        System.out.println(shirt);
        System.out.println(phone);
    }
}
