package com.capgemini.dao;

import java.util.List;

import com.capgemini.bean.WalletApplication;

public interface IWalletApplicationDao {
	public int createAccount(WalletApplication details);
	public boolean login(String username,String password);
	public double showBalance();
	public int deposit(double amount);
	public int withdraw(double amount);
	public int fundTransfer(long accNo,double amount);
	public List<String> printTrans();
}
