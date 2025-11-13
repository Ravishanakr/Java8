package com.demo.minandmax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Demo1 {

	public static void main(String[] args) {

		List<Integer> num = new ArrayList<>();

		num.add(193);
		num.add(13);
		num.add(11);
		num.add(56);
		num.add(4);

		// Minimum and max will take argument as comparator
		// write a program to print max number
		Optional<Integer> min = num.stream().min((ele1, ele2) -> {

			if (ele1 < ele2) {
				return -1;
			} else if (ele1 > ele2) {
				return 1;
			} else {
				return 0;
			}
		}

		);

		System.out.println(min.get());

		Optional<Integer> min2 = num.stream().min((x, y) -> x < y ? -1 : (x == y ? 0 : 1));

		System.out.println(min2.get());

	}

}
