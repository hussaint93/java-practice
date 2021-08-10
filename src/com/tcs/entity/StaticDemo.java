package com.tcs.entity;

public class StaticDemo {
	public static void main(String[] ags) {
		Bank bank = new Bank();
		System.out.println(Bank.createNewAccountNumber());
		System.out.println(Bank.createNewAccountNumber());
		System.out.println(bank.instanceVarable);
		Bank bank1 = new Bank();
		System.out.println(bank1.createNewAccountNumber());
		System.out.println(bank1.createNewAccountNumber());
		System.out.println(bank1.instanceVarable);
	}
}
class Bank{
	static int counter;
	int instanceVarable=10;
	public static int createNewAccountNumber() {
		return ++counter;
		
	}
}