package com.capgemini.bean;

import junit.framework.TestCase;

public class CustomerTest extends TestCase {
	Customer pojo=new Customer();

	public void testGetFirstname() {
		pojo.setFirstname("sreeja");
		assertEquals("sreeja",pojo.getFirstname());
	
		assertNotNull(pojo);
	
	}

	public void testGetLastname() {
		pojo.setLastname("reddy");
		assertEquals("reddy",pojo.getLastname());
	    assertNotSame("reddy", "");
		assertNotNull(pojo);
		assertNotSame("reddy",1234);
	}

	public void testGetGender() {
		pojo.setGender("female");
		assertEquals("female",pojo.getGender());
		
	     assertNotNull(pojo);
	}

	public void testGetMobileNo() {
		pojo.setMobileNo("7893411821");
		assertEquals("7893411821",pojo.getMobileNo());
		assertNotSame(78934,0);
		assertNotSame(78934,123);
		assertNotNull(pojo);
	}

	public void testGetAge() {
		pojo.setAge(24);
		assertEquals(24,pojo.getAge());
		assertNotSame(0,23);
	assertNotNull(pojo);
		
	}

	public void testGetEmail() {
		pojo.setEmail("abc@gmail.com");
		assertEquals("abc@gmail.com",pojo.getEmail());
		assertNotSame("abc@gmail.com", "");
		assertNotNull(pojo);
		
	}

	public void testGetUsername() {
		pojo.setUsername("sreeja");
		assertEquals("sreeja",pojo.getUsername());
		assertNotNull(pojo);
		
		
		
	}

	public void testGetPassword() {
		
		pojo.setPassword("reddy@7");
		assertEquals("reddy@7",pojo.getPassword());
		assertNotNull(pojo);
		
	}

}
