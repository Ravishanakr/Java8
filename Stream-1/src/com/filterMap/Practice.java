package com.filterMap;

import java.util.stream.*;

public class Practice {

	public static void main(String[] args) {
		String[] names = { "Ravi", "Shankar", "Derangula", "Salaar" };

		Stream.of(names).filter(p -> p.startsWith("R")).forEach(p -> System.out.println(p));

	}

}
