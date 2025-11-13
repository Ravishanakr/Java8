package com.demo;

import java.util.Optional;

public class Demo2 {

	public static void main(String[] args) {
		
		Optional<Integer> optional1 = Optional.ofNullable(1);
		System.out.println( optional1.get());

		Optional<String> optional2 = Optional.ofNullable(null);
		System.out.println( optional2);
		System.out.println(optional2.isPresent());
	
	

		Optional<Object> of = Optional.of(null);	
		
		System.out.println(of.isPresent());
	
	}

}
