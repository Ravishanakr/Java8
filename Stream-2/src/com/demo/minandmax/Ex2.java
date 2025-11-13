package com.demo.minandmax;

public class Ex2 {

	public static void main(String[] args) {

		// Ternary operator

		int a = 10;
		int b = 20;
		int c = 30;

		int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

		System.out.println(max);
	}
}
