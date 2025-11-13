package com.demo;

public class Pract {

	public static void main(String[] args) {

		String abc = "123Asdf";

		int sum = 0;

		for (int i = 0; i < abc.length(); i++) {

			char charAt = abc.charAt(i);

			if (Character.isDigit(charAt)) {

				sum = sum + Character.getNumericValue(charAt);

			}

		}

		System.out.println(sum);

	}

}
