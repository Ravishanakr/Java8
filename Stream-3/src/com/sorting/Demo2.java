package com.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {

		List<Emp> empList = new ArrayList<>();

		Emp e4 = new Emp(104, "Rupesh", 901000.00d);
		Emp e2 = new Emp(102, "Suresh", 122000.00d);
		Emp e1 = new Emp(101, "Ramesh", 1000.00d);
		Emp e3 = new Emp(103, "Somesh", 121000.00d);

		List<Emp> asList = Arrays.asList(e2, e1, e3, e4);

		asList.stream().sorted((t1, t2) -> (t1.geteSal() < t2.geteSal()) ? -1: (t1.geteSal() == t2.geteSal() ? 0 : 1))
				.forEach(p -> System.out.println(p));

		System.out.println("Descending order");
		asList.stream()
				.sorted((k1, k2) -> (k1.getEmpId() < k2.getEmpId()) ? 1 : (k1.getEmpId() == k2.getEmpId() ? 0 : -1))
				.forEach(p -> System.out.println(p));

	}

}
