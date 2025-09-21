package com.demo.ServiceImpl;

import java.util.List;

import com.demo.DAOIMPL.PaymentDaoImpl;
import com.demo.Dao.PaymentDAO;
import com.demo.Online_Food_System.Entity.Payment;
import com.demo.Service.PaymentService;

public class PaymentServiceImple implements PaymentService {

    PaymentDAO paymentDao = new PaymentDaoImpl();

    @Override
    public Payment createPayment(Payment payment) {
        return paymentDao.createPayment(payment);
    }

    @Override
    public Payment getPayment(int paymentId) {
        return paymentDao.getPayment(paymentId);
    }

    @Override
    public Payment updatePayment(Payment payment) {
        return paymentDao.updatePayment(payment);
    }

    @Override
    public void deletePayment(int paymentId) {
        paymentDao.deletePayment(paymentId);
    }

	@Override
	public List<Payment> getAllPayments() {
		// TODO Auto-generated method stub
		return null;
	}
}