package com.demo.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {

		List<Integer> i = Arrays.asList(1, 43, 21, 4, 89);

		System.out.println("Before sort " +i);

		Collections.sort(i, new NumberComaparator());

		System.out.println("After sort " +i);
		
	}
}

class NumberComaparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		if (o1 > o2) {
			return -1;
		} else if (o1 < o2) {
			return 1;
		}
		return 0;
	}

}