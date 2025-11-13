package com.demo.singleton;

//Lazy loading
public class Singleton2 {

	private static Singleton2 singleton;

	// private constructor to avoid client applications using the constructor
	private Singleton2() {
	}

	public static Singleton2 getInstance() {

		if (singleton == null) {
			singleton = new Singleton2();
		}

		return singleton;
	}

}
