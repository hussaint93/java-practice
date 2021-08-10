package com.tcs.entity;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		EnhancedForLoopDemo();
		// demo1();
	}

	private static void EnhancedForLoopDemo() {
		// TODO Auto-generated method stub
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7 };
		for (int number : numbers) {

			if (number % 2 == 0) {
				System.out.println(number);
			}
		}
	}

	private static void demo1() {
		int[] numbers = new int[10];
		numbers[0] = 1;
		numbers[4] = 3;
		Arrays.sort(numbers);
		for (int count = 0; count < numbers.length; count++) {
			System.out.println(numbers[count]);
		}
	}

}
