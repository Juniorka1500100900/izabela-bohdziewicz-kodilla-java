package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class OrderRetriever {
    public void retrieveAndPrintSuppliersAndProducts() {
        List<Supplier> suppliers = new ArrayList<>();

        Supplier extraFoodShop = new Supplier("ExtraFoodShop");
        Supplier glutenFreeShop = new Supplier("GlutenFreeShop");
        Supplier healthyShop = new Supplier("HealthyShop");

        extraFoodShop.getProducts().add(new Product("Bananas", 89.90));
        extraFoodShop.getProducts().add(new Product("Fries", 167.00));
        glutenFreeShop.getProducts().add(new Product("Bread full of gluten", 6.66));
        healthyShop.getProducts().add(new Product("Snickers bars", 999.99));

        suppliers.add(extraFoodShop);
        suppliers.add(glutenFreeShop);
        suppliers.add(healthyShop);

        for (Supplier supplier : suppliers) {
            supplier.checkDeliverySuccess();
            System.out.println("Supplier: " + supplier.getSuppplierName());
            System.out.println("Products:");
            for (Product product : supplier.getProducts()) {
                System.out.println("  - " + product.getProductName() + ": $" + product.getProductPrice());
            }
        }
    }
}