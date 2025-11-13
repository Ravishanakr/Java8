package com.demo;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Demo2 {

	public static void main(String[] args) {

		Date d = new Date();
		System.out.println(d);

		System.out.println("");

		LocalDate date = LocalDate.now();
		System.out.println(date);

		System.out.println("");

		LocalDate plusDays = date.plusDays(3);
		System.out.println(plusDays);

		System.out.println("");

		LocalDate plusMonths = date.plusMonths(3);
		System.out.println(plusMonths);

		System.out.println("");

		LocalDate plusYears = date.plusYears(3);
		System.out.println(plusYears);

		boolean leapYear = date.isLeapYear();
		System.out.println(leapYear);

		boolean before = plusYears.isBefore(date);
		System.out.println(before);

		
		System.out.println("");
		Period between = Period.between(plusDays, plusYears);
		System.out.println(between.getDays());
		System.out.println(between.getMonths());
		System.out.println(between.getYears());


	}

}
