package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo4 {

	public static void main(String[] args) {

		// Print Numbers Starts With Prefix 2 using Streams

		List<Integer> asList = Arrays.asList(12, 21, 221, 32, 2, 236, 67, 22);

	
		asList.stream().map(e->String.valueOf(e)).
		filter(e->e.startsWith("2")).forEach(p->System.out.println(p));
	
		
	
		
		
		
	}

}
