package com.demo.ServiceImpl;

import java.util.List;

import com.demo.DAOIMPL.OrderItemDaoImpl;
import com.demo.Dao.OrderDAO;
import com.demo.Online_Food_System.Entity.OrderItem;
import com.demo.Service.OrderItemService;

public class OrderItemServiceImple implements OrderItemService {

    OrderDAO orderItemDao = new OrderItemDaoImpl();

    @Override
    public OrderItem createOrderItem(OrderItem orderItem) {
        return orderItemDao.createOrderItem(orderItem);
    }

    @Override
    public OrderItem getOrderItem(int orderItemId) {
        return orderItemDao.getOrderItem(orderItemId);
    }

    @Override
    public OrderItem updateOrderItem(OrderItem orderItem) {
        return orderItemDao.updateOrderItem(orderItem);
    }

    @Override
    public void deleteOrderItem(int orderItemId) {
        orderItemDao.getOrderItem(orderItemId);
    }

	@Override
	public List<OrderItem> getAllOrderItems() {
		// TODO Auto-generated method stub
		return null;
	}
}