package com.kodilla.good.patterns.challenges.allegro;

public class Product {
    private String productName;
    private String productID;
    private double productPrice;

    public Product (String productName, String productID, double productPrice) {
        this.productName = productName;
        this.productID = productID;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductID() {
        return productID;
    }

    public double getProductPrice() {
        return productPrice;
    }
}
