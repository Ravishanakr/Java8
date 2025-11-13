package com.demo.minandmax;

import java.util.*;

public class Practice {

	public static void main(String[] args) {

		List<Emp> empList = new ArrayList<>();

		Emp e2 = new Emp(102, "Suresh", 122000.00d);
		Emp e1 = new Emp(101, "Ramesh", 1000.00d);
		Emp e3 = new Emp(103, "Somesh", 121000.00d);
		Emp e4 = new Emp(104, "Rupesh", 901000.00d);

		List<Emp> asList = Arrays.asList(e2, e1, e3, e4);

		Optional<Emp> min = asList.stream()
				.max((p1, p2) -> (p1.geteSal() < p2.geteSal()) ? -1 : (p1.geteSal() == p2.geteSal()) ? 0 : 1);

		System.out.println(min);

	}

}
