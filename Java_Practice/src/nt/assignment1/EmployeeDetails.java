/**
 * 
 */
package nt.assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author mapit
 *
 */
public class EmployeeDetails {
	
	
	public static void main(String[] args) {
		
//		Employee employee = new Employee();
//		Employee employee2 = new Employee("Neetesh Tiwari", "Consultant", 100000);
//		
//		Map<Employee, String> map = new HashMap<Employee, String>();
//		
//		Map<Employee, Integer> map2 = new HashMap<Employee, Integer>();
//		map2.put(employee2, employee2.salary);
				
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Emp Name 1", "Emp Design 1", 20000));
        employees.add(new Employee("Emp Name 2", "Emp Design 2", 15000));
        employees.add(new Employee("Emp Name 3", "Emp Design 3", 12000));
        employees.add(new Employee("Emp Name 4", "Emp Design 4", 18000));

        Collections.sort(employees, new Comparator<Employee>() {

            @Override
            public int compare(Employee employee1, Employee employee2) {
                if( employee1.getSalary() > employee2.getSalary()) {
                	
                	return 1;
                	
                } else if( employee1.getSalary() < employee2.getSalary()) {
                	
                	return -1;
                	
                }
                
                return 0;

            }
        });
        
        System.out.println("Employees : "+employees);
        
        for (Iterator iterator = employees.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			System.out.println(employee);
			System.out.println("Name: "+employee.getName()+" | "+"Designation: "+employee.getDesignation()+" | "+"Salary: "+employee.getSalary());
			
		}
		
	}

}
