package com.tcs.entity;

public class User {
	private String name;
	private Long mobileNumber;
	private Short age;
	private ROLE role;
	public User(String name, Long mobileNumber, Short age) {
		this(name,mobileNumber);
		this.age = age;
	}
	public User(String name, Long mobileNumber) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
	}
	
	public void workout() {
		System.out.println(name +" is working out...");
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Short getAge() {
		return age;
	}

	public void setAge(Short age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + "]";
	}

}
