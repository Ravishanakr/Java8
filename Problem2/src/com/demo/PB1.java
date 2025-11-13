package com.demo;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PB1 {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(7, 2, 3, 4, 5, 6, 7, 2, 9, 5);

		Optional<Integer> reduce = asList.stream().reduce((x, y) -> x + y);		
		System.out.println(reduce);
	}

}
