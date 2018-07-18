package com.capgemini.dao;

import com.capgemini.bean.WalletApplication;
import com.capgemini.service.WalletApplicationService;

import junit.framework.Assert;
import junit.framework.TestCase;

public class WalletApplicationDaoTest extends TestCase {
	
	WalletApplicationService service = new WalletApplicationService();

	WalletApplication bean=new WalletApplication();

	public void testCreateAccount() {
		
		assertEquals(1,service.createAccount(bean));
//		assertNotNull(bean);
//		Assert.assertTrue(true);
		
	}

	public void testLogin() {
		Assert.assertEquals(false,  service.login("abcdefgh","sreeja"));
		
	}

	public void testShowBalance() {
        assertEquals(0.0,service.showBalance());
		
//		assertEquals(400,service.showBalance());
//		assertNotNull(bean);
		
	}

	public void testDeposit() {
		assertEquals(0,service.deposit(3000));
//		assertNotSame(1234,0);
//		assertNotNull(bean);
		
	}

	public void testWithdraw() {
		assertEquals(0,service.withdraw(1000));
//		assertNotNull(bean);
//		Assert.assertTrue(true);
		
	}

	public void testFundTransfer() {
		assertEquals(0,bean.getAccNo());
//		assertNotSame(567,0);
//		assertNotNull(bean);
//		
	}

	public void testPrintTrans() {
		assertEquals(null,bean.getTrans());
		
	}

}
