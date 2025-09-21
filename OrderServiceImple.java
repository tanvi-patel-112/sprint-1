package com.demo.ServiceImpl;

import java.util.List;

import com.demo.DAOIMPL.OrderDaoImpl;
import com.demo.Dao.OrderDAO;
import com.demo.Online_Food_System.Entity.Order;
import com.demo.Service.OrderService;

public class OrderServiceImple implements OrderService {

    OrderDAO orderDao = new OrderDaoImpl();

    @Override
    public Order createOrder(Order order) {
        return orderDao.createOrder(order);
    }

    @Override
    public Order getOrder(int orderId) {
        return orderDao.getOrder(orderId);
    }

    @Override
    public Order updateOrder(Order order) {
        return orderDao.updateOrder(order);
    }

    @Override
    public void deleteOrder(int orderId) {
        orderDao.deleteOrder(orderId);
    }

	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return null;
	}
}