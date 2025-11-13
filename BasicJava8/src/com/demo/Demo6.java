package com.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Demo6 {

	public static void main(String[] args) {

		// Get/ignore first 5 numbers using Limit & Skip in Streams

		List<Integer> asList = Arrays.asList(12, 21, 221, 32, 2, 236, 67, 22);

		List<Integer> collect = asList.stream().limit(5).collect(Collectors.toList());

		System.out.println(collect);

		Optional<Integer> reduce = collect.stream().map(p -> p).reduce((a, b) -> a + b);

		System.out.println(reduce.get());

	}

}
