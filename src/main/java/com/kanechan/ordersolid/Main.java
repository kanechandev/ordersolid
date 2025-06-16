package com.kanechan.ordersolid;

import com.kanechan.ordersolid.domain.Item;
import com.kanechan.ordersolid.domain.Order;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        order.addItem(new Item("Notebook", 3500.00));
        order.addItem(new Item("Mouse", 150.00));

        System.out.printf("Total do pedido: R$ %.2f%n", order.calculateTotal());
    }
}
