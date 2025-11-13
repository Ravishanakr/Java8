package com.demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo8 {

	public static void main(String[] args) {

		// Print Duplicate Numbers using Streams
		Set<Integer> s = new HashSet<>();

		List<Integer> asList2 = Arrays.asList(10, 22, 10, 71, 22, 4);

		for (Integer i : asList2) {

			if (!s.add(i)) {

				System.out.println("****" + i);
			}
		}

		System.out.println("");

		List<Integer> asList3 = Arrays.asList(1, 12, 21, 11, 211, 1, 12);
		Set<Integer> s1 = new HashSet<>();

		Set<Integer> collect2 = asList3.stream().filter(p -> !s1.add(p)).collect(Collectors.toSet());

		System.out.println(collect2);

	}

}
