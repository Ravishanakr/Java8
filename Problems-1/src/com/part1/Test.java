package com.part1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

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

		// 1. How many male and female employees are there in the organization ?

		Map<String, Long> map1 = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(map1);

		// My method
		Map<String, Long> collect = employeeList.stream()
				.collect(Collectors.groupingBy(p -> p.getGender(), Collectors.counting()));
		System.out.println(collect);

		System.out.println("");
		
		// 2. Print the name of all unique departments in the organization ?

		long count = employeeList.stream().map(p -> p.getDepartment()).distinct().count();
		System.out.println(count);

		System.out.println("");

		// 3 What is the average age of male and female employees ?

		Map<String, Double> map = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println(map);

		// my method
		Map<String, Double> collect2 = employeeList.stream()
				.collect(Collectors.groupingBy(p -> p.gender, Collectors.averagingInt(p -> p.age)));

		System.out.println(collect2);

		// 4 get highest sal paid by employ
		System.out.println("");

		System.out.println("Highes Sal");
		Optional<Employee> max = employeeList.stream()
				.max((e1, e2) -> (e1.salary < e2.salary) ? -1 : ((e1.salary == e2.salary) ? 0 : 1));

		DoubleSummaryStatistics collect3 = employeeList.stream()
				.collect(Collectors.summarizingDouble(p -> p.getSalary()));

		System.out.println(max.get().getSalary());
		System.out.println(collect3.getMax());
		System.out.println(collect3.getAverage());
		System.out.println(collect3.getMin());
		System.out.println(collect3.getCount());
		System.out.println(collect3.getSum());



		System.out.println();

		// 5. Get the names of all employees who have joined after 2015 ?

		employeeList.stream().filter(p -> p.getYearOfJoining() > 2015).forEach(p -> System.out.println(p));

		// 6. Count the number of employees in each department ?
		System.out.println();

		Map<String, Long> map2 = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(map2);
		
		System.out.println("666666666666");
		
		Map<String, Long> collect5 = employeeList.stream()
		.collect(Collectors.groupingBy(p->p.getDepartment(),Collectors.counting()));
		
		System.out.println(collect5);

		
		System.out.println();
		//7. What is the average salary of each department ?
		System.out.println("7");

		Map<String, Double> collect4 = employeeList.stream().collect(Collectors.groupingBy(p->p.getDepartment(),Collectors.averagingDouble(p->p.getSalary())));
		

		
		System.out.println(collect4);
		
		System.out.println();

		//8. Get the details of youngest male employee in the Development department ?
		System.out.println("8");

		Optional<Employee> min = employeeList.stream().filter(p->p.getDepartment().equals("Development") && p.getGender().equals("Male")).min((e1, e2) -> (e1.getAge() < e2.getAge()) ? -1 : ((e1.getAge() == e2.getAge()) ? 0 : 1));
		
		System.out.println(min.get().getAge());
		
		
		//9 emp name upper case and alphabetical order
		System.out.println("9");
		Stream<String> sorted = employeeList.stream().map(p->p.getName().toUpperCase()).sorted();
		
		sorted.forEach(p->System.out.println(p));
		
		
		//10 get first emp name whose dept HR
		System.out.println("10");

		Optional<Employee> findFirst = employeeList.stream().filter(p->p.getDepartment().equals("HR")).findFirst();
		
		
		if(findFirst.isPresent())
		{
			System.out.println(findFirst.get());
		}
	}

}
