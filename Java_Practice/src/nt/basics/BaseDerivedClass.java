package nt.basics;


class Base {
	
	protected final void getInfo() {
		System.out.println("Base class method");
	}
}

public class BaseDerivedClass extends Base {
	
	
/*	protected final void getInfo() {		
		System.out.println("Method of Derived Class");
	}*/
	
	public static void main(String args[]) {
		
		Base obj = new BaseDerivedClass();
		obj.getInfo();
	}
}


