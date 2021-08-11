package com.tcs.abstraction;

public abstract class Staff {
	private String name;

	public void fillTimesheet() {
		System.out.println(name+" has filled the tiemsheet");
	}
	public abstract void work();
}
class Hr extends Staff {
	public void work() {
		System.out.println("Hr is working");
	}
}
class Guard extends Staff {
	public void work() {
		System.out.println("Guard is working");
	}
}