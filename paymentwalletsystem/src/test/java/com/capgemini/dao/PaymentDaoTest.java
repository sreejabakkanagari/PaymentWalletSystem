package com.capgemini.dao;



import com.capgemini.bean.WalletApplication;
import com.capgemini.paymentwalletsystem.WalletApplicationMain;
import com.capgemini.service.WalletApplicationService;

import junit.framework.TestCase;

public class PaymentDaoTest extends TestCase {
	
WalletApplicationService service = new WalletApplicationService();

WalletApplication bean=new WalletApplication();

	public void testCreateAccount() {
		
		
		assertEquals(true,service.createAccount(bean));
		assertNotNull(bean);
	}

	public void testWithdrawAmount() {
		
		assertEquals(5000,service.withdraw(1000));
		assertNotNull(bean);
		assertTrue(true);
	}

	public void testDepositAmount() {
		assertEquals(287,service.deposit(3000));
		assertNotSame(1234,0);
		assertNotNull(bean);
		
	}

	public void testShowBalance() {
		assertEquals(4000,4000);
		assertNotSame(78,0);
		assertEquals(400,service.showBalance());
		assertNotNull(bean);
	}

	public void testTransferFunds() {
		assertEquals(400,bean.getAccNo());
		assertNotSame(567,0);
		assertNotNull(bean);
		
	}

	
		
	}


