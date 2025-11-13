package com.demo;

@FunctionalInterface
interface MyInterface {

	void m1();
}

public class Demo2 {

	public static void m2() {
		System.out.println("hello all");
	}

	public static void main(String[] args) {

		
		Demo2.m2();
		
		MyInterface m = Demo2::m2;
		m.m1();

	}

}
