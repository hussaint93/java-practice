package com.tcs.set.examples;



public class User implements Comparable<User> {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return ""+age;
		//return "[" + age + "]";
	}

	@Override
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		return o.getAge()-this.getAge();
	}
	
}
