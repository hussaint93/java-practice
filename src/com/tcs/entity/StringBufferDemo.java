package com.tcs.entity;

public class StringBufferDemo {
	public static void main(String[] args) {
		String literal = "TCS";//stringpool
		String s1 = new String("tcs");//heap, immutable
		StringBuilder sbd= new StringBuilder("Tcs sbd");//mutable,heap,not thread sfe
		StringBuffer sbf = new StringBuffer("Tcs sbf");//mutable,heap,thread safe 
	}
}
