package com.demo.DAOIMPL;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.demo.Dao.UserDAO;
import com.demo.Online_Food_System.Entity.HibernateUtil;
import com.demo.Online_Food_System.Entity.User;

public class UserDaoImpl implements UserDAO {

    @Override
    public User createUser(User user) {
        try (Session session = HibernateUtil.getSession()) {
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
            return user;
        } catch (HibernateException e) {
            System.out.println("Hibernate Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        return null;
    }

    @Override
    public User getUser(int userId) {
        try (Session session = HibernateUtil.getSession()) {
            User user = session.get(User.class, userId);
            return user;
        } catch (HibernateException e) {
            System.out.println("Hibernate Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        return null;
    }
    @Override
    public User updateUser(User user) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.update(user);
        tx.commit();
        session.close();
        return user;
    }

    @Override
    public void deleteUser(int userId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        User u = session.get(User.class, userId);
        if (u != null) {
            session.delete(u);
        }
        tx.commit();
        session.close();
    }

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
}

	