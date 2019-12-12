/**
 * 
 */
package nt.inheritance;

/**
 * @author mapit
 *
 */
public class BaseClass {
	
	private String name;
	private int age;
	private double salary;
	private String address;

	/**
	 * 
	 */
	public BaseClass() {
		// TODO Auto-generated constructor stub
		
		name = "";
		age = 0;
		salary = 0;
		address = "";
		
	}

	/**
	 * 
	 */
	public BaseClass(String username, int age2, double renum, String add) {
		// TODO Auto-generated constructor stub
		
		name = username;
		age = age2;
		salary = renum;
		address = add;
		
	}

	/**
	 * 
	 */
	public void setData(String username, int age2, double renum, String add) {
		// TODO Auto-generated constructor stub
		
		name = username;
		age = age2;
		salary = renum;
		address = add;
		
	}
	
	/**
	 * 
	 */
	public void showData() {
		// TODO Auto-generated constructor stub
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
		System.out.println(address);
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
