package com.demo.singleton;

public class CleintApp {

	public static void main(String[] args) {

		/*
		 * 1)ensures that a class having only one instance and 
		 * provide global access for it.
		 * 2)By using this pattern we can saves memory 
		 * 3)because only one object instance is
		 * 
		 */

		Singleton1 instance1 = Singleton1.getInstance();
		System.out.println(instance1.hashCode());

		Singleton1 instance2 = Singleton1.getInstance();
		System.out.println(instance2.hashCode());

		Singleton2 instance3 = Singleton2.getInstance();
		System.out.println(instance3.hashCode());

	}
}
