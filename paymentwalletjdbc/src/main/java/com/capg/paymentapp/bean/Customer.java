package com.capg.paymentapp.bean;

public class Customer {
private String customerName;
private long adharNumber;
private String address;
private long phoneNumber;
private String gender;
private int age;
private String user_ID;
private String password;
private Wallet wallet;
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public long getAdharNumber() {
	return adharNumber;
}
public void setAdharNumber(long adharNo) {
	this.adharNumber = adharNo;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(long phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getUser_ID() {
	return user_ID;
}
public void setUser_ID(String user_ID) {
	this.user_ID = user_ID;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Wallet getWallet() {
	return wallet;
}
public void setWallet(Wallet wallet) {
	this.wallet = wallet;
}
@Override
public String toString() {
	return "Customer [customerName=" + customerName + ", adharNumber=" + adharNumber + ", address=" + address
			+ ", phoneNumber=" + phoneNumber + ", gender=" + gender + ", age=" + age + ", user_ID=" + user_ID
			+ ", password=" + password + ", wallet=" + wallet + "]";
}




	
	
	
	
}
