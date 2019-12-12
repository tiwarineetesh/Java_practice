/**
 * 
 */
package nt.basics;

/**
 * @author Neetesh Tiwari / Date : 29-05-2018
 *
 */
public class FinalEx {
	
	final int x = 10;
	int y = 20;

	/**
	 * 
	 */
	public FinalEx() {
		// TODO Auto-generated constructor stub
		//x=0; Cant be assigned
		y=0;
	}
	
	private void showData() {
		
		System.out.println("X : "+x);
		System.out.println("Y : "+y);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalEx finalEx = new FinalEx();
		finalEx.showData();

	}

}
