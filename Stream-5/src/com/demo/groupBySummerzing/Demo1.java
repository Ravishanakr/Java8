package com.demo.groupBySummerzing;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {

		List<String> l = new ArrayList<>();
		l.add("Ravi");
		// l.add("shankar");
		// l.add("Ravi");
		l.add("Rebel");
		l.add("Sahooo");
		l.add("shankar");

		// group by

		// list
		List<String> collect1 = l.stream().collect(Collectors.toList());
		System.out.println(collect1);

		// set
		Set<String> collect2 = l.stream().collect(Collectors.toSet());
		System.out.println(collect2);

		//Map
		Map<String, Integer> map = l.stream().collect(Collectors.toMap(p -> p, p -> p.length()));

		System.out.println(map);

		
		
		Map<String, Long> collect = l.stream().collect(Collectors.groupingBy(p -> p, Collectors.counting()));

		System.out.println(collect);

		// Summarizing

	}

}
