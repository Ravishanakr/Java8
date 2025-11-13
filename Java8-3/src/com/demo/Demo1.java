package com.demo;

public class Demo1 {

	public static void main(String[] args) {

		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Run method");
			}
		});

		t.run();

		Thread t2 = new Thread(() -> {

			System.out.println("Run method lambda");
		});

		t2.run();

	}

}
