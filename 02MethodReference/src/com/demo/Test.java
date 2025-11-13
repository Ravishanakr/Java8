package com.demo;

public class Test {

	public static void main(String[] args) {

//		IEmployeValidation emp = EmployeService::validateEmployeDetails;
//
//		Employe e = new Employe();
//
//		e.setGender("Male");
//		e.setId(101);
//		e.setName("Ravi");
//		e.setSalary(50000.d);
//
//		boolean empValidation = emp.empValidation(e);
//		System.out.println(empValidation);

		Employe e2 = new Employe();

		EmployeService emp = new EmployeService();

		e2.setGender("Male");
		e2.setId(102);
		e2.setName("Shankar");
		e2.setSalary(60000.d);

		IEmployeValidation emp2 = emp::validateEmployeDetails;

		boolean empValidation = emp2.empValidation(e2);

		System.out.println(empValidation);

	}

}
