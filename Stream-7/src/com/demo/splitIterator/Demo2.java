package com.demo.splitIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;

public class Demo2 {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<>();

		a.add(25);
		a.add(32);
		a.add(52);
		a.add(76);

		Spliterator<Integer> spliterator = a.spliterator();

		System.out.println("***********");

		spliterator.forEachRemaining(p -> System.out.println(p));

	}
}
