package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;

public class ProductOrderRetriever {

    public ProductOrderRequest retrieve() {
        User user = new User("Iza", "Markiza", "Sportowa 5 98800 Tworki",
                "iza@markiza.com", "958292922");

        LocalDateTime orderDate = LocalDateTime.now();
        Product product = new Product("Wibrator Wesoły Nigeryjczyk", "69666", 58.45);

        return new ProductOrderRequest(user, orderDate, product);
    }

}
