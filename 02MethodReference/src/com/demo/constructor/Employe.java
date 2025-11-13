package com.demo.constructor;

public class Employe {

	private String name;
	private Integer id;
	private Double salary;
	private String gender;

	public Employe(String name, Integer id, Double salary, String gender) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.gender = gender;
	}

	public Employe(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employe [name=" + name + ", id=" + id + ", salary=" + salary + ", gender=" + gender + "]";
	}

}
