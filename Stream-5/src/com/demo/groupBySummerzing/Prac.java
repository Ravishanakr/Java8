package com.demo.groupBySummerzing;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Prac {

	public static void main(String[] args) {

		List<String> l = new ArrayList<>();
		l.add("Ravi");
		l.add("shankar");
		l.add("Ravi");
		l.add("Rebel");
		l.add("Sahoo");
		l.add("shankar");

		List<String> collect1 = l.stream().filter(p -> p.length() >= 4).collect(Collectors.toList());

		Map<String, Long> collect = collect1.stream().collect(Collectors.groupingBy(p -> p, Collectors.counting()));

		System.out.println(collect);

	}

}
