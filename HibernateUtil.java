package com.demo.Online_Food_System.Entity;

	import org.hibernate.Session;
import org.hibernate.SessionFactory;
	import org.hibernate.cfg.Configuration;

	public class HibernateUtil 
	{

		private static final SessionFactory sessionFactory = buildSessionFactory();
		private static SessionFactory buildSessionFactory() {
			try {
	  return new Configuration().configure("hibernate.cfg.xml")
			  .addAnnotatedClass(com.demo.Online_Food_System.Entity.User.class)
			  .addAnnotatedClass(com.demo.Online_Food_System.Entity.Restaurant.class)
			  .addAnnotatedClass(com.demo.Online_Food_System.Entity.MenuItem.class)
			  .addAnnotatedClass(com.demo.Online_Food_System.Entity.Order.class)
			  .addAnnotatedClass(com.demo.Online_Food_System.Entity.OrderItem.class)
			  .addAnnotatedClass(com.demo.Online_Food_System.Entity.Payment.class)
			  .buildSessionFactory();
			} catch (Throwable e) {
				throw new ExceptionInInitializerError(e);
			}
		}
		public static SessionFactory getSessionFactory() {
	        return sessionFactory;
		}
		public static Session getSession()
		{
		  return getSessionFactory().openSession(); //session opened
		}
	}

