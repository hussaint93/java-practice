package com.tcs.entity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Gymnasium {
	static List<User> users = new ArrayList<User>();
 public static void main(String[] args) {

	// u1.setMobileNumber(9867978019L);
	 createUsers();
 }
private static void createUsers() {
	for(int i=0;i<10;i++) {
		 User u1= new User();
		 u1.setName("hussain "+ i +" ");
		 u1.setAge((short)(22*i)); 
		 users.add(u1);
	 }
	System.out.println(users);
	users.get(0).workout();
	}
}
