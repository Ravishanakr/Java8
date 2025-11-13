package com.part2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
		employeeList.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
		employeeList.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
		employeeList.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
		employeeList.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
		employeeList.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
		employeeList.add(new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
		employeeList.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
		employeeList.add(new Employee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
		employeeList.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
		employeeList.add(new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
		employeeList.add(new Employee(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));

		
		
		
		
		
		// How many male and female employees are there in the Sales team ?

		
		
		
		Map<String, Long> collect = employeeList.stream()
				.filter(p->p.getDepartment().equals("Sales")).
				collect(Collectors.groupingBy(p->p.getGender(),Collectors.counting()));
		
		System.out.println(collect);
		
		
		//avg sal of male and female
		Map<String, Double> collect2 = employeeList.stream().collect(Collectors.groupingBy(p->p.getGender(),Collectors.averagingDouble(p->p.getSalary())));
		
		
		System.out.println(collect2);
		
		System.out.println("");
		
		// List down the names of all employees in each department ?

		 employeeList.stream().distinct().map(p->p.getDepartment()).forEach(p->System.out.println(p));
	
		 
		 
		 
		 //13.What is the average salary and total salary of the 
		 //whole organization ?
		 DoubleSummaryStatistics collect3 = employeeList.stream().collect(Collectors.summarizingDouble(p->p.getSalary()));
		 
			System.out.println("");

		System.out.println(collect3.getMax());
		System.out.println(collect3.getAverage());
		System.out.println(collect3.getSum());

		
	//	15.  Who is the oldest employee in the organization?
		
		Optional<Employee> min = employeeList.stream().min((e1,e2)->
		(e1.getId()<e2.getId())?-1:(e1.getId()==e2.getId())?0:1);
		
		
		System.out.println();
		
		System.out.println(min.get().getId());
	}

}
