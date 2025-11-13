package com.demo2;

final public class Student1 {

	final private int id;
	final private String name;
	final private Adress address;

	public Student1(int id, String name, Adress adress) {
		super();
		this.id = id;
		this.name = name;
		this.address = adress;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Adress getAddress() {
		//crating another object by same city,state
		//instead of giving direct access to above address object 
		//Reference we are creating new/clone object
		return new Adress(address.getCity(), address.getState());
	}

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	

	
}
