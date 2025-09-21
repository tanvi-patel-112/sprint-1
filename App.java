package com.demo.Operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.Online_Food_System.Entity.HibernateUtil;

public class App 
{
    public static void main( String[] args )
    {
        //get sessionFactory
    	SessionFactory factory=HibernateUtil.getSessionFactory();
    	//create a session(connection)
    	Session session=factory.openSession();
    	
    	//Begin a Transaction
    	Transaction tx=session.beginTransaction();
    	
    	//transient state
    	
    	//save the Student Object(insert query will execute)
    	
//    	session.save(student1);//persistent state
//    	session.save(student2);
    	
    	//commit the transaction
    	//tx.commit();
    	
//    	//fetch the object
//    	Student student=session.load(Student.class, "S101");
//    	System.out.println(student.getFirstName());
    	
    	//close session
    	session.close();
    	
    	//close Session factory
    	
    	factory.close();
    }
}
