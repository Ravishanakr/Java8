package com.java.lamda1;

public class LamdaExample1 {

	public static void main(String[] args) {

		/*
		 * 1)Lambda correspondences to an interface and specifically abstract methods
		 * present in interface
		 */
		
		/*
		 * 2)when ever you write lambda that interface should have only 1 abstract
		 * method
		 */	
		
		/*
		 * 3)Lambda enables Functional Programming - What is Functional Programming ? -
		 * Till now in Java we passed data as method argument. Passing the functionality
		 * as method argument is called as Functional programming
		 */
		
		/*
		 * 4)@FunctionalInterface is an interface in which we can write only one abstract
		 * method and any no. of default and static methods.
		 */
		// Test1
		Test1 t1 = () -> {

			System.out.println("Display Method");
		};

		t1.display();

		// Test2

		Test2 t2 = () -> {
			return 10;
		};

		System.out.println(t2.add());

		// Test3
		Test3 t3 = (x) -> {
			return x * 4;
		};

		System.out.println(t3.add(5));
	}
}
