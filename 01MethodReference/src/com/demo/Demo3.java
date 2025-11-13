package com.demo;

@FunctionalInterface
interface MyInterface2 {

	void m1();
}

public class Demo3 {

	public void m2() {

		System.out.println("hello all this instace method");
	}

	public static void main(String[] args) {

		Demo3 m = new Demo3();
		
		MyInterface2 i=m::m2;
		
		i.m1();

	}

}
