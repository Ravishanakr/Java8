package com.java8.defult;

public interface Testt {

	void show();

	default void m1() {
		System.out.println("Hello this is default method");
		System.out.println("Provides BackWord Compatibality");
	}
}
/*
 * we can write Default methods and Static methods in Interfaces
 * 
 * 1.Default methods provides backward compatibility
 * 
 * 2. Backward compatibility is adding new features without breaking the old
 * code
 * 
 * 3.Explain the Test interface Having 10 Implementation classes.
 * 
 */