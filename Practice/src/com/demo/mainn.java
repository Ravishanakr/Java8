package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mainn {

	public static void main(String[] args) {

		List<Emp> empList = new ArrayList<>();

		Emp e5 = new Emp(105, "Githa", 100.00d);
		Emp e4 = new Emp(104, "Ram", 200.00d);
		Emp e2 = new Emp(102, "Suresh", 500.00d);
		Emp e1 = new Emp(101, "Ramesh", 3000.00d);
		Emp e3 = new Emp(103, "Somesh", 400.00d);

		List<Emp> asList = Arrays.asList(e1, e2, e5, e3, e4);

		DoubleSummaryStatistics collect = asList.stream().collect(Collectors.summarizingDouble(p -> p.geteSal()));

		System.out.println(collect.getCount());
	}

}
