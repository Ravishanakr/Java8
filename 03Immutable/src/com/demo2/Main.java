package com.demo2;

public class Main {

	// once object is created it can not be modified--immutable

	public static void main(String[] args) {
	 Adress adress = new Adress("ongole", "andra");
		
		System.out.println(adress.hashCode());

		Student1 s = new Student1(101, "Ravi", adress);

		System.out.println(s);

		 Adress address = s.getAddress();
		
		System.out.println(address.hashCode());

		address.setCity("patna");
		address.setState("Buhar");

		System.out.println(s);

	}

}
