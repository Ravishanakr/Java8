package com.demo;

public class TestImpl3 {

	public void run(Test t) {
		System.out.println("Hello aAll");
		//t.add(10, 20);
	}

	public void add(int x, int y) {
		System.out.println(x + y);
	}

	public static void main(String[] args) {

		Test t = (x, y) -> {
			System.out.println(x + y);
			System.out.println("Hui");
		};

		t.add(13, 40);
	}

}
