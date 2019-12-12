/**
 * 
 */
package nt.basics;

/**
 * @author mapit
 *
 */
public class ConstructorEx {
	
	private int x_co;
	private int y_co;

	/**
	 * 
	 */
	public ConstructorEx() {
		// TODO Auto-generated constructor stub
		x_co=0;
		y_co=0;
	}
	
	private ConstructorEx(int x) {
		x_co=x;
		y_co=0;
		
	}

	private ConstructorEx(int x, int y) {
		
		x_co=x;
		y_co=y;
		
	}
	
	private int getX() {
		System.out.println("Y : "+getY());
		return x_co;
	}
	
	private int getY() {
		return y_co;
	}
	
	private void showData() {
		
		System.out.println("X : "+x_co);
		System.out.println("Y : "+y_co);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorEx constructorEx = new ConstructorEx();
		constructorEx.showData();
		constructorEx = new ConstructorEx(111);
		constructorEx.showData();
		System.out.println("Only x : "+constructorEx.getX());
		constructorEx = new ConstructorEx(221, 332);
		constructorEx.showData();
		
	}

}
