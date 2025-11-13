package com.demo;

public class TestImpl2 {

	public void run(Test t) {
		System.out.println("Hello aAll");
		t.add(10, 20);
	}

	public static void main(String[] args) {

		TestImpl2 t1 = new TestImpl2();

		t1.run((x, y) -> System.out.println(x + y+" *****"));
		// t1.add(22, 25);

		// Here what happening is run method taking Test
		// interface functionality so we are passing..that's it.

		/*
		 * Advantage of Lambda is. 1)It enables functional programming. (Functional
		 * programming means sending the functionality as method argument)
		 * 
		 * 2. We can replace the anonymous inner class with Lambda expression
		 * 
		 */
	}

}
