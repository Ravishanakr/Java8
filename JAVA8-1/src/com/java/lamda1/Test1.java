package com.java.lamda1;

@FunctionalInterface
public interface Test1 {

	void display();

	default void add() {
		System.out.println("Add method");
	}

	static void sub() {
		System.out.println("sub method");
	}

	/*
	 * @FunctionalInterface is an interface in which we can write only one abstract
	 * method and any no. of default and static methods.
	 */

}
