package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(10);
		l.add(15);
		l.add(72);
		l.add(46);
		l.add(22);
		l.add(19);
		l.add(22);

		Map<Integer, Long> collect = l.stream().collect(Collectors.groupingBy(p -> p, Collectors.counting()));

		System.out.println(collect);
		
		
		
	}

}
