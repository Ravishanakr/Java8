package com.java8.staticc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Example1 implements Test {

	@Override
	public void show() {
		System.out.println("Show method");
	}

	// not overriding and it is redefining
	static void staticMethod() {
		System.out.println("Hello static Method ");
	}

	public static void main(String[] args) {

		Example1 e1 = new Example1();

		e1.show();
		Example1.staticMethod();
		Test.staticMethod();

		List<Integer> i = new ArrayList<>();
		i.add(12);
		i.add(32);
		i.add(12);
		i.add(32);
		i.add(12);
		i.add(32);

		// Collection---interface
		// Collections--class

		Collections.synchronizedList(i);

	}
}
