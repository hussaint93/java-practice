package com.tcs.listdemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArraylistDemo {
	public static void main(String[] args) {
		List<Integer> numbers = createList();
		System.out.println(numbers);
		numbers.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});
		System.out.println("after sorting "+numbers);
		numbers.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		System.out.println("after sorting in reverse order "+numbers);
	}

	private static List<Integer> createList() {
		List<Integer> numbers = new ArrayList<>();// Generics
		numbers.add(1);// autoboxing
		System.out.println(numbers.get(0));
		for (int count = 0; count < 20; count++) {
			numbers.add(count);
		}
		return numbers;
	}
}
