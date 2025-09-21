package com.demo.Service;

import java.util.List;

import com.demo.Online_Food_System.Entity.Payment;

public interface PaymentService {
    Payment createPayment(Payment payment);
    Payment getPayment(int paymentId);
    List<Payment> getAllPayments();
    Payment updatePayment(Payment payment);
    void deletePayment(int paymentId);
}
