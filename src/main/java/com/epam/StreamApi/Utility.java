package com.epam.StreamApi;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Utility {

	public Map<String, Long> getGenderCount(List<Employee> employeeList) {
	 
		return employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		

	}

	public List<String> getDepartmentNames(List<Employee> employeeList) {
	
		return employeeList.stream().map(Employee::getDepartment).distinct().toList();

	}

	public Map<String, Double> getAvgerageAge(List<Employee> employeeList) {

		return employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)));
}

	public Employee getHighestPay(List<Employee> employeeList) {
	return employeeList.stream().max(Comparator.comparing(Employee::getSalary)).orElse(null);

	}

	public List<Employee> getPost2015(List<Employee> employeeList) {
		return employeeList.stream().filter(employee->employee.getYearOfJoining()<2015).toList();

	}

	public Map<String, List<Employee>> getListOfEmployeesDepartmentWise(List<Employee> employeeList) {
		return employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.toList()));
	}

	public Map<String, Double> getAvgSalaryOfEachDepartment(List<Employee> employeeList) {
		
		return employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
	}

	public Employee getYoungestMaleEmployee(List<Employee> employeeList) {
		return employeeList.stream().min(Comparator.comparing(Employee::getAge)).orElse(null);

	}

	public Employee getMostExperienceEmployee(List<Employee> employeeList) {
		return employeeList.stream().min(Comparator.comparing(Employee::getYearOfJoining)).orElse(null);

	}

	public Map<String, Long> getGenderCountSalesDepartment(List<Employee> employeeList) {
		return employeeList.stream().filter(employee->employee.getDepartment().equalsIgnoreCase("Sales And Marketing")).collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));

	}

	public Map<String, Double> getAvgSalaryGenderBased(List<Employee> employeeList) {
		return employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
	}

	public Map<String, List<Employee>> getListOfNamesOfEmployeesDepartmentWise(List<Employee> employeeList) {
		return employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.toList()));

	}

	public String getTotalAndAvgSalaryofOrganisation(List<Employee> employeeList) {
		return employeeList.stream().collect(Collectors.summingDouble(Employee::getSalary))+","+employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
	}

	public Map<Boolean, List<Employee>> getEmployessbelow25andabove25(List<Employee> employeeList) {

		return employeeList.stream().collect(Collectors.partitioningBy(employee->employee.getAge()>25));
	}

	public Employee getOldestEmployee(List<Employee> employeeList) {
		return employeeList.stream().max(Comparator.comparing(Employee::getAge)).orElse(null);
	}

}
