package com.filterMap;

import java.util.*;
import java.util.stream.*;

public class Demo1 {

	public static boolean validateName(String name) {
		return (name.startsWith("R")) ? true : false;
	}

	public static void main(String[] args) {

		List<Emp> empList = new ArrayList<>();

		Emp e2 = new Emp(102, "Suresh", 122000.00d);
		Emp e1 = new Emp(101, "Ramesh", 1000.00d);
		Emp e3 = new Emp(103, "Somesh", 121000.00d);
		Emp e4 = new Emp(104, "Rupesh", 901000.00d);

		List<Emp> asList = Arrays.asList(e2, e1, e3, e4);

		// write a program whose name start with R

		for (int i = 0; i < asList.size(); i++) {

			if (validateName(asList.get(i).getEmpName())) {
				System.out.println(asList.get(i).getEmpName());
			}

		}

		System.out.println("********By using Strams*********");

		// filter will take predicate
		asList.stream().filter(f -> f.getEmpName().startsWith("R")).forEach(f -> System.out.println(f.getEmpName()));

		// get empId whose salary more then 1000
		System.out.println("*****************");

		Set<Emp> collect = asList.stream().filter(c -> c.geteSal() > 1000).collect(Collectors.toSet());

		asList.stream().filter(p -> p.getEmpId() == 101);

		System.out.println(collect);
	}

}
