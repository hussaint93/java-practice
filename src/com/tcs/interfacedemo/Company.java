package com.tcs.interfacedemo;

import java.util.ArrayList;
import java.util.List;

public class Company {
	public static void main(String[] args) {
		Staff staff = new Guard();
		staff.work();
		Staff staff1 = new Hr();
		staff.work();
		List<Staff> allStaff=new ArrayList<>();
		allStaff.add(staff1);
		allStaff.add(staff1);
		allStaff.add(staff);
		System.out.println(allStaff.size());
	}
}
