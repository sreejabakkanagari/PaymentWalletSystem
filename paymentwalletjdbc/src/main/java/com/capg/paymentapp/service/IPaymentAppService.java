package com.capg.paymentapp.service;

import com.capg.paymentapp.bean.Customer;

public interface IPaymentAppService {
	public boolean createAccount(Customer customer);
	public double showBalance();
	public boolean deposit(double amount);
	public boolean login(String user_ID,String password);
	public boolean withdraw(double amount);
	public boolean fundTransfer(long receiverAccountNumber,double amount);
	public void printTransaction();
	
	
	
	
	
	
	
	
	
}
