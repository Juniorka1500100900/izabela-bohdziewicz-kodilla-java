package com.kodilla.patterns.factory.tasks;


public class TaskFactory {
    public static final String DRIVING_TASK = "DRIVING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String SHOPPING_TASK = "SHOPPING_TASK";

    public final Task executeTask(final String TaskClass) {
        return switch (TaskClass) {
            case DRIVING_TASK -> new DrivingTask("Drive like crazy", "McDonalds", "Fiat Multipla");
            case PAINTING_TASK -> new PaintingTask("Paint", "brown", "bear");
            case SHOPPING_TASK -> new ShoppingTask("Buy on Amazon", "an interesting book",1.0);
            default -> null;
        };
    }
}