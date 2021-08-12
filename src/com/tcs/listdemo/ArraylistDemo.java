package com.tcs.listdemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArraylistDemo {
	public static void main(String[] args) {
		List<Integer> numbers = createList();
		// sortList(numbers);
		filterList(numbers);
	}

	/**
	 * Method to filter the elements
	 * 
	 * @param numbers
	 */
	private static void filterList(List<Integer> numbers) {
		numbers.forEach((number) -> {
			System.out.println(number % 2 == 0);
		});
		List<Integer>filtered=numbers.stream()
				.filter((number) -> number % 2 == 0)
				.collect(Collectors.toList());
		System.out.println(filtered);
	}

	/**
	 * Method to sort the elements
	 * 
	 * @param numbers
	 */
	private static void sortList(List<Integer> numbers) {
		System.out.println(numbers);
		numbers.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});
		System.out.println("after sorting " + numbers);
		numbers.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		System.out.println("after sorting in reverse order " + numbers);
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
