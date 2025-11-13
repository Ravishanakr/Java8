package com.demo;

import java.util.Arrays;
import java.util.List;

public class Demo7 {

	public static void main(String[] args) {

		//find the total number of elements present in the list
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		long count = myList.stream().count();
		System.out.println(count);
	}

}
