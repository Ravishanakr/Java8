package com.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo5 {

	public static void main(String[] args) {

		// Get Second Highest/Lowest Number using Streams

		List<Integer> asList = Arrays.asList(12, 21, 221, 32, 2, 236, 67, 22);

		
		 List<Integer> collect = asList.stream().sorted(Collections.reverseOrder()).limit(2).skip(1).collect(Collectors.toList());
		 System.out.println(collect);
		 
		 
			List<Integer> asList2 = Arrays.asList(12, 21, 221, 32, 2, 236, 67, 22);

			asList2.stream().sorted(Collections.reverseOrder()).limit(2).skip(1);
			
			
	}

}
