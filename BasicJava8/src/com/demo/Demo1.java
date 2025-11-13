package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo1 {

	public static void main(String[] args) {

		//reduce is terminal operation and it performs reduction on
		//the elements of stream
		
		List<Integer> asList = Arrays.asList(1, 8,7,9,30);
		Optional<Integer> reduce = asList.stream().reduce((a, b) -> a + b);
		System.out.println(reduce.get());
		
	
		
		
//		IntSummaryStatistics collect = asList.stream().collect(Collectors.summarizingInt(p->p));
//		
//		
//		System.out.println(collect.getSum());
//		
		
		List<String> asList2 = Arrays.asList("kohli","Rohith","dhoni");
		Optional<String> reduce2 = asList2.stream().reduce((a,b)->a+"-"+b);
		System.out.println(reduce2.get());

	}

}
