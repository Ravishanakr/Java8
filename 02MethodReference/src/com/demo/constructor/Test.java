package com.demo.constructor;

public class Test {

	public static void main(String[] args) {

		IGetEmployeDetails emp = Employe::new;

		Employe details = emp.getDetails("Ravi", 101, 12343d, "Male");

		System.out.println(details);

		

	}

}
