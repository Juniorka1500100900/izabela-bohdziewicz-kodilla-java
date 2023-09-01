package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;

public class ProductOrderDTO {
    private User user;
    private LocalDateTime orderDate;
    private Product product;
    private boolean isSuccesfullyBought;

    public ProductOrderDTO(final User user, final LocalDateTime orderDate, final Product product, final boolean isSuccesfullyBought) {
        this.user = user;
        this.orderDate = orderDate;
        this.product = product;
        this.isSuccesfullyBought = isSuccesfullyBought;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isSuccesfullyBought() {
        return isSuccesfullyBought;
    }
}
