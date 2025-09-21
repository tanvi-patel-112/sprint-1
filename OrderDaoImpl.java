package com.demo.DAOIMPL;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.demo.Dao.OrderDAO;
import com.demo.Online_Food_System.Entity.HibernateUtil;
import com.demo.Online_Food_System.Entity.Order;
import com.demo.Online_Food_System.Entity.OrderItem;

public class OrderDaoImpl implements OrderDAO {

    @Override
    public Order createOrder(Order order) {
        try (Session session = HibernateUtil.getSession()) {
            session.beginTransaction();
            session.save(order);
            session.getTransaction().commit();
            return order;
        } catch (HibernateException e) {
            System.out.println("Hibernate Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        return null;
    }

    @Override
    public Order getOrder(int orderId) {
        try (Session session = HibernateUtil.getSession()) {
            Order order = session.get(Order.class, orderId);
            return order;
        } catch (HibernateException e) {
            System.out.println("Hibernate Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        return null;
    }
    @Override
    public Order updateOrder(Order order) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.update(order);
        tx.commit();
        session.close();
        return order;
    }

    @Override
    public void deleteOrder(int orderId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Order ord = session.get(Order.class, orderId);
        if (ord != null) {
            session.delete(ord);
        }
        tx.commit();
        session.close();
    }

	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderItem createOrderItem(OrderItem orderItem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderItem getOrderItem(int orderItemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order updateOrder(OrderItem orderItem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderItem updateOrderItem(OrderItem orderItem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteOrderItem(int orderItemId) {
		// TODO Auto-generated method stub
		
	}
}
