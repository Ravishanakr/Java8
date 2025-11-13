package com.java8.defult;

public class Example2 implements Testt {

	@Override
	public void show() {
		System.out.println("show method");
	}

	//just over riding it if you don't like super class Implementation
	@Override
	public void m1() {
		System.out.println("default m1 method");
	}

	public static void main(String[] args) {

		Example2 e2 = new Example2();
		e2.show();
		e2.m1();
		

	}
}
