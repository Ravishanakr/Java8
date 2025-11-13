package com.demo.toMap;

import java.util.*;
import java.util.stream.*;

import com.demo.distinct.Emp;

public class Practice {

	public static void main(String[] args) {

		List<Emp> empList = new ArrayList<>();

		Emp e2 = new Emp(102, "Suresh", 122000.00d);
		// Emp e5 = new Emp(102, "Suesh", 12000.00d);
		Emp e1 = new Emp(101, "Ramesh", 1000.00d);
		Emp e3 = new Emp(103, "Somesh", 121000.00d);
		Emp e4 = new Emp(104, "Rupesh", 901000.00d);

		List<Emp> asList = Arrays.asList(e2, e1, e3, e4);

		Map<Integer, Emp> m = asList.stream().collect(Collectors.toMap(p -> p.getEmpId(), p -> p));

		System.out.println(m);
	}

}
