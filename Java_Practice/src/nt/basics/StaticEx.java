package nt.basics;

public class StaticEx {
	
	
	private static String name = "Neetesh Tiwari";	
	private static int value = 10000; // Class Data
	private int v = 10000; // Object Data

	public StaticEx() {
		// TODO Auto-generated constructor stub
		System.out.println("Name is : "+name);
		value++;
		v++;
	}
	
	public StaticEx(String name2) {
		// TODO Auto-generated constructor stub		
		name = name2; 
		System.out.println("Name is : "+name);
		value++;
		v++;
	}

	public static int getValue() {
		
		return value;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticEx staticEx = new StaticEx();
		StaticEx staticEx2 = new StaticEx("Ram");
		StaticEx.name = "Krishna";
		System.out.println("Name :: "+StaticEx.name);
		System.out.println("Value :: "+StaticEx.value); // Class Data
		System.out.println("V :: "+staticEx2.v); // Object Data
		
		System.out.println("Value :: "+StaticEx.getValue()); // Class Data
		System.out.println("V :: "+staticEx2.getValue()); // Object Data
	}

}
