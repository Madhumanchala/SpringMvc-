package Atmcorejavaproject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance;
	private double savingBalance;
	
	Scanner input=new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,###,00");
	
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber=customerNumber;
		return customerNumber;
		}
	
	public int getCustomerNumber() {
		return customerNumber;
	}

	public int getPinNumber() {
		return pinNumber;
	}

	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}

	public double getCheckingBalance() {
		return checkingBalance;
	}

	public double getSavingBalance() {
		return savingBalance;
	}
	
	public double calcCheckingWithdraw(double amount) {
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}

	public double calSavingWithdraw(double amount) {
		savingBalance =(savingBalance - amount);
				return savingBalance;
	}
	
	public double calCheckingDeposit(double amount) {
		checkingBalance =(checkingBalance + amount);
				return savingBalance;
	}
	
	public double calSavingDeposit(double amount) {
		savingBalance =(savingBalance + amount);
				return savingBalance;
	}
	
	public void getCheckingWithdrawInput() {
		System.out.println("Checking account balance: " + moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to withdraw from Checking account:");
		double amount=input.nextDouble();
		
		if((checkingBalance - amount) >= 0) {
			calcCheckingWithdraw(amount);
			System.out.println("New checking account balance " + moneyFormat.format(checkingBalance));
		}
		else {
			System.out.println("balance cannot be negative :" + "/n");
		}
	}
	
	
	public void getCheckingDepositInput() {
		System.out.println("Checking account balance: " + moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to Deposit to Checking account:");
		double amount=input.nextDouble();
		
		if((checkingBalance + amount) >= 0) {
			calCheckingDeposit(amount);
			System.out.println("New checking account balance " + moneyFormat.format(checkingBalance));
		}
		else {
			System.out.println("balance cannot be negative :" + "/n");
		}
	}
	
	public void getSavingWithdrawInput() {
		System.out.println("Checking account balance: " + moneyFormat.format(savingBalance));
		System.out.println("Amount you want to withdraw from Saving account account:");
		double amount=input.nextDouble();
		
		if((savingBalance - amount) >= 0) {
			calSavingWithdraw(amount);
			System.out.println("New Saving account balance " + moneyFormat.format(savingBalance));
		}
		else {
			System.out.println("balance cannot be negative :" + "/n");
		}
	}
	
	public void getSavingDepositInput() {
		System.out.println("Checking account balance: " + moneyFormat.format(savingBalance));
		System.out.println("Amount you want to Deposit tos Saving account account:");
		double amount=input.nextDouble();
		
		if((savingBalance + amount) >= 0) {
			calSavingDeposit(amount);
			System.out.println("New Saving account balance " + moneyFormat.format(savingBalance));
		}
		else {
			System.out.println("balance cannot be negative :" + "/n");
		}
	}
	
	
	
	

	
	

}
