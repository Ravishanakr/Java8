package com.limtskip;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {

		List<Emp> empList = new ArrayList<>();

		Emp e2 = new Emp(102, "Suresh", 1000.00d);
		Emp e5 = new Emp(105, "Suresh", 2000.00d);
		Emp e1 = new Emp(101, "Ramesh", 3000.00d);
		Emp e3 = new Emp(103, "Somesh", 4000.00d);
		Emp e4 = new Emp(104, "Rupesh", 5000.00d);

		List<Emp> asList = Arrays.asList(e2, e1, e3, e4, e5);

		
		//finding second lowest sal
		asList.stream()
				.sorted((o1, o2) -> (o1.geteSal() < o2.geteSal()) ? -1 : (o1.geteSal() == o2.geteSal() ? 0 : 1))
				.limit(2).skip(1)
				.forEachOrdered(p -> System.out.println(p.geteSal()));
		

		
		//finding second largest sal
		asList.stream()
		.sorted((o1, o2) -> (o1.geteSal() < o2.geteSal()) ? 1 : (o1.geteSal() == o2.geteSal() ? 0 : -1))
		.limit(2).skip(1)
		.forEachOrdered(p -> System.out.println(p.geteSal()));
		
		
		//find third 
		
		
		
		
		
	}

}
