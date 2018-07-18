package com.capgemini.service;

import com.capgemini.bean.Customer;
import com.capgemini.bean.WalletApplication;

import junit.framework.TestCase;

public class WalletApplicationValidationTest extends TestCase {
	Customer pojo=new Customer();
	WalletApplication account1=new WalletApplication();


	public void testIsValidFirstName() {
		
		pojo.setFirstname("sreeja");
		assertEquals("sreeja",pojo.getFirstname());
	
		assertNotNull(pojo);
	
		
	}

	public void testIsValidLastname() {
		pojo.setLastname("reddy");
		assertEquals("reddy",pojo.getLastname());
	    assertNotSame("reddy", "");
		assertNotNull(pojo);
		assertNotSame("reddy",1234);
		
	}

	public void testIsValidGender() {
		pojo.setGender("female");
		assertEquals("female",pojo.getGender());
		
	     assertNotNull(pojo);
	}

	public void testIsValidAge() {
		
		pojo.setAge(24);
		assertEquals(24,pojo.getAge());
		assertNotSame(0,23);
	assertNotNull(pojo);
		
		
	}

	public void testIsValidEmail() {
		pojo.setEmail("abc@gmail.com");
		assertEquals("abc@gmail.com",pojo.getEmail());
		assertNotSame("abc@gmail.com", "");
		assertNotNull(pojo);
		
	}

	public void testIsValidUsername() {
		pojo.setUsername("sreeja");
		assertEquals("sreeja",pojo.getUsername());
		assertNotNull(pojo);
		
	}

	public void testIsValidPassword() {
		pojo.setPassword("reddy@7");
		assertEquals("reddy@7",pojo.getPassword());
		assertNotNull(pojo);
		
	}

	public void testIsValidAmount() {
		account1.setAmount(678);
		assertNotSame(400,0);
		assertEquals(678.0,account1.getAmount());
		assertNotNull(account1);
		
	}

}
