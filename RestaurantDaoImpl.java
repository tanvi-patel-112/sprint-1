package com.demo.DAOIMPL;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.demo.Dao.RestaurantDAO;
import com.demo.Online_Food_System.Entity.HibernateUtil;
import com.demo.Online_Food_System.Entity.Restaurant;

public  class RestaurantDaoImpl implements RestaurantDAO {

    @Override
    public Restaurant createRestaurant(Restaurant restaurant) {
        try (Session session = HibernateUtil.getSession()) {
            session.beginTransaction();
            session.save(restaurant);
            session.getTransaction().commit();
            return restaurant;
        } catch (HibernateException e) {
            System.out.println("Hibernate Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        return null;
    }

    @Override
    public Restaurant getRestaurant(int restaurantId) {
        try (Session session = HibernateUtil.getSession()) {
            Restaurant restaurant = session.get(Restaurant.class, restaurantId);
            return restaurant;
        } catch (HibernateException e) {
            System.out.println("Hibernate Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        return null;
    }

    @Override
    public Restaurant updateRestaurant(Restaurant restaurant) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.update(restaurant);
        tx.commit();
        session.close();
        return restaurant;
    }

    @Override
    public void deleteRestaurant(int restaurantId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Restaurant res = session.get(Restaurant.class, restaurantId);
        if (res != null) {
            session.delete(res);
        }
        tx.commit();
        session.close();
    }

	@Override
	public Restaurant getRestaurant(String restaurantId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Restaurant> getAllRestaurants() {
		// TODO Auto-generated method stub
		return null;
	}
}