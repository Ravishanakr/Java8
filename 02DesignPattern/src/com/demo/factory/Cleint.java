package com.demo.factory;

public class Cleint {

	public static void main(String[] args) {

		FactoryPattern f = ShapeFactory.getShape("RECTANGLE");

		f.draw();
	}

}
