/**
 * 
 */
package nt.assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * @author mapit
 *
 */
public class EmployeeFunctions {
	
	public static List<Employee> empList = new ArrayList<Employee>();
	
	/*
	 *  Method for Adding employee in the list
	 */
	private void addAnEmployee (Employee emp) {
		System.out.println("\n\n-- Adding new employees in the List --");
		System.out.println("New Employeed Added with Employee Code : "+emp.getCode());
		empList.add(emp);
	}
	
	/*
	 *  Method for Showing detailed breakup of the staff
	 */
	private void showAllEmployees() {
		
		System.out.println("\n\n-- Showing all the employees --");
		int totalEmp = 1;
		Employee employee = new Employee();
		for (Iterator iterator = empList.iterator(); iterator.hasNext();) { 
			Employee emp = (Employee) iterator.next();
				System.out.println("Employee : "+totalEmp);
				employee.printEmployee(emp.getCode(), emp.getName(), emp.getDesignation(), emp.getSalary(), emp.getAddress(), emp.getGender());
				totalEmp++;
			}
	}

	/*
	 *  Method for Showing detailed breakup of the staff
	 */
	private void showAllEmployees(List<Employee> list) {
		
		System.out.println("\n\n-- Showing all the employees --");
		int totalEmp = 1;
		Employee employee = new Employee();
		for (Iterator iterator = list.iterator(); iterator.hasNext();) { 
			Employee emp = (Employee) iterator.next();
				System.out.println("Employee : "+totalEmp);
				employee.printEmployee(emp.getCode(), emp.getName(), emp.getDesignation(), emp.getSalary(), emp.getAddress(), emp.getGender());
				totalEmp++;
			}
	}
	
	/*
	 *  Method for Showing employee details by employee code
	 */
	private Employee getAnEmployee(int empCode) {
		
		System.out.println("\n\n-- Showing employee details by employee code --");
		Employee employee = null;
		for (Iterator iterator = empList.iterator(); iterator.hasNext();) {
			employee = (Employee) iterator.next();
			if(employee.getCode() == empCode) {
				break;
			}
		}
		System.out.println("The Name of the Employee with the code: "+empCode+" is : "+employee.getName());
		return employee;
	}

	/*
	 *  Method for Showing list of employees with Specific Salary
	 */
	private List filterEmployeeBySalary(int salary) {
		
		System.out.println("\n\n-- Showing list of employees with Specific Salary --");
		List listOEmpBSal = new ArrayList<Employee>();
		for (Iterator iterator = empList.iterator(); iterator.hasNext();) {
			Employee emp = (Employee) iterator.next();
			if(emp.getSalary() == salary) {
//				System.out.println("--"+emp.getSalary());
				listOEmpBSal.add(emp);
				System.out.println("The Code and Name of the Employee getting salary : "+salary+", is Code : "+emp.getCode()+" and name : "+emp.getName());
			}
		}
		return listOEmpBSal;
	}
	
	/*
	 *  Method for Showing list of employees with Specific Designation
	 */
	private List filterEmployeeByDesig(String desig) {
		
		System.out.println("\n\n-- Showing list of employees with Specific Designation --");
		List listOEmpBSal = new ArrayList<Employee>();
		for (Iterator iterator = empList.iterator(); iterator.hasNext();) {
			Employee emp = (Employee) iterator.next();
			if(emp.getDesignation() == desig) {
				listOEmpBSal.add(emp);
				System.out.println("The Code and Name of the Employee with Designation : "+desig+", is Code : "+emp.getCode()+" and name : "+emp.getName());
			}
		}
		return listOEmpBSal;
	}
	
	/*
	 *  Method for Showing detailed breakup of the staff
	 */
	private void getEmployeeBreakup() {
		
		System.out.println("\n\n-- Showing detailed breakup of the staff --");
		int MalesStaff = 0;
		int feMalesStaff = 0;
		int staffA50000 = 0;
		int staffB50000 = 0;
		int empBhopalAdd = 0;
		int empIndoreAdd = 0;
		int empOtherAdd = 0;

		// How to get number of distinct designations and their occurrences
		int developers = Collections.frequency(empList, "Software Developer");

		for (Iterator iterator = empList.iterator(); iterator.hasNext();) { 
			Employee emp = (Employee) iterator.next();
				if (emp.getGender() == Employee.MALE) {
					MalesStaff++;
				} else if (emp.getGender() == Employee.FEMALE) {
					feMalesStaff++;
				}
				
				if (emp.getSalary() >= 50000) {
					staffA50000++;
				} else if (emp.getGender() < 50000) {
					staffB50000++;
				}
				
				if (emp.getAddress().equals("Bhopal")) {
					empBhopalAdd++;
				} else if (emp.getAddress().equals("Indore")) {
					empIndoreAdd++;
				} else {
					empOtherAdd++;
				}
			}
		
		System.out.println("Total Male Staff : "+MalesStaff);
		System.out.println("Total FeMale Staff : "+feMalesStaff);
		System.out.println("Total Staff Over 50000: "+staffA50000);
		System.out.println("Total Staff Below 50000: "+staffB50000);
		System.out.println("Total Staff from Bhopal: "+empBhopalAdd);
		System.out.println("Total Staff from Indore: "+empIndoreAdd);
		System.out.println("Total Staff from Other Locations: "+empOtherAdd);

	}
	
	/*
	 *  Method for Sorting list of employees with Specific Salary
	 */
//	@SuppressWarnings("unchecked")
	private List sortEmployeeList() {
		
		System.out.println("\n\n-- Sorting list of employees with Specific Salary --");
		List listOEmp = empList; 
		
		Collections.sort(listOEmp, new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				// TODO Auto-generated method stub
				return Integer.valueOf(e1.getSalary()).compareTo(e2.getSalary());
			}
		});
		
		return listOEmp;
	}
	
	/*
	 *  Method for Deleting employee from List by employee code
	 */
	private void deleteAnEmployee(int empCode) {
		
		System.out.println("\n\n-- Deleting employee from List by employee code --");
		Employee employee = null;
		for (Iterator iterator = empList.iterator(); iterator.hasNext();) {
			employee = (Employee) iterator.next();
			if(employee.getCode() == empCode) {
//				empList.remove(employee); // Throwing concurrentmodificationexception
				iterator.remove();
			}
		}
		System.out.println("The Employee with the code: "+empCode+" removed from the List ");
	}
	
	
	public static void main(String[] args) {
		
		EmployeeFunctions employeeFunctions = new EmployeeFunctions();
		employeeFunctions.addAnEmployee(new Employee(1001 ,"Amit", "Software Developer", 20000, "Bhopal", Employee.MALE));
		employeeFunctions.addAnEmployee(new Employee(1010 ,"Hitendra", "Software Developer", 20000, "Bhopal", Employee.MALE));
		employeeFunctions.addAnEmployee(new Employee(1011 ,"Neha", "Software Tester", 15000, "Bhopal", Employee.FEMALE));
		employeeFunctions.addAnEmployee(new Employee(1002 ,"Sanjay", "Business Analyst", 15000, "Indore", Employee.MALE));
		employeeFunctions.addAnEmployee(new Employee(1003 ,"Vikas", "Software Tester", 12000, "Bhopal", Employee.MALE));
		employeeFunctions.addAnEmployee(new Employee(1006 ,"Akshat", "Solution Analyst", 75000, "Delhi", Employee.MALE));
		employeeFunctions.addAnEmployee(new Employee(1007 ,"Varun", "Software Architect", 75000, "Bhopal", Employee.MALE));
		employeeFunctions.addAnEmployee(new Employee(1008 ,"Satyendra", "Support Staff", 8000, "Jabalpur", Employee.MALE));
		employeeFunctions.addAnEmployee(new Employee(1009 ,"Sumit", "Software Developer", 20000, "Chennai", Employee.MALE));
		employeeFunctions.addAnEmployee(new Employee(1012 ,"Pragati", "Software Tester", 16000, "Bhopal", Employee.FEMALE));
		employeeFunctions.addAnEmployee(new Employee(1004 ,"Kunal", "UI Designer", 18000, "Indore", Employee.MALE));
		employeeFunctions.addAnEmployee(new Employee(1005 ,"Manisha", "Project Manager", 90000, "Bhopal", Employee.FEMALE));
				
		employeeFunctions.showAllEmployees();
		Employee employee = employeeFunctions.getAnEmployee(1003);
		employeeFunctions.getEmployeeBreakup();
		List list = null; 
		list = employeeFunctions.filterEmployeeBySalary(75000);
		list = employeeFunctions.filterEmployeeByDesig("Software Developer");
		employeeFunctions.showAllEmployees(employeeFunctions.sortEmployeeList());
		employeeFunctions.deleteAnEmployee(1003);
		System.out.println("Employee List after delete : ");
		employeeFunctions.showAllEmployees();
	}

}
