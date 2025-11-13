package com.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1 {

	public static void main(String[] args) throws ParseException {

		Date d = new Date();

		System.out.println(d);

		// convert date to string
		SimpleDateFormat d1 = new SimpleDateFormat("dd/MM/yyyy");
		String format = d1.format(d);

		System.out.println(format);

		// convert string to date

		SimpleDateFormat d2 = new SimpleDateFormat("dd/MM/yyyy");
		Date pdate = d2.parse(format);
		System.out.println(pdate);

	}

}
