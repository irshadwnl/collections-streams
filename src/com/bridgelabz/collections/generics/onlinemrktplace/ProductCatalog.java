package com.bridgelabz.collections.generics.onlinemrktplace;

class ProductCatalog {
    // Generic method to apply discount
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discountAmount = product.getPrice() * (percentage / 100);
        double newPrice = product.getPrice() - discountAmount;
        product.setPrice(newPrice);
    }
}

