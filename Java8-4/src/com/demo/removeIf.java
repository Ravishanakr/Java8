package com.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class removeIf {

	public static void main(String[] args) {

		List<Emp> l = new ArrayList<>();

		Emp e1 = new Emp(101, "Ramesh", 1000.00d);
		Emp e2 = new Emp(102, "Suresh", 122000.00d);
		Emp e3 = new Emp(103, "Somesh", 121000.00d);
		Emp e4 = new Emp(104, "Rupesh", 901000.00d);

		l.add(e3);
		l.add(e2);
		l.add(e1);
		l.add(e4);

		// for each method
		l.forEach((o) ->System.out.println(o));

		/*
		 * The removeIf() method of ArrayList is used to remove all of the elements of
		 * this ArrayList that satisfies a given
		 */
		l.removeIf((c) -> c.getEmpId() == 101);

		System.out.println("****************");

		l.forEach((o) -> System.out.println(o.getEmpName()));

	}

}
