package com.flatmap;

import java.util.Optional;

public class OptionalClass {

	public static Optional<String> display(String i) {

		// it can take the null value and verify if the parameter is null
		// it will return empty and if it is not null
		// then it will return value
		Optional<String> ofNullable = Optional.ofNullable(i);

		// if the parameter is null then will throw Null pointer exception
		// else return value
		Optional<String> ofNullable1 = Optional.of(i);

		return ofNullable1;

	}

	public static void main(String[] args) {

		Optional<String> display = display(null);

		if (display.isPresent()) {
			System.out.println(display.get());
		} else {
			System.out.println();

		}

	}
}
