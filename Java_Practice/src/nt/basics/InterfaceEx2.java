/**
 * 
 */
package nt.basics;

/**
 * @author mapit
 *
 */
public class InterfaceEx2 implements InterfaceEx {
	
	private double radius;
	private final double pie = 3.14; 
	
	
	public InterfaceEx2() {
		// TODO Auto-generated constructor stub
		radius = 0;
	}

	public InterfaceEx2(double rad) {
		// TODO Auto-generated constructor stub
		radius = rad;
	}
	
	public double getArea() {
		
		double area = pie*radius*radius; 
		return area;
		
	}

	public double getPerimeter() {
		
		double perimeter = 2*pie*radius;
		return perimeter;
		
	}
	
	private double getPieVale() {
		
		return pie;
		
	}
	
	private void printValue(char x, double value) {
		if(x == 'a') {
			
			System.out.println("Area is");
			
		} else if(x == 'p') {
			
			System.out.println("Perimeter is");
			
		} else {
			
			System.out.println("Not defined");
		}
		System.out.println(value);
		
	}
	
	public static void main(String[] args) {
		
		InterfaceEx2 ex2 = new InterfaceEx2();
		System.out.println(ex2.getArea());
		System.out.println(ex2.getPerimeter());
		
		ex2 = new InterfaceEx2(1.5);
		ex2.printValue('a', ex2.getArea());
		ex2.printValue('p', ex2.getPerimeter());
		
		System.out.println("Pie Value is "+ex2.getPieVale());
		
	}

}
