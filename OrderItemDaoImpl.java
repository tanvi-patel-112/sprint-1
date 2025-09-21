package com.demo.DAOIMPL;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.demo.Dao.OrderDAO;
import com.demo.Online_Food_System.Entity.HibernateUtil;
import com.demo.Online_Food_System.Entity.Order;
import com.demo.Online_Food_System.Entity.OrderItem;

public class OrderItemDaoImpl implements OrderDAO {

	@Override
    public OrderItem createOrderItem(OrderItem orderItem) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(orderItem);
        tx.commit();
        session.close();
        return orderItem;
    }

    @Override
    public OrderItem getOrderItem(int orderItemId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        OrderItem oi = session.get(OrderItem.class, orderItemId);
        session.close();
        return oi;
    }

    @Override
    public OrderItem updateOrderItem(OrderItem orderItem) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.update(orderItem);
        tx.commit();
        session.close();
        return orderItem;
    }

    @Override
    public void deleteOrderItem(int orderItemId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        OrderItem oi = session.get(OrderItem.class, orderItemId);
        if (oi != null) {
            session.delete(oi);
        }
        tx.commit();
        session.close();
    }

	@Override
	public Order createOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order getOrder(int orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order updateOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteOrder(int orderId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Order updateOrder(OrderItem orderItem) {
		// TODO Auto-generated method stub
		return null;
	}
}
