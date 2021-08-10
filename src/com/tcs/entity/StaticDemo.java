package com.tcs.entity;

public class StaticDemo {
	public static void main(String[] ags) {
		Bank bank = new Bank();
		System.out.println(Bank.createNewAccountNumber());
		System.out.println(Bank.createNewAccountNumber());
		Bank bank1 = new Bank();
		System.out.println(bank1.createNewAccountNumber());
		System.out.println(bank1.createNewAccountNumber());
	}
}
class Bank{
	static int counter;
	public static int createNewAccountNumber() {
		return ++counter;
	}
}