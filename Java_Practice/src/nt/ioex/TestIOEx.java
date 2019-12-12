/**
 * 
 */
package nt.ioex;

import java.io.IOException;

/**
 * @author mapit
 *
 */
public class TestIOEx {

	/**
	 * 
	 */
	public TestIOEx() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		System.out.println("For Printing");
		System.err.println("For Errors");
		
		int i = 0; 
		System.out.println(" I : "+i);
		try {
			i = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("This is "+i);
		
	}

}
