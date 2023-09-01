package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;

public interface OrderRepository {
    void createOrder(User user, LocalDateTime orderDate, Product product);
}
