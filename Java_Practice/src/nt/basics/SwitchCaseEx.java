/**
 * 
 */
package nt.basics;

/**
 * @author Neetesh Tiwari / 28-05-2018
 *
 */
public class SwitchCaseEx {
	
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c = 'f';
/*		int x;
		long y;
		String z;
		boolean x1;
		float y1;
		double z1;
		short zb;
		byte ab;
		char bc;
		*/
		
		switch(c)
		{
		
		case 'a':
			System.out.println("Its a vowel a");
			break;
		case 'e':
			System.out.println("Its a vowel e");
			break;
		case 'i':
			System.out.println("Its a vowel i");
			break;
		case 'o':
			System.out.println("Its a vowel o");
			break;
		case 'u':
			System.out.println("Its a vowel u");
			break;
		default:
			System.out.println(c+" is not a vowel");
			
		}
		
		
	}

}
