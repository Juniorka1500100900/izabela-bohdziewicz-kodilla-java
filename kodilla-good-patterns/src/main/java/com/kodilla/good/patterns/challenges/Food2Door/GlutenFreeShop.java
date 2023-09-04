package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop implements DeliveryProcess{
    private List<Product> products;

    public GlutenFreeShop() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public boolean checkDeliverySuccess() {
        if (!products.isEmpty()) {
            System.out.println("Your delivery from GlutenFreeShop was successful.");
            return true;
        } else {
            System.out.println("There was no delivery from GlutenFreeShop!");
            return false;
        }
    }
}