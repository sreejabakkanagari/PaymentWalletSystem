package com.capg.paymentapp.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.capg.paymentapp.bean.Customer;
import com.capg.paymentapp.util.DBUtil;

public class PaymentAppDao  implements IPaymentDao{
	Connection connect;
	static double d, t;
	public static ResultSet res1;
	public static ResultSet res2, res3, res4;

	public boolean createAccount(Customer customer) {
		int n1 = 0;
		int n2 = 0;
		try {
			connect = DBUtil.getConnection();
			String insertquery1 = "insert into customer values( ?,?,?,?,?,?,?,?)";

			java.sql.PreparedStatement pstmt1 = connect.prepareStatement(insertquery1);
			pstmt1.setString(1, customer.getCustomerName());
			pstmt1.setLong(2, customer.getAdharNumber());
			pstmt1.setString(3, customer.getAddress());

			pstmt1.setLong(4, customer.getPhoneNumber());
			pstmt1.setString(5, customer.getGender());
			pstmt1.setInt(6, customer.getAge());
			pstmt1.setString(7, customer.getUser_ID());
			pstmt1.setString(8, customer.getPassword());

			String insertquery2 = "insert into wallet values( ?,curdate(),?,?)";
			java.sql.PreparedStatement pstmt2 = connect.prepareStatement(insertquery2);
			pstmt2.setLong(1, customer.getWallet().getAccountNumber());
			pstmt2.setDouble(2, customer.getWallet().getInitialBalance());
			pstmt2.setLong(3, customer.getWallet().getAdharNumber());
			n1 = pstmt1.executeUpdate();
			n2 = pstmt2.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		if (n1 == 1 && n2 == 1) {

			return true;
		} else
			return false;
	}

	public double showBalance() {

		try {
			
			if (res2.first()) {
				d = res2.getDouble(3);
				return d;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return d;
	}

	public boolean deposit(double amount) {
		try {

			if (res2.first()) {

				d = res2.getDouble(3) + amount;
				String updatequery = "update wallet set initialBalance='" + d + "' where adharNo='" + res2.getDouble(4)
						+ "'";

				String select = "select * from wallet where adharNo='" + res2.getDouble(4) + "'";
				java.sql.PreparedStatement stmt = connect.prepareStatement(updatequery);
				long tid = (long) (Math.random() * 1234 + 1234);
				String s = "Deposited " + Double.toString(amount) + "with transaction id " + Long.toString(tid);
				String insert = "insert into transactions values('" + res2.getDouble(4) + "','" + s + "')";

				int r = stmt.executeUpdate();
				res2 = stmt.executeQuery(select);
				if (r == 1) {
					java.sql.PreparedStatement pstmt = connect.prepareStatement(insert);
					pstmt.executeUpdate();
					return true;
				}

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return false;
	}

	public boolean login(String user_ID, String password) {
		try {
			connect = DBUtil.getConnection();
			java.sql.Statement stmt1 = connect.createStatement();
			String selectquery1 = "select * from customer where user_ID='" + user_ID + "' and password='" + password
					+ "'";
			res1 = stmt1.executeQuery(selectquery1);
			if (res1.first()) {
				int k = res1.getInt(2);

				java.sql.Statement stmt2 = connect.createStatement();
				String selectquery2 = "select * from wallet where adharNo='" + k + "'";
				res2 = stmt2.executeQuery(selectquery2);
				return true;
			}

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return false;
	}

	public boolean withdraw(double amount) {
		try {
			if (res2.first()) {

				d = res2.getDouble(3) - amount;
				long tid = (long) (Math.random() * 1234 + 1234);
				String s = "Withdrawn " + Double.toString(amount) + "with transaction id " + Long.toString(tid);

				String withdraw = "insert into transactions values('" + res2.getDouble(4) + "','" + s + "')";

				String updatequery = "update wallet set initialBalance='" + d + "' where adharNo='" + res2.getDouble(4)
						+ "'";

				String select = "select * from wallet where adharNo='" + res2.getDouble(4) + "'";
				java.sql.PreparedStatement stmt = connect.prepareStatement(updatequery);
				int r = stmt.executeUpdate();
				res2 = stmt.executeQuery(select);
				if (r == 1) {
					java.sql.PreparedStatement pstmt = connect.prepareStatement(withdraw);
					pstmt.executeUpdate();
					return true;
				}

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return false;
	}

	public boolean fundTransfer(long receiverAccountNumber, double amount) {
		int r = 0, r1 = 0;
		try {
			String sel = "select * from wallet where accountNumber=" + receiverAccountNumber;
			java.sql.PreparedStatement smt = connect.prepareStatement(sel);
			res3 = smt.executeQuery();
			if (res2.first()) {
				d = res2.getDouble(3) - amount;
				long tid = (long) (Math.random() * 1234 + 1234);
				String s = "Transfered " + Double.toString(amount) + "with transaction id " + Long.toString(tid);
				String transfer = "insert into transactions values('" + res2.getDouble(4) + "','" + s + "')";
				String updatequery = "update wallet set initialBalance=" + d + " where adharNo=" + res2.getDouble(4);

				java.sql.PreparedStatement stmt = connect.prepareStatement(updatequery);

				r = stmt.executeUpdate();
				String select = "select * from wallet where adharNo=" + res2.getDouble(4);
				res2 = stmt.executeQuery(select);
				java.sql.PreparedStatement pstmt = connect.prepareStatement(transfer);
				pstmt.executeUpdate();

			}
			if (res3.first()) {
				d = res3.getDouble(3) + amount;
				long tid = (long) (Math.random() * 1234 + 1234);
				String s = "Recieved " + Double.toString(amount) + "with transaction id " + Long.toString(tid);

				String recieve = "insert into transactions values('" + res3.getDouble(4) + "','" + s + "')";

				String updatequery = "update wallet set initialBalance=" + d + " where adharNo=" + res3.getDouble(4);

				java.sql.PreparedStatement stmt = connect.prepareStatement(updatequery);

				r1 = stmt.executeUpdate();
				java.sql.PreparedStatement pstmt = connect.prepareStatement(recieve);
				pstmt.executeUpdate();
			}
			if (r == 1 && r1 == 1) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public void printTransaction() {

		try {
			connect= DBUtil.getConnection();
			if (res2.first()) {
				d = res2.getDouble(4);
				String select = "select * from transactions where adharNo='" + d + "'";
				java.sql.PreparedStatement stmt = connect.prepareStatement(select);
				res4 = stmt.executeQuery();
				while (res4.next()) {
					System.out.println(res4.getString(2));
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	

	



}

	
	
	
	
	


