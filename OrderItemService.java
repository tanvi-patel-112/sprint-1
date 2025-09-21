package com.demo.Service;

import java.util.List;

import com.demo.Online_Food_System.Entity.OrderItem;

public interface OrderItemService {
    OrderItem createOrderItem(OrderItem orderItem);
    OrderItem getOrderItem(int orderItemId);
    List<OrderItem> getAllOrderItems();
    OrderItem updateOrderItem(OrderItem orderItem);
    void deleteOrderItem(int orderItemId);
}
