package com.demo.minandmax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo2 {

	public static void main(String[] args) {

		List<Emp> empList = new ArrayList<>();

		Emp e2 = new Emp(102, "Suresh", 122000.00d);
		Emp e1 = new Emp(101, "Ramesh", 1000.00d);
		Emp e3 = new Emp(103, "Somesh", 121000.00d);
		Emp e4 = new Emp(104, "Rupesh", 901000.00d);

		List<Emp> asList = Arrays.asList(e2, e1, e3, e4);

		// write a stream program to get min sal

		Emp emp = asList.stream().min((emp1, emp2) ->

		{

			if (emp1.geteSal() < emp2.geteSal()) {
				return -1;
			} else if (emp1.geteSal() > emp2.geteSal()) {
				return 1;
			} else {
				return 0;
			}

		}

		).get();

		System.out.println("Min Sal " + emp.geteSal());

		Optional<Emp> min2 = asList.stream()
				.min((emp1, emp2) -> emp1.geteSal() < emp2.geteSal() ? -1 : (emp1.geteSal() == emp2.geteSal() ? 0 : 1));

		System.out.println("Min Sal " + min2.get());

		System.out.println("");

		// write a stream program to get max sal

		Optional<Emp> min = asList.stream().max((m1, m2) ->

		{
			if (m1.geteSal() < m2.geteSal()) {
				return -1;
			} else if (m1.geteSal() > m2.geteSal()) {
				return 1;
			}

			else {
				return 0;
			}

		}

		);

		System.out.println("Max sal " + min.get().geteSal());

		Optional<Emp> max = asList.stream()
				.max((emp1, emp2) -> emp1.geteSal() < emp2.geteSal() ? -1 : (emp1.geteSal() == emp2.geteSal() ? 0 : 1));

		System.out.println(max.get());

	}

}
