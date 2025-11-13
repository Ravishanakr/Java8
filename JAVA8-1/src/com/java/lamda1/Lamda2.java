package com.java.lamda1;

public class Lamda2 {

	public static void main(String[] args) {

		Test3 t = (x) -> {

			return 10;
		};

		int i = t.add(10);
		
		System.out.println(i);
	}

}
