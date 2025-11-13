package com.peek;

import java.util.Arrays;
import java.util.List;

public class Peek {

	public static void main(String[] args) {

		// 1)it is an intermediate operation which will take Consumer as a argument
		// 2)It is primarily used for debugging or logging purposes.

		List<String> asList = Arrays.asList("java", "spring", "JDBC", "Jsp", "Hibernate");

		asList.stream().peek(p -> System.out.println(p.length())).forEach(p -> System.out.println(p));

	}
}
