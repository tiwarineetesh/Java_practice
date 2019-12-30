/**
 * 
 */
package nt.assignment1;

/**
 * @author mapit
 *
 */
public class Employee {
	
	public String name = null;
	public String designation = null;
	public int salary = 0;
	
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Employee() {
		
		name = "";
		designation = "";
		salary = 0;
		
	}
	
	public Employee(String name, String designation, int salary) {
		
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		
		
	}
	

}
