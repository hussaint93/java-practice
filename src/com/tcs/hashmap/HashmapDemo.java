package com.tcs.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashmapDemo {
	public static void main(String[] args) {
		//createHashMap();
		treeMap();
	}

	private static void treeMap() {
		Map<Integer,Float> mathScores = new TreeMap<>();
		for(int i=0;i<20;i++) {
			mathScores.put(i,new Float(100*Math.random()));
		}
		System.out.println(mathScores);
	}

	private static void createHashMap() {
		//Map<String,Student> mathScores = new HashMap<>();
		Map<String,Float> mathScores = new HashMap<>();
//		for(int i=0;i<20;i++) {
//			mathScores.put("student"+i,
//					new Student(new Float(100*Math.random()),new Float(100*Math.random()),new Float(100*Math.random())));
//		}
		for(int i=0;i<20;i++) {
			mathScores.put("student"+i,new Float(100*Math.random()));
		}
		
		boolean exists = mathScores.containsKey("student1");
		System.out.println(exists);
		mathScores.put("student1", 34F);
		mathScores.remove("student1");
		System.out.println(mathScores);
	}
}
