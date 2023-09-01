package com.kodilla.good.patterns.challenges.allegro;

public class ProductOrderProcessor {
    private InformationService informationService;
    private ProductOrderService productOrderService;
    private OrderRepository orderRepository;

    public ProductOrderProcessor(final InformationService informationService,
                                 final ProductOrderService productOrderService,
                                 final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.orderRepository = orderRepository;
    }

    public ProductOrderDTO process(ProductOrderRequest productOrderRequest) {
        boolean isSuccesfullyBought = productOrderService.bought((productOrderRequest.getUser()),
                productOrderRequest.getOrderDate(),
                productOrderRequest.getProduct());

        if (isSuccesfullyBought){
            informationService.inform(productOrderRequest.getUser());
            orderRepository.createOrder(productOrderRequest.getUser(), productOrderRequest.getOrderDate(), productOrderRequest.getProduct());
            return new ProductOrderDTO(productOrderRequest.getUser(), productOrderRequest.getOrderDate(), productOrderRequest.getProduct(),true);
        } else {
            return new ProductOrderDTO(productOrderRequest.getUser(),productOrderRequest.getOrderDate(), productOrderRequest.getProduct(), false);
        }
    }


}
