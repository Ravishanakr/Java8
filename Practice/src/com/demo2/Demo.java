package com.demo2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 32, 123, 90);

		Stream<Integer> sorted = numbers.stream().sorted();

		long count = sorted.count();
		
		System.out.println(count);

	}
}
