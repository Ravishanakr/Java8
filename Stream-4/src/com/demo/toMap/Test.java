package com.demo.toMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.demo.distinct.Emp;

public class Test {

	public static void main(String[] args) {

		List<Emp> empList = new ArrayList<>();

		Emp e2 = new Emp(102, "Suresh", 122000.00d);
	//	Emp e5 = new Emp(102, "Suesh", 12000.00d);
		Emp e1 = new Emp(101, "Ramesh", 1000.00d);
		Emp e3 = new Emp(103, "Somesh", 121000.00d);
		Emp e4 = new Emp(104, "Rupesh", 901000.00d);

		List<Emp> asList = Arrays.asList(e2, e1, e3, e4);

		
		  Map<Integer, Emp> collect = asList.stream().collect(Collectors.toMap(p ->
		  p.getEmpId(), p -> p)); 
		  
		  System.out.println(collect);
		 
		 
		asList.stream().filter(p->p.getEmpName().startsWith("S") || p.getEmpName().startsWith("R")).forEach(p->System.out.println(p.getEmpName()));
		
		long count = asList.stream().filter(p->p.getEmpName().startsWith("S") || p.getEmpName().startsWith("R")).count();
		
		System.out.println(count);
	}

}
