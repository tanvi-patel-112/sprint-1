package com.demo.DAOIMPL;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.demo.Dao.MenuItemDA0;
import com.demo.Online_Food_System.Entity.HibernateUtil;
import com.demo.Online_Food_System.Entity.MenuItem;

public class MenuItemDaoImpl implements MenuItemDA0 {

    @Override
    public MenuItem createMenuItem(MenuItem menuItem) {
        try (Session session = HibernateUtil.getSession()) {
            session.beginTransaction();
            session.save(menuItem);
            session.getTransaction().commit();
            return menuItem;
        } catch (HibernateException e) {
            System.out.println("Hibernate Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        return null;
    }

    @Override
    public MenuItem getMenuItem(int itemId) {
        try (Session session = HibernateUtil.getSession()) {
            MenuItem menuItem = session.get(MenuItem.class, itemId);
            return menuItem;
        } catch (HibernateException e) {
            System.out.println("Hibernate Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        return null;
    }

    @Override
    public MenuItem updateMenuItem(MenuItem menuItem) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.update(menuItem);
        tx.commit();
        session.close();
        return menuItem;
    }

    @Override
    public void deleteMenuItem(int menuItemId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        MenuItem item = session.get(MenuItem.class, menuItemId);
        if (item != null) {
            session.delete(item);
        }
        tx.commit();
        session.close();
    }

	@Override
	public MenuItem getMenuItem(String menuItemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MenuItem> getAllMenuItems() {
		// TODO Auto-generated method stub
		return null;
	}
}
	