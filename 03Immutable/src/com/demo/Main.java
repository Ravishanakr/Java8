package com.demo;

public class Main {

	//once object is created it can not be changed--immutable
	
	public static void main(String[] args) {

		Student s = new Student();

		s.setId(101);
		s.setName("Ravi");

		System.out.println(s);
	
		s.setId(105);
		s.setName("Ri");
		
		System.out.println(s);



	}

}
