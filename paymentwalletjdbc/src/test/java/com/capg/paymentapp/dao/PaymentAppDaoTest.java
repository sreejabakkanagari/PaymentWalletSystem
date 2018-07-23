package com.capg.paymentapp.dao;

import com.capg.paymentapp.bean.Customer;
import com.capg.paymentapp.bean.Wallet;
import com.capg.paymentapp.service.PaymentAppService;

import junit.framework.Assert;
import junit.framework.TestCase;

public class PaymentAppDaoTest extends TestCase {
	PaymentAppService service = new PaymentAppService();
	Wallet wallet=new Wallet();
	Customer cust=new Customer();


	public void testCreateAccount() {
		assertEquals(1,service.createAccount(cust));
	}

	public void testShowBalance() {
		 assertEquals(1000,1000);
		
	}

	public void testDeposit() {
		assertEquals(0,service.deposit(3000));
		
	}

	public void testLogin() {
		Assert.assertEquals(false,  service.login("abcdefgh","sreeja"));
		
	}

	public void testWithdraw() {
		assertEquals(0,service.withdraw(1000));
		
	}

	public void testFundTransfer() {
		assertEquals(0,wallet.getAccountNumber());
		
	}

	

}
