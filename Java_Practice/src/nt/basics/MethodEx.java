/**
 * 
 */
package nt.basics;

/**
 * @author Neetesh Tiwari / 28-05-2018
 *
 */
public class MethodEx {
	
	private int x_co;
	private int y_co;
	
	private void setData(int x, int y) {
		
		x_co = x;
		y_co = y;
		
	} 
	
	private void showData() {
		
		System.out.println("X : "+x_co);
		System.out.println("Y : "+y_co);
		
	}
	private int getX() {
		return x_co;
	}
	private int getY() {
		return y_co;
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodEx ex = new MethodEx();
		ex.setData(10, 20);
		ex.showData();
		System.out.println(ex.getX());
		System.out.println(ex.getY());
		

	}

}
