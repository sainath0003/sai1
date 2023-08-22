package com.epam.StreamApi;


import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args) {
		List<Employee> employeeList=Employee_list.add_Employee();

		Utility utility=new Utility();
		
		
		//========================================================//

		System.out.println(utility.getGenderCount(employeeList));
		
		System.out.println();
		
		
	
		
		//==========================================================//

		System.out.println(utility.getDepartmentNames(employeeList));
		

		//==========================================================//

		System.out.println(utility.getAvgerageAge(employeeList));
		

		//==========================================================//

		System.out.println("Highest paid employee's Details are :"+utility.getHighestPay(employeeList));
		System.out.println();
		
		
		//==========================================================//

		List<Employee> post2015Batch=utility.getPost2015(employeeList);
		System.out.println();
		System.out.println("List of Emlployees joined after 2015 :");

		for(Employee employee: post2015Batch)
		{
			System.out.println(employee.toString());
		}
		
		
		//==========================================================//

		Map<String, List<Employee>> departmentWiseList=utility.getListOfEmployeesDepartmentWise(employeeList);
		System.out.println();
		System.out.println("List of employees in each Department are :");
		for(Entry<String, List<Employee>> employee:departmentWiseList.entrySet())
		{
			System.out.println(employee.getKey()+" : ");
			employee.getValue().stream().forEach(t -> System.out.println(t.getName()) );
			System.out.println();
		}
		
		
		//===========================================================//

		Map<String, Double> avgSalaryOfEachDepartHashMap=null;
		avgSalaryOfEachDepartHashMap=utility.getAvgSalaryOfEachDepartment(employeeList);
		System.out.println();
		System.out.println("Average Salaries of each Departments are :");
		for(Map.Entry<String,Double> department:avgSalaryOfEachDepartHashMap.entrySet())
		{
			System.out.println(department.getKey()+" : "+department.getValue());
		}
		
		
		//============================================================//

		Employee youngestMaleEmployee = null;
		youngestMaleEmployee=utility.getYoungestMaleEmployee(employeeList);
		System.out.println();
		System.out.println("Youngest male employee's Details are :"+youngestMaleEmployee.toString());
		
		
		//===========================================================//

		Employee mostExperiencedEmployee = null;
		mostExperiencedEmployee=utility.getMostExperienceEmployee(employeeList);
		System.out.println();
		System.out.println("Most experienced employee's Details are :"+mostExperiencedEmployee.toString());
		
		
		//============================================================//
		
		System.out.println(utility.getGenderCountSalesDepartment(employeeList));
		
		//==============================================================//
		
		System.out.println(utility.getAvgSalaryGenderBased(employeeList));
		
		//================================================================//

		System.out.println(utility.getListOfNamesOfEmployeesDepartmentWise(employeeList));
		System.out.println();

		//================================================================//
		
		String employeeTemporaryString4=utility.getTotalAndAvgSalaryofOrganisation(employeeList);
		String[] temporaryStringArray4=employeeTemporaryString4.split(",");

		double totalSalary= (Double.parseDouble(temporaryStringArray4[0])*1.0);
		double avgSalary= (Double.parseDouble(temporaryStringArray4[1])*1.0);
		System.out.println();

		System.out.println("Total Salary of Organisation : "+totalSalary+" Average Salary of Organisation:"+avgSalary);
		
		
		//==================================================================//
		
		Map<Boolean, List<Employee>> temporayEmployeeList=utility.getEmployessbelow25andabove25(employeeList);
		List<Employee> below25List = temporayEmployeeList.get(true);
		List<Employee> above25List = temporayEmployeeList.get(false);
		System.out.println("List of Employees below or equal to 25 years age :");
		for(Employee employee: below25List)
		{
			System.out.println(employee.getName());
		}
		System.out.println();
		System.out.println("List of Employees above 25 years age :");
		for(Employee employee: above25List)
		{
			System.out.println(employee.getName());
		}
		System.out.println();
		
		
		//====================================================================//
		
		Employee oldestEmployee=utility.getOldestEmployee(employeeList);
		System.out.println("Oldest Employee in organisation is :");
		System.out.println(oldestEmployee.getName()+" "+oldestEmployee.getAge()+" "+oldestEmployee.getDepartment());
		
		
	}

}
