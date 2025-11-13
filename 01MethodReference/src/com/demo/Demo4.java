
package com.demo;

public class Demo4 extends Thread {

	public void m1() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		Demo4 d = new Demo4();

		Runnable r = d::m1;

		Thread t = new Thread(r);
		t.start();
	}
}