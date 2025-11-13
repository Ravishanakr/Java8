package com.demo;

public class Demo {
	
	private String getName(int id) throws NoDataFoundException {
		if (id == 100) {
			return "Raju";
		} else if (id == 101) {
			return "Rani";
		} else {
			throw new NoDataFoundException("Invalid Id");
		}
	}

	public static void main(String[] args) throws NoDataFoundException {
		Demo d = new Demo();
		d.getName(200);
	}
}
