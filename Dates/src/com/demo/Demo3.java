package com.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Demo3 {

	public static void main(String[] args) {

		Date d = new Date();
		System.out.println(d);

		LocalTime now = LocalTime.now();
		System.out.println(now);

		LocalDateTime now2 = LocalDateTime.now();
		System.out.println(now2);
		

		String dateString = "14-Aug-2024";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		LocalDate date = LocalDate.parse(dateString, formatter);
		System.out.println("Parsed date: " + date);

	}

}
