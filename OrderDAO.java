package com.demo.Dao;

import java.util.List;

import com.demo.Online_Food_System.Entity.Order;
import com.demo.Online_Food_System.Entity.OrderItem;

public interface OrderDAO {
    Order createOrder(Order order);
    Order getOrder(int orderId);
    List<Order> getAllOrders();
    Order updateOrder(OrderItem orderItem);
    void deleteOrder(int orderId);
	OrderItem createOrderItem(OrderItem orderItem);
	OrderItem getOrderItem(int orderItemId);
	OrderItem updateOrderItem(OrderItem orderItem);
	Order updateOrder(Order order);
	void deleteOrderItem(int orderItemId);
}
