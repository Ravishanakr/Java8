package com.sorting;

import java.util.*;

public class Prac {

	public static void main(String[] args) {

		List<Emp> empList = new ArrayList<>();

		Emp e4 = new Emp(104, "Rupesh", 901000.00d);
		Emp e2 = new Emp(102, "Suresh", 122000.00d);
		Emp e1 = new Emp(101, "Ramesh", 1000.00d);
		Emp e3 = new Emp(103, "Somesh", 121000.00d);

		List<Emp> asList = Arrays.asList(e2, e1, e3, e4);

		asList.stream()
				.sorted((p1, p2) -> (p1.getEmpId() < p2.getEmpId()) ? -1 : (p1.getEmpId() == p2.getEmpId()) ? 0 : 1)
				.forEach(p -> System.out.println(p));

	}

}
