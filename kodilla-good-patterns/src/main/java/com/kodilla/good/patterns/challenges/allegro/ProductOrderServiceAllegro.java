package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;

public class ProductOrderServiceAllegro implements ProductOrderService{

    @Override
    public boolean bought(User user, LocalDateTime orderDate, Product product) {
        System.out.println("User: " + user.getUserName() + " " + user.getUserSurname() +
                ", address: " + user.getUserAddress()+ ", email: " + user.getUserEMail()+
                ", phone number: " + user.getUserPhoneNumber() + ".");
        System.out.println("Order date: " + orderDate + ".");
        System.out.println("Product bought: " + product.getProductName() + ", product ID: "
                + product.getProductID() + ", product price: " + product.getProductPrice() + "zł.");
        return true;
    }
}

