package com.demo;

public class TestImpl implements Test {

	@Override
	public void add(int x, int y) {

		System.out.println(20 + 30);

	}

	public static void main(String[] args) {

		Test t = new TestImpl();

		t.add(10, 20);
	}

}
