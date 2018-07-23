package com.capg.paymentapp.bean;


import java.time.LocalDate;

import junit.framework.TestCase;

public class WalletTest extends TestCase {
	Wallet account1=new Wallet();
	

	public void testGetAccountNumber() {
		
		
		account1.setAccountNumber(123456);
		assertNotSame(123456789,0);
		assertEquals(123456,account1.getAccountNumber());
		assertNotNull(account1);
		
	}

	public void testGetDate() {
		account1.setDate(LocalDate.now());
		assertEquals(LocalDate.now(),account1.getDate());
        assertNotNull(account1);
		
	}

	public void testGetInitialBalance() {
		account1.setInitialBalance(678);
		assertNotSame(400,0);
		assertEquals(678.0,account1.getInitialBalance());
		assertNotNull(account1);
		
	}

	public void testGetAdharNumber() {
		account1.setAdharNumber(12345);
		assertNotNull(account1);
		assertEquals(12345,account1.getAdharNumber());
		
	}

}
