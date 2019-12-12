/**
 * 
 */
package com.abstractpkg;

/**
 * @author mapit
 *
 */
public class AbstractEx2 extends AbstractEx {

	/**
	 * 
	 */
	public AbstractEx2() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractEx2 abstractEx2 = new AbstractEx2();
		abstractEx2.salary = 1000099;
		abstractEx2.showPersonalInfo();
	}

	@Override
	public void showPersonalInfo() {
		// TODO Auto-generated method stub
		System.out.println(salary);
		
	}

}
