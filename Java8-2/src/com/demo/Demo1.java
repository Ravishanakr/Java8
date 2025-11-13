package com.demo;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo1 {

	public static void main(String[] args) {

		System.out.println("********Consumer*********");

		// 1.Consumer --take one argument and return nothing
		Consumer<Integer> c = (num) -> {

			int x = num + 10;
		};

		c.accept(10);

		System.out.println("********Predicate*********");

		// 2.Predicate --takes one argument and return boolean

		Predicate<String> p = (s) -> {
			System.out.println(s);
			return true;
		};

		System.out.println(p.test("Hii"));

		System.out.println("********Function*********");

		// 3.Function
		/*
		 * Take one one argument return same/another type argument
		 * 
		 * R apply(T t);
		 * 
		 */

		Function<Integer, String> f = (i) -> {
			System.out.println(i);
			return "Hello";

		};

		String apply = f.apply(10);

		System.out.println(apply);

		System.out.println("********Supplier*********");

		// 4.Supplier takes nothing and return something
		Supplier<String> s = () -> {
			return "Hello";
		};

		String string = s.get();
		System.out.println(string);

	}

}
