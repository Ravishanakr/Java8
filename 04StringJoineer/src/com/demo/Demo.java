package com.demo;

import java.util.StringJoiner;

//It is used to construct a sequence of characters 
//separated by a delimiter
public class Demo {

	public static void main(String[] args) {

		StringJoiner s = new StringJoiner("-");

		s.add("hi");
		s.add("Hello");
		s.add("bye");

		System.out.println(s);

		
		// StringJoiner Constructor taking 3 parameters delimiter,prefix,suffix
		StringJoiner s1 = new StringJoiner("-", "(", ")");

		s1.add("hi");
		s1.add("Hello");
		s1.add("bye");

		System.out.println(s1);

	}
}
