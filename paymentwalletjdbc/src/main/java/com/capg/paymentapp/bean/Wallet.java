package com.capg.paymentapp.bean;


import java.time.LocalDate;
import java.util.Date;

public class Wallet {
	private long accountNumber;
	private LocalDate date;
	private  double initialBalance;
	private long adharNumber;
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate localDate) {
		this.date = localDate;
	}
	public double getInitialBalance() {
		return initialBalance;
	}
	public void setInitialBalance(double initialBalance) {
		this.initialBalance = initialBalance;
	}
	public long getAdharNumber() {
		return adharNumber;
	}
	public void setAdharNumber(long adharNumber) {
		this.adharNumber = adharNumber;
	}
	@Override
	public String toString() {
		return "Wallet [accountNumber=" + accountNumber + ", date=" + date + ", initialBalance=" + initialBalance
				+ ", adharNumber=" + adharNumber + "]";
	}

	
	

}
