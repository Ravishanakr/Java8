package com.flatmap;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {

		// map 
		//will provide the one to one mapping
		//Transforming elements in a stream.
		
		
		// flatmap will provide one to many mapping
        //->It is used to flatten list of streams into single stream.
		
		List<String> l = new ArrayList<>();

		l.add("Ravi");
		l.add("Shankar");

		List<String> l2 = new ArrayList<>();

		l2.add("Deva");
		l2.add("Salaar");

		List<List<String>> l3 = new ArrayList<>();

		l3.add(l);
		l3.add(l2);

		// flat map

		l3.stream().flatMap(p -> p.stream()).forEach(p -> System.out.println(p));

		System.out.println("");
		
		System.out.println("with out java 8");
		// with out Java 8

		List<String> l4 = new ArrayList<>();

		for (int i = 0; i < l3.size(); i++) {

			List<String> list = l3.get(i);

			for (int j = 0; j < l3.size(); j++) {

				String string = list.get(i);
				l4.add(string);

			}

		}

		System.out.println(l4);
		
	}

}
