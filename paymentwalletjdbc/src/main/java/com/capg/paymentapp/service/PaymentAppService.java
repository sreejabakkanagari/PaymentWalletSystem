package com.capg.paymentapp.service;

import com.capg.paymentapp.bean.Customer;
import com.capg.paymentapp.dao.PaymentAppDao;

public class PaymentAppService implements IPaymentAppService {
	PaymentAppDao dao=new PaymentAppDao();
	Customer customer=new Customer();

	public boolean createAccount(Customer customer) {
		// TODO Auto-generated method stub
		return dao.createAccount(customer);
	}

	public double showBalance() {
		// TODO Auto-generated method stub
		return dao.showBalance();
	}

	public boolean deposit(double amount) {
		// TODO Auto-generated method stub
		return dao.deposit(amount);
	}

	public boolean login(String user_ID, String password) {
		// TODO Auto-generated method stub
		return dao.login(user_ID,password);
	}

	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		return dao.withdraw(amount);
	}

	public boolean fundTransfer(long receiverAccountNumber, double amount) {
		// TODO Auto-generated method stub
		return dao.fundTransfer(receiverAccountNumber,amount);
	}

	public void printTransaction() {
		// TODO Auto-generated method stub
		dao.printTransaction();
		
	}

	
	
	
	
	
	
}
