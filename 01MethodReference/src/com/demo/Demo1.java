package com.demo;

import java.util.function.Consumer;

//Used to create simple lambda expressions by referencing existing methods.
public class Demo1 {


	public static void main(String[] args) {

		Consumer<String> c = (x) -> System.out.println(x);

		c.accept("Hi");

	}

}
