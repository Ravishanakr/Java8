package com.demo.singleton;

//Eager loading
public class Singleton1 {

	private static Singleton1 singleton = new Singleton1();

	// private constructor to avoid client applications using the constructor
	private Singleton1() {
	}

	public static Singleton1 getInstance() {
		return singleton;
	}

}
