package com.demo.constructor;

public class EmployeService {

	public boolean validateEmployeDetails(Employe e) {

		if (e.getId() != 0 && e.getName() != null && e.getSalary() != 0 && e.getGender() != null)

			return true;

		return false;
	}

}
