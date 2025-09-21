package com.demo.Service;

import java.util.List;

import com.demo.Online_Food_System.Entity.Order;

public interface OrderService {
    Order createOrder(Order order);
    Order getOrder(int orderId);
    List<Order> getAllOrders();
    Order updateOrder(Order order);
    void deleteOrder(int orderId);
}
