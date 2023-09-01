package com.kodilla.good.patterns.challenges.allegro;

public class AllegroApp {
    public static void main(String[] args) {
        ProductOrderRetriever productOrderRetriever = new ProductOrderRetriever();
        ProductOrderRequest productOrderRequest = productOrderRetriever.retrieve();

        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(new MailService(),
                new ProductOrderServiceAllegro(), new ProductOrderRepository());
        productOrderProcessor.process(productOrderRequest);

    }
}


