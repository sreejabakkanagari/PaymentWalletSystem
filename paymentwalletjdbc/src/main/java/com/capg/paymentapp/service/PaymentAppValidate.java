package com.capg.paymentapp.service;

public class PaymentAppValidate {
	
	public boolean validatePhoneNo(long phoneNumber) {
		String p=Long.toString(phoneNumber);
	if (p.length()==10) {
		return true;
	}
	else {
		return false;
		
	}
		
	}
	public boolean validateCustomerName(String customerName) {
		if (customerName == null)
			return false;
		else
			return true;
	}

	public boolean validateGenderName(String genderName) {
		if (genderName.equalsIgnoreCase("female") || genderName.equalsIgnoreCase("Male"))
			return true;
		else
			return false;

}
}
