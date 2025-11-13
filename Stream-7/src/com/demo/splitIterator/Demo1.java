package com.demo.splitIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;

public class Demo1 {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<>();

		a.add(25);
		a.add(32);
		a.add(52);
		a.add(76);

		Iterator<Integer> iterator = a.iterator();

		while (iterator.hasNext()) {

			System.out.println(iterator.next());
		}

		System.out.println("***********");

		Spliterator<Integer> spliterator = a.parallelStream().spliterator();

		spliterator.forEachRemaining(p -> System.out.println(p));

	}
}
