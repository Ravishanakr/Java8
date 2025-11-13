package com.java8.staticc;

public interface Test {

	void show();

	static void staticMethod() {
		System.out.println("Static methods are used to create " + "" + "utility methods from java 8 onwords ");
	}

}

/*
 * 1)Interface will allow us to write Static methods,so we no need to write
 * utility methods by creating a class.
 * 
 */