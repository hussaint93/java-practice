package com.tcs.set.examples;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class SetDemo {
	public static void main(String[] args) {
		//order of insertion is not maintained by set but maintained by list
		//demo1();
		Set<User> users=treeSetDemo();
		System.out.println(users);
	}

	private static Set<User> treeSetDemo() {
		// TODO Auto-generated method stub
		//to make use of treeset we have to implement Comparable interface 
		//on the class whose objects we want to store.
		Set<User> users = new TreeSet<>();//sorted order
		for (int i = 0; i < 20; i++) {
			User user = new User();
			user.setAge(10+i);
			users.add(user);
		}
		return users;
	}

	private static void demo1() {
		Set<User> users= createSet();
		System.out.println(users);
		User userWithSameAge = new User();
		userWithSameAge.setAge(10);
		users.add(userWithSameAge);
		System.out.println(users);
	}

	private static Set<User> createSet() {
		// TODO Auto-generated method stub
		Set<User> users = new HashSet<>();
		for (int i = 0; i < 20; i++) {
			User user = new User();
			user.setAge(10+i);
			users.add(user);
		}
		return users;
	}
}
