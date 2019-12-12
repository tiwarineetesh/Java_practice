/**
 * 
 */
package nt.inheritance;

/**
 * @author mapit
 *
 */
public class ChildClass extends BaseClass {
	
	private String name;
	private int age;
	private double salary;
	private String address;

	/**
	 * 
	 */
	public ChildClass() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param username
	 * @param age2
	 * @param renum
	 * @param add
	 */
	public ChildClass(String username, int age2, double renum, String add) {
		super(username, age2, renum, add);
		// TODO Auto-generated constructor stub
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
		super.showData();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass childClass = new ChildClass();
		childClass.showData();
		childClass = new ChildClass("neetesh", 34, 99999999, "Bhopal");
		childClass.showData();
		BaseClass childClass2 = new ChildClass();
//		ChildClass childClass3 = new BaseClass(); Not possible
		
	}

}
