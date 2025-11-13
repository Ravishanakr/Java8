package com.java8.defult;

public class Example1 implements Testt {

	@Override
	public void show() {
		System.out.println("Show method");
	}

	public void add() {
		Testt.super.m1();
	}

	public static void main(String[] args) {

		Example1 e1 = new Example1();
		
		e1.show();
		e1.m1();
		e1.add();

	}

}
