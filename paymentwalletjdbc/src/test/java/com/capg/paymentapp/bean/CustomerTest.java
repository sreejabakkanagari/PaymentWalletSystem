package com.capg.paymentapp.bean;

import junit.framework.TestCase;

public class CustomerTest extends TestCase {
	Customer bean = new Customer();

	public void testGetCustomerName() {
		bean.setCustomerName("sreeja");
		assertEquals("sreeja",bean.getCustomerName());
	
		assertNotNull(bean);
	}

	

	public void testGetAdharNumber() {
		bean.setAdharNumber(12345);
		assertNotNull(bean);
		assertEquals(12345,bean.getAdharNumber());
		
	}

	public void testGetAddress() {
		bean.setAddress("hyderabad");
		assertNotNull(bean);
		assertEquals("hyderabad",bean.getAddress());
		
	}

	public void testGetPhoneNumber() {
		bean.setPhoneNumber(1893411821);
		assertNotNull(bean);
		assertEquals(1893411821,bean.getPhoneNumber());

	}

	public void testGetGender() {
		bean.setGender("female");
		assertEquals("female",bean.getGender());
		
	     assertNotNull(bean);
		
	}

	public void testGetAge() {
		bean.setAge(24);
		assertEquals(24,bean.getAge());
		
	assertNotNull(bean);
	}

	public void testGetUser_ID() {
		bean.setUser_ID("sreeja");
		assertEquals("sreeja",bean.getUser_ID());
		assertNotNull(bean);
		
	}

	public void testGetPassword() {
		bean.setPassword("reddy@7");
		assertEquals("reddy@7",bean.getPassword());
		assertNotNull(bean);
		
	}

	

}
