package com.tcs.entity;

public class MethodOverloading {
	public static void main(String[] args) {
		User1 user1 = new Employee();
		user1.work();
		user1.work(4);
		user1.work("4");

	}
}

class User1 {
	public void work() {
		System.out.println("user is working");
	}

	public void work(int duration) {
		System.out.println("user is working for " + duration);
	}

	public void work(String duration) {
		System.out.println("user is working for " + duration);
	}
}

class Employee extends User1 {
	@Override
	public void work() {
		super.work();
		System.out.println("employee is working");
	}
}