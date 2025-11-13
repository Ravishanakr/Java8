package com.demo;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {

		// reduce is terminal operation and it performs reduction on
		// the elements of stream

		List<Integer> asList = Arrays.asList(1, 8, 7, 9, 30);
		List<String> asList2 = Arrays.asList("Java", "Angular", "React", "Python");

		List<Integer> collect = asList.stream().map(p -> {
			return p + 2;
		}).collect(Collectors.toList());
		List<Integer> collect2 = asList2.stream().map(p -> p.length()).collect(Collectors.toList());
		System.out.println(collect);
		System.out.println(collect2);

		System.out.println("");
		System.out.println("");


//		IntSummaryStatistics summaryStatistics = asList.stream().mapToInt(p ->
//
//		{
//			return p + 2;
//		}).summaryStatistics();
		
		
		IntSummaryStatistics summaryStatistics = asList.stream().mapToInt(p->p).summaryStatistics();
		

		System.out.println(summaryStatistics.getMin());
		System.out.println(summaryStatistics.getMax());
		System.out.println(summaryStatistics.getCount());
		System.out.println(summaryStatistics.getAverage());

	}

}
