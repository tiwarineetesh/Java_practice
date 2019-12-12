/**
 * 
 */
package nt.basics;

/**
 * @author mapit
 *
 */
public class StringEx {
	
	

	/**
	 * 
	 */
	public StringEx() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "Belly got a bitter better butter";
		System.out.println(" ---- Printing Total Length of "+text+" ---- ");
		System.out.println(text.length());
		String[] x = text.split(" ");
		System.out.println(" ---- Printing separate words ---- ");
		for(int i=0; i<x.length; i++) {
			System.out.println(x[i]+" - "+x[i].length());
		}
		
		System.out.println(" ---- Printing words starting with b ---- ");
		for(int i=0; i<x.length; i++) {
			if(x[i].toLowerCase().startsWith("b")) {
				System.out.println(x[i]+" - "+x[i].length());
			}
		}

		System.out.println(" ---- Printing index of b ---- ");
		System.out.println(text.indexOf("b"));
		int count = 0;
		System.out.println(" ---- Printing occurrance of letter b ---- ");
		for(int i=0; i<text.length(); i++) {
			if (text.toLowerCase().charAt(i) == 'b') {
				count++;
			}
		}
		System.out.println("count : "+count);
		count = 0;
		System.out.println(" ---- Printing occurrance of letter t ---- ");
		for(int i=0; i<text.length(); i++) {
			if (text.toLowerCase().charAt(i) == 't') {
				count++;
			}
		}
		System.out.println("count : "+count);		
	}

}
