package com.demo;

import java.util.Arrays;
import java.util.List;

public class Demo3 {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(1, 8, 7, 9, 30);

		// Square root of all
		asList.stream().map(p -> p * p).forEach(p -> System.out.println(p));

		asList.stream().map(p->p).forEach(p->System.out.println(p));
		
		
		
	
	
	}
}
