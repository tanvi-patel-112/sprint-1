package com.demo.Dao;

import java.util.List;

import com.demo.Online_Food_System.Entity.Order;
import com.demo.Online_Food_System.Entity.OrderItem;

public interface OrderItemDAO {
    Order createOrderItem(Order orderItem);
    OrderItem getOrderItem(String orderItemId);
	OrderItem createOrderItem(OrderItem orderItem);
    List<OrderItem> getAllOrderItems();
    OrderItem updateOrderItem(OrderItem orderItem);
    boolean deleteOrderItem(int orderItemId);
}
