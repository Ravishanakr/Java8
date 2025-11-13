package com.demo;

import java.util.Objects;

public class Emp {

	private int empId;
	private String empName;
	private Double eSal;

	public Emp(int empId, String empName, Double eSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.eSal = eSal;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double geteSal() {
		return eSal;
	}

	public void seteSal(Double eSal) {
		this.eSal = eSal;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", eSal=" + eSal + "]";
	}

	@Override
	public int hashCode() {
		return this.empId;
	}

	@Override
	public boolean equals(Object obj) {

		Emp e = (Emp) obj;

		if (this.empId == e.empId) {
			return true;
		} else {
			return false;

		}

	}

}
