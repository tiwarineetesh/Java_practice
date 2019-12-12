/**
 * 
 */
package nt.collectionsex;

import java.util.Hashtable;
import java.util.Vector;

/**
 * @author mapit
 *
 */
public class CollectionsTest1 {

	/**
	 * 
	 */
	public CollectionsTest1() {
		// TODO Auto-generated constructor stub
	}

	public static void main (String[] args) 
	{ 
		// Creating instances of array, vector and hashtable 
		int arr[] = new int[] {1, 2, 3, 4}; 
		Vector<Integer> v = new Vector(); 
		Hashtable<Integer, String> h = new Hashtable(); 
		v.addElement(1); 
		v.addElement(2); 
		h.put(1,"india"); 
		h.put(2,"bhopal"); 

		// Accessing first element of array, vector and hashtable 
		System.out.println(arr[0]); 
		System.out.println(v.elementAt(0)); 
		System.out.println(h.get(1)); 

	} 
	
}
