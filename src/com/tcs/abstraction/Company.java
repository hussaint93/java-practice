package com.tcs.abstraction;

public class Company {
 
 public static void main(String[] args) {
	 Staff staff = new Hr();
	 staff.work();
	 Staff staff1 = new Guard();
	 staff1.work();
}
}
