package Algo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import model.Employee;

public class EmployeeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Employee> list = Arrays.asList(new Employee("Heena", "LKO"), new Employee("Aashi", "LKO"),
				new Employee("Aashi", "DELHI"), new Employee("Anshul", "LKO"), new Employee("Debu", "DELHI"),
				new Employee("Manu", "NOIDA"), new Employee("Sebu", "DELHI"), new Employee("Ayshu", "Merrut"));
		
		System.out.println(list.stream().collect(Collectors.groupingBy(e->e.getCity(),
				Collectors.mapping(Employee::getName, Collectors.toList()))));
		
	}

}
