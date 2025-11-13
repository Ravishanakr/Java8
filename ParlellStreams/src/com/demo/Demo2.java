package com.demo;

import java.util.Optional;
import java.util.stream.Stream;

public class Demo2 {

	public static void main(String[] args) {
		
		
		 Optional<Integer> findFirst = Stream.of(1, 2, 3, 4).parallel().findFirst();

		 System.out.println(findFirst);
		 
		
		 Optional<Integer> findAny = Stream.of(1, 2, 3, 4).parallel().findAny();

		 System.out.println(findAny);
		 
	}

}
