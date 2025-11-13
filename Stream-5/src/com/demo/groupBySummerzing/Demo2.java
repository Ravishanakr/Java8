package com.demo.groupBySummerzing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {

		List<Emp> empList = new ArrayList<>();

		Emp e2 = new Emp(102, "Suresh", 122000.00d);
		Emp e5 = new Emp(105, "Suresh", 123000.00d);
		Emp e1 = new Emp(101, "Ramesh", 1000.00d);
		Emp e3 = new Emp(103, "Somesh", 121000.00d);
		Emp e4 = new Emp(104, "Rupesh", 901000.00d);

		List<Emp> asList = Arrays.asList(e2, e1, e3, e4, e5);

		// groupBy
		Map<String, Long> collect = asList.stream()
				.collect(Collectors.groupingBy(p -> p.getEmpName(), Collectors.counting()));

		System.out.println(collect);
		
		
	
		// Summarizing

		DoubleSummaryStatistics collect2 = asList.stream().collect(Collectors.summarizingDouble(p -> p.geteSal()));
		System.out.println("Max " + collect2.getMax());
		System.out.println("Min" + collect2.getMin());
		System.out.println("Avg " + collect2.getAverage());
		System.out.println("Sum " + collect2.getSum());
		System.out.println("Count " + collect2.getCount());
		

	}
}
