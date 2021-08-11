package com.tcs.unchecked;

public class UncheckedExceptionDemo {
	public static void main(String[] args) {
		User u = new User();
		u.work();
	}
}

class User {
	int age = 45;

	public void work() {
		if (age <= 18) {

			throw new UnderAgeException("Age should be greater then 18");
			// System.out.println();unreachable
		} else if (age > 60) {
			throw new OverAgeException("Age should be less than 60");
		}
		System.out.println("hello brother");
	}
}