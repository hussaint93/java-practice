package com.tcs.exceptionsdemo;

public class ExceptionDemo {
	public static void main(String[] args) {
		//demo1();
		try {
			demo2();
		} catch (MyCheckedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void demo2() throws MyCheckedException {
		// TODO Auto-generated method stub
		throw new MyCheckedException();
		
	}

	private static void demo1() {
		try {
			System.out.println(1 / 0);
		} catch (ArithmeticException ex) {
			ex.printStackTrace();
			System.out.println("division by zero is not allowed");
		}
	}
}
