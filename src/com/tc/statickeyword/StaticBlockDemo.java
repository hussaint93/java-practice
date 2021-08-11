package com.tc.statickeyword;

public class StaticBlockDemo {
	private static int age = 10;
	int price = 14;

	public StaticBlockDemo() {// we cannot define static variable in methods as it
							  //at class level.
		final int variable = 57;
		System.out.println("in constructor.....");
	}

	static {// called first loaded during the statup.
		System.out.println("in static block..." + age);
	}

	public static void main(String[] args) {
//		StaticBlockDemo dem = new StaticBlockDemo();
//		new StaticBlockDemo();
	}

	void work() {
		// static int tme= 19;//not allowed since it is local variable
	}
}
