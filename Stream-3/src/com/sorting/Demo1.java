package com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {

		List<Integer> num = new ArrayList<>();

		num.add(193);
		num.add(13);
		num.add(11);
		num.add(56);
		num.add(4);

		//Sort method will take argument as comparator
		
		
		List<Integer> collect = num.stream().sorted().collect(Collectors.toList());
		System.out.println(collect);

			
		List<Integer> collect4 = num.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(collect4);
		

		System.out.println("****Using Comaparator*******");

		//Ascending order
		List<Integer> collect2 = num.stream().sorted((t1, t2) -> (t1 < t2) ? -1 : 1).collect(Collectors.toList());

		System.out.println("Acsending order " + collect2);

		//descending order
		List<Integer> collect3 = num.stream().sorted((t1, t2) -> (t1 < t2) ? 1 : (t1 == t2) ? 0 : -1).
				collect(Collectors.toList());
		
		System.out.println("descending order"+collect3);
				
	}

}
