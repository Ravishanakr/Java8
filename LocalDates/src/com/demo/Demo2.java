package com.demo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Demo2 {

	public static void main(String[] args) {

		DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		String date = "01-12-2021";
		
		
		LocalDate parse = LocalDate.parse(date,formater);
		System.out.println(parse);

	}
}
