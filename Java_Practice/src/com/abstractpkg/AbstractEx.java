/**
 * 
 */
package com.abstractpkg;

/**
 * @author mapit
 *
 */
public abstract class AbstractEx { 
	
	public int salary = 1000000;

	/**
	 * 
	 */
	public abstract void showPersonalInfo();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractEx abstractEx = new AbstractEx() {
			
			@Override
			public void showPersonalInfo() {
				// TODO Auto-generated method stub
				
				System.out.println("Salary is : "+salary);
				
			}
		};

	}

}
