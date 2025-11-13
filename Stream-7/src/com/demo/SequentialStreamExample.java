package com.demo;

import java.util.Arrays;
import java.util.List;

public class SequentialStreamExample {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

		System.out.println("Sequential Stream Output:");

		numbers.stream().map(n -> n * 2).forEach(p -> System.out.print(p + " "));

		System.out.println("Parllel Stream Output:");

		numbers.parallelStream().map(n -> n * 2).forEach(p -> System.out.print(p + " "));

	}
}