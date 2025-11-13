package com.demo;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {

		Demo1 d = new Demo1();

		String usernameById = d.getUsernameById(101);
		String msg = usernameById.toUpperCase() + ", Hello";
		System.out.println(msg);

		Optional<String> username = d.getUsername(102);
		
		//System.out.println(username.get());

		if (username.isPresent()) {
			String name = username.get();
			System.out.println(name.toUpperCase() + ", Hello");
		}

	}

}
