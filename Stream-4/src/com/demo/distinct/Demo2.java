package com.demo.distinct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {

		List<Emp> empList = new ArrayList<>();

		Emp e2 = new Emp(102, "Sureshhh", 122000.00d);
		Emp e5 = new Emp(102, "Sueshh", 12000.00d);
		Emp e1 = new Emp(101, "Ramesh", 1000.00d);
		Emp e3 = new Emp(103, "Somesh", 121000.00d);
		Emp e4 = new Emp(104, "Rupesh", 901000.00d);
		List<Emp> asList = Arrays.asList(e2, e1, e3, e4, e5);

		// find distinct employees
		asList.stream().distinct().forEach(p -> System.out.println(p));

	}

}
