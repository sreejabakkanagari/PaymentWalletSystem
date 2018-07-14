package com.capgemini.service;

import java.util.List;

import com.capgemini.bean.WalletApplication;
import com.capgemini.dao.WalletApplicationDao;

public class WalletApplicationService implements IWalletApplicationService{
	WalletApplicationDao dao=new WalletApplicationDao();
	
	public int createAccount(WalletApplication details) {
		// TODO Auto-generated method stub
		return dao.createAccount(details);
	}
	

	public boolean login(String username, String password) {
		
		return dao.login(username, password);
	}

	public double showBalance() {
		// TODO Auto-generated method stub
		return dao.showBalance();
	}

	public int deposit(double amount) {
		// TODO Auto-generated method stub
		return dao.deposit(amount);
	}

	public int withdraw(double amount) {
		// TODO Auto-generated method stub
		return dao.withdraw(amount);
	}

	public int fundTransfer(long accNo, double amount) {
		// TODO Auto-generated method stub
		return dao.fundTransfer(accNo, amount);
	}

	public List<String> printTrans() {
		// TODO Auto-generated method stub
		return dao.printTrans();
	}

	

	

	
	
}