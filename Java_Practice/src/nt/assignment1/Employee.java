/**
 * 
 */
package nt.assignment1;

/**
 * @author mapit
 *
 */
public class Employee {
	
	public int code = 0;
	public String name = null;
	public String designation = null;
	public int salary = 0;
	public String address = null;
	public short gender = 0;
	
    public static final short MALE = 0;
    public static final short FEMALE = 1;
	
	public Employee(int code, String name, String designation, int salary, String address, short gender) {
		
		this.code = code;
		this.name = name;
		this.designation = designation;
		this.salary = salary;	
		this.address = address;
		this.gender = gender;
		
	}
	
	public void printEmployee(int code, String name, String designation, int salary, String address, short gender) {
		
		String gender1 = (gender == Employee.MALE) ? "Male" : "Female";
		System.out.println("Code : ["+code+"] Name: ["+name+"] Designation : ["+designation+"] Salary: ["+salary+"] Address: ["+address+"] Gender: ["+gender1+"]");
		
		
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

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
	
	public short getGender() {
		return gender;
	}

	public void setGender(short gender) {
		this.gender = gender;
	}

	public Employee(int code, String name, String designation, int salary) {
		
		this.code = code;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		
		
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	

}
