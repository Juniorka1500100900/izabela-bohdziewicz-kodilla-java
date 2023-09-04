package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class Supplier {
    private String suppplierName;
    private List<Product> products;
    public Supplier(String suppplierName) {
        this.suppplierName = suppplierName;
        this.products = new ArrayList<>();
    }
    public String getSuppplierName() {
        return suppplierName;
    }

    public List<Product> getProducts() {
        return products;
    }

    public boolean checkDeliverySuccess() {
        return false;
    }
}
