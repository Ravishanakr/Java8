package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		
		
		System.out.println("====== Serial Stream ========");
		Stream<Integer> ss = Stream.of(1, 2, 3, 4);
		ss.forEach(n -> System.out.println(n + " :: " + Thread.currentThread()));

		System.out.println("====== Parallel Strem =======");
		Stream<Integer> ps = Stream.of(1, 2, 3, 4);
		ps.parallel().forEach(n -> System.out.println(n + " :: " + Thread.currentThread()));

		System.out.println("");
		
		 List<Integer> numbers
         = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

     // Convert to parallel stream and perform operations
     numbers
         .parallelStream()
         // Filter even numbers
         .filter(n -> n % 2 == 0)
         // Print each number
         .forEach(System.out::println);
		
	}

}
