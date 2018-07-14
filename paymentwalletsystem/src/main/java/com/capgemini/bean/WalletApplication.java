package com.capgemini.bean;

import java.time.LocalDate;
import java.util.List;

public class WalletApplication {

	
	private long accNo;
	private LocalDate date;
	private double amount;
	private long tid;
	private Customer cust; 
	private List<String> trans;
	
	
	public List<String> getTrans() {
		return trans;
	}
	public void setTrans(List<String> trans) {
		this.trans = trans;
	}
	public Customer getCust() {
		return cust;
	}
	public void setCust(Customer cust) {
		this.cust = cust;
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public long getTid() {
		return tid;
	}
	public void setTid(long tid) {
		this.tid = tid;
	}
	@Override
	public String toString() {
		return "WalletApplication [accNo=" + accNo + ", date=" + date + ", amount=" + amount + ", tid=" + tid + "]";
	}
	
	
	
}