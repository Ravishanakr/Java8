package com.limtskip;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(15);
		l.add(72);
		l.add(46);
		l.add(19);
		l.add(22);

		// limit -->return first n elements from stream
		l.stream().limit(4).forEach(p -> System.out.print(p+" "));

		System.out.println();
		
		// skip -->skip first n elements from stream and return rest elements
		l.stream().skip(4).forEach(p -> System.out.print(p+" "));
		
		System.out.println();

		
		//find the smallest number
		l.stream().sorted().limit(1).forEach(p->System.out.println(p));

		System.out.println();

		
		//find the largest number
		l.stream().sorted(Collections.reverseOrder()).limit(1).forEach(p->System.out.println(p));
	
		System.out.println();

		//find the second smallest number
		l.stream().sorted().limit(2).skip(1).forEach(p->System.out.println(p));

		System.out.println();

		
		//find the Second largest number
		l.stream().sorted(Collections.reverseOrder()).limit(2).skip(1).forEach(p->System.out.println(p));


		
	}

}
