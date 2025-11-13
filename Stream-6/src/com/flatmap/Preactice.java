package com.flatmap;

import java.util.ArrayList;
import java.util.List;

public class Preactice {

	public static void main(String[] args) {

		List<String> l1 = new ArrayList<>();

		l1.add("Ravi");
		l1.add("Shankar");

		List<String> l2 = new ArrayList<>();

		l2.add("Deva");
		l2.add("Salaar");

		List<List<String>> lists = new ArrayList<>();

		lists.add(l1);
		lists.add(l2);

		
		lists.stream().flatMap(p->p.stream()).forEach(p->System.out.println(p));
		
	}

}
