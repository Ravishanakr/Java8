package com.demo;

import java.util.Optional;

public class Demo1 {

	// Without Optional object
	public String getUsernameById(Integer id) {
		if (id == 100) {
			return "Raju";
		} else if (id == 101) {
			return "Rani";
		} else if (id == 102) {
			return "John";
		} else {
			return null;
		}
	}

	// with Optional Object
	public Optional<String> getUsername(Integer id) {
		String name = null;
		if (id == 100) {
			name = "Raju";
		} else if (id == 101) {
			name = "Rani";
		} else if (id == 102) {
			name = "John";
		}
		return Optional.ofNullable(name);
	}
}
