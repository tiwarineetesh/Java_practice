/**
 * 
 */
package nt.basics;

/**
 * @author mapit
 *
 */
public class CommandLineEx {

	/**
	 * 
	 */
	public CommandLineEx() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" ---- Printing table of letter "+args[0]+" ---- ");
		for(int i=1; i<=10; i++) {
			System.out.println(Integer.parseInt(args[0])*i);
		}

	}

}
