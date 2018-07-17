package com.capgemini.bean;

import java.time.LocalDate;

import com.capgemini.paymentwalletsystem.WalletApplicationMain;

import junit.framework.TestCase;

public class WalletApplicationTest extends TestCase {
	WalletApplication account1=new WalletApplication();
	public void testGetAccNo() {
		account1.setAccNo(123456);
		assertNotSame(123456789,0);
		assertEquals(123456,account1.getAccNo());
		assertNotNull(account1);
	
	}
	public void testGetAmount() {
		account1.setAmount(678);
		assertNotSame(400,0);
		assertEquals(678.0,account1.getAmount());
		assertNotNull(account1);
	}

	public void testGetTid() {
		account1.setTid(456);
		assertNotSame(456,0);
		assertEquals(456,account1.getTid());
		assertNotNull(account1);
	}
	public void testGetDate() {
		account1.setDate(LocalDate.now());
		assertEquals(LocalDate.now(),account1.getDate());
        assertNotNull(account1);
	}
	

}
