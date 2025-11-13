package com.demo.constructor;

@FunctionalInterface
public interface IGetEmployeDetails {

	public Employe getDetails(String name, Integer id, Double salary, String gender);

}
