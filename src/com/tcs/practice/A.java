package com.tcs.practice;

class ColorException extends Exception {
}

class WhiteException extends ColorException {
}

public class A {
	void m1() throws ColorException {
		throw new WhiteException();
	}

	void m2() throws WhiteException {
	}

	public static void main(String[] args) {
		A white = new A();
		int a, b, d, f;
		a = b = d = f = 0;
		try {
			white.m1();
			a++;
		} catch (ColorException e) {
			b++;
		}
		try {
			white.m2();
			d++;
		} catch (WhiteException e) {
			f++;
		}
		System.out.print(a + "," + b + "," + d + "," + f);
	}
}