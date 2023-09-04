package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop implements DeliveryProcess {
    private List<Product> products;

    public ExtraFoodShop() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public boolean checkDeliverySuccess() {
        if (!products.isEmpty()) {
            System.out.println("Your delivery from ExtraFoodShop has been completed successfully");
            return true;
        } else {
            System.out.println("There were no products in the delivery from ExtraFoodShop");
            return false;
        }
    }
}