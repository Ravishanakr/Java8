package com.demo2.findfirstany;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo1 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5,6,8,12,89,281,90);

		// findFirst() example
		Optional<Integer> firstEven = numbers.stream().filter(n -> n % 2 == 0).findFirst();
		System.out.println("First even number: " + firstEven.orElse(-1)); // Output: 2

		// findAny() example
		Optional<Integer> anyEven = numbers.stream().filter(n -> n % 2 == 0).findAny();
		System.out.println("Any even number: " + anyEven.orElse(-1)); // Output: 2 or 4 (non-deterministic)

		// findAny() with parallel stream
		Optional<Integer> anyEvenParallel = numbers.parallelStream().filter(n -> n % 2 == 0).findAny();
		System.out.println("Any even number (parallel): " + anyEvenParallel.orElse(-1)); // Output: 2 or 4
																							// (non-deterministic)

	}

	
	/*
	 * 1)In Java 8 Stream, the findFirst() returns the first element from a Stream
	 * 2)guarantees order but might be slow in execution.

	 * 
	 * 1)while findAny() returns any element from a Stream.
	 * 2)does not guarantees order and especially used for parallel streams.
	 */	
	
	
	
	
}
