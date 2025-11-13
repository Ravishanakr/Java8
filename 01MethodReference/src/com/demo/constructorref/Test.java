package com.demo.constructorref;

import java.util.function.Supplier;

class Doctorr {

	public Doctorr() {
		System.out.println("Doctor is created");
	}

}

public class Test {

	public static void main(String[] args) {

		Supplier<Doctorr> d=Doctorr::new;
		
		System.out.println(d.get());
	}

}
