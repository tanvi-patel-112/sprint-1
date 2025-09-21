package com.demo.Dao;

import java.util.List;

import com.demo.Online_Food_System.Entity.Payment;

public interface PaymentDAO {
    Payment createPayment(Payment payment);
    Payment getPayment(String paymentId);
    List<Payment> getAllPayments();
    Payment updatePayment(Payment payment);
    void deletePayment(int paymentId);
	Payment getPayment(int paymentId);
}
