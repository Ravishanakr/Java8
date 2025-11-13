package com.limtskip;

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
		return "Emp empId=" + empId + ", empName=" + empName + ", eSal=" + eSal;
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(eSal, empId, empName);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Emp other = (Emp) obj;
//		return Objects.equals(eSal, other.eSal) && empId == other.empId && Objects.equals(empName, other.empName);
//	}

}
