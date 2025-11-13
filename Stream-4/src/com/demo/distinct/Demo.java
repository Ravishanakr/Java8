package com.demo.distinct;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {

		List<Integer> num = new ArrayList<>();

		num.add(4);
		num.add(13);
		num.add(11);
		num.add(56);
		num.add(4);
		num.add(11);
		num.add(56);

		// distinct--return unique elements
		num.stream().distinct().forEach(p -> System.out.println(p));

		// Count duplicate elements
//
	  Long duplicateElements = num.size() - num.stream().distinct().count();
		System.out.println("Duplicate Elements "+duplicateElements);

		
		
		
		
		
		
	}

}
