package com.capg.paymentapp.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.capg.paymentapp.bean.Customer;
import com.capg.paymentapp.bean.Wallet;
import com.capg.paymentapp.exception.InvalidInputExp;
import com.capg.paymentapp.service.PaymentAppService;
import com.capg.paymentapp.service.PaymentAppValidate;

public class Client {
	public static void main(String args[]) {
		int choice = 1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PaymentAppService serviceapp = new PaymentAppService();
		PaymentAppValidate validateapp = new PaymentAppValidate();
		System.out.println("\t\t ###PAYMENT BANK APPLICATION###");
		do {
			System.out.println("1. CREATE ACCOUNT\n2. LOGIN\n3. EXIT");

			try {
				System.out.println("Enter your choice");
				choice = Integer.parseInt(br.readLine());
				switch (choice) {
				case 1:
					Customer customer = new Customer();
					Wallet wallet = new Wallet();
					boolean bool = false;

					System.out.println("Enter your name:");
					String customerName = br.readLine();

					System.out.println("Enter your age:");
					int age = Integer.parseInt(br.readLine());

					System.out.println("Enter your Phone Number:");
					long phoneNumber = Long.parseLong(br.readLine());
					System.out.println("Enter your Adhar Number:");
					long adharNo = Long.parseLong(br.readLine());

					System.out.println("Enter your address:");
					String address = br.readLine();

					System.out.println("Enter your Gender(Male/Female):");
					String gender = br.readLine();

					double balance = 1000;
					System.out.println("Enter your User ID :");
					String user_ID = br.readLine();
					System.out.println("Enter your password:");
					String password = br.readLine();

					long accountNumber = (long) (Math.random() * 1000000000);
					customer.setAdharNumber(adharNo);
					customer.setCustomerName(customerName);
					customer.setAge(age);
					customer.setAddress(address);
					customer.setPhoneNumber(phoneNumber);
					wallet.setAccountNumber(accountNumber);
					wallet.setAdharNumber(adharNo);
					customer.setGender(gender);
					customer.setUser_ID(user_ID);
					customer.setPassword(password);
					wallet.setInitialBalance(balance);
					customer.setWallet(wallet);

					boolean b1 = validateapp.validatePhoneNo(phoneNumber);
					
					boolean b2 = validateapp.validateCustomerName(customerName);
					if (b1 && b2) {
						bool = serviceapp.createAccount(customer);
					} else {
						System.out.println("Input is invalid(either phone number is incorrect or name should not be null");
					}

					if (bool) {
						System.out.println("Account Created Successfully  and your account number is: '" + accountNumber);
					} else {
						try {
							throw new InvalidInputExp("Your input details are invalid");
						} catch (InvalidInputExp e) {
							System.out.println("Account Creation is failed!!!!!!!!!");
						}
					}
					break;

				case 2:
					int choice1 = 1;
					boolean valid = false;
					System.out.println("Enter your UserId");
					String user_ID1 = br.readLine();
					System.out.println("Enter your Password");
					String password1 = br.readLine();
					valid = serviceapp.login(user_ID1, password1);
					if (valid) {
						do {
							System.out.println("Select any option:");
							System.out.println(  "  1.SHOW BALANCE ");
						    System.out.println("   2.DEPOSIT ");
							System.out.println("    3.WITHDRAW  ");
							System.out.println("    4.FUND TRANSFER");
							System.out.println("   5. PRINT TRANSCATION ");
							System.out.println("    6.EXIT");
							System.out.println("Enter your choice");
							choice1 = Integer.parseInt(br.readLine());
							switch (choice1) {
							case 1:
								double d = serviceapp.showBalance();
								System.out.println("Your Account Balance: " + d);
								break;
							case 2:
								double amt;
								System.out.println("Enter amount to deposit:");
								amt = Double.parseDouble(br.readLine());
								boolean b5 = serviceapp.deposit(amt);
								if (b5) {
									System.out.println("Amount deposited succesfully");
								} else {
									System.out.println("Failed to Deposit");
								}
								break;
							case 3:
								double amt1;
								System.out.println("Enter amount to withdraw:");
								amt1 = Double.parseDouble(br.readLine());
								boolean d1 = serviceapp.withdraw(amt1);
								if (d1) {
									System.out.println("Amount withdrawn succesfully");
								} else
									System.out.println("Failed to withdraw");
								break;

							case 4:
								long accnum;
								double amt2;
								System.out.println("Enter Receiver Account Number");
								accnum = Long.parseLong(br.readLine());
								System.out.println("Enter amount to Transfer:");
								amt2 = Double.parseDouble(br.readLine());
								boolean b6 = serviceapp.fundTransfer(accnum, amt2);
								if (b6) {
									System.out.println("Your amount is transferred successfully!!");
								} else
									System.out.println("Transaction failed!!");
								break;

							case 5:
								serviceapp.printTransaction();
								break;
							case 6:
								System.out.println("Thank You!!!!");
								break;
							}
						} while (choice1 != 6);
					}

					else {
						System.out.println("Invalid choice");
					}
					break;
				case 3:
					System.out.println("ThankYou");
					System.exit(0);
					break;
				default:
					System.out.println("Enter correct choice");
					break;
				}
				
			}
			catch (NumberFormatException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} while (choice != 3);
	}
}
	

