package com.demo.factory;

public class ShapeFactory {

	public static FactoryPattern getShape(String type) {

		if (type.equals("CIRCLE")) {
			return new Circle();
		}

		else if (type.equals("RECTANGLE")) {
			return new Rectangle();
		}

		return null;

	}

}
