package com.kanechan.ordersolid.domain;

public class OrderCalculator {

    public double calculateTotal(Order order) {
        return order.getItems()
                    .stream()
                    .mapToDouble(item -> item.getPreco())
                    .sum();
    }
}
