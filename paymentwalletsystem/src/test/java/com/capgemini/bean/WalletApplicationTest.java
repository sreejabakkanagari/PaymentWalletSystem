package com.capgemini.bean;

import com.capgemini.paymentwalletsystem.WalletApplicationMain;

import junit.framework.TestCase;

public class WalletApplicationTest extends TestCase {
	WalletApplication account1=new WalletApplication();
	Customer pojo=new Customer();

	public void testGetFirstname() {
		assertEquals("valid","sreeja",pojo.getFirstname());
		assertNotSame("sreeja","");
		assertNotNull(pojo);
		assertSame("sreeja",1234);
	}

	public void testGetLastname() {
		assertEquals("valid","reddy",pojo.getLastname());
		assertNotSame("reddy", "");
		assertNotNull(pojo);
		assertNotSame("reddy",1234);
		
	}

	public void testGetMobilenumber() {
		assertEquals(789341,pojo.getMobileNo());
		assertNotSame(78934,0);
		assertNotSame(78934,123);
		assertNotNull(pojo);
	}

	public void testGetEmail() {
		assertEquals("abc@gmail.com",pojo.getEmail());
	
		assertNotSame("abc@gmail.com", "");
		assertNotNull(pojo);
		
		
		
	}

	public void testGetAccountnumber() {
		assertNotSame("123456789",0);
		assertEquals(12345,account1.getAccNo());
		assertNotNull(account1);
	}

	public void testGetAmount() {
		assertNotSame(400,0);
		assertEquals(67889,account1.getAmount());
		assertNotNull(account1);
	}

	public void testGetTid() {
		assertNotSame(456,0);
		assertEquals(456,account1.getTid());
		assertNotNull(account1);
	}
	/*public void testGetAdharcardNumber() {
		assertEquals(67899565,account1.getAdharnumber());
		assertNotSame(67899565,0);
		assertNotNull(account1);
		assertSame("aadharnumber",123456,123456);
	}*/

}
