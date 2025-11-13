package com.test;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<Integer>();

		l.add(20);
		l.add(40);
		l.add(2);
		l.add(50);
		l.add(25);

		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}

		System.out.println("************************");

		l.forEach(x->System.out.println(x));

	}

}
