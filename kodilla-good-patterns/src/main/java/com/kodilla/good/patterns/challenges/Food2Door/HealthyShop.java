package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop implements DeliveryProcess{
    private List<Product> products;

    public HealthyShop() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public boolean checkDeliverySuccess() {
        if (!products.isEmpty()) {
            System.out.println("Yo you, delivery from HealthyShop is completed!");
            return true;
        } else {
            System.out.println("Nothing there from our lovely HealthyShop.");
            return false;
        }
    }
}