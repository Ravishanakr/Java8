package com.demo.sorting;

import java.util.Arrays;

public class Demo2 {

	public static void main(String[] args) {

		String[] a = { "1", "2", "3", "4", "5" };

		Arrays.stream(a).forEach(System.out::println);

	}
}
