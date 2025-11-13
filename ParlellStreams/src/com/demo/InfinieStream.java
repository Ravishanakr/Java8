package com.demo;

import java.util.stream.Stream;

public class InfinieStream {
	
	
	public static void main(String[] args) {
		
		// to create infinite loop
		Stream.generate(()->"Hello").forEach(p->System.out.println(p));
		
		
		
		
	}

}
