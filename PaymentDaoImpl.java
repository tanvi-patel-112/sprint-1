package com.demo.DAOIMPL;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.demo.Dao.PaymentDAO;
import com.demo.Online_Food_System.Entity.HibernateUtil;
import com.demo.Online_Food_System.Entity.Payment;

public class PaymentDaoImpl implements PaymentDAO {

    @Override
    public Payment createPayment(Payment payment) {
        try (Session session = HibernateUtil.getSession()) {
            session.beginTransaction();
            session.save(payment);
            session.getTransaction().commit();
            return payment;
        } catch (HibernateException e) {
            System.out.println("Hibernate Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        return null;
    }

    @Override
    public Payment getPayment(int paymentId) {
        try (Session session = HibernateUtil.getSession()) {
            Payment payment = session.get(Payment.class, paymentId);
            return payment;
        } catch (HibernateException e) {
            System.out.println("Hibernate Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        return null;
    }

    @Override
    public Payment updatePayment(Payment payment) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.update(payment);
        tx.commit();
        session.close();
        return payment;
    }

    @Override
    public void deletePayment(int paymentId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Payment pay = session.get(Payment.class, paymentId);
        if (pay != null) {
            session.delete(pay);
        }
        tx.commit();
        session.close();
    }

	@Override
	public Payment getPayment(String paymentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Payment> getAllPayments() {
		// TODO Auto-generated method stub
		return null;
	}
}