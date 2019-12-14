/**
 * 
 */
package nt.collectionsex;

import java.util.ArrayList;

/**
 * @author mapit
 *
 */
public class ArrayListLoopExample {

	/**
	 * 
	 */
	public ArrayListLoopExample() {
		// TODO Auto-generated constructor stub
	}
	
    public static void main(String args[]) {
        // initialize ArrayList  
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        // add elements to ArrayList object
        arrayList.add(3);
        arrayList.add(17);
        arrayList.add(6);
        arrayList.add(9);
        arrayList.add(7);
        System.out.println("Using Advanced For Loop");   
        // printing ArrayList 
        for (Integer num : arrayList) {         
            System.out.println(num);   
        }
        
        // check if ArrayList contains element
        if (arrayList.contains(27)) {
            System.out.println("27 is found in the list");
        } else {
            System.out.println("27 is not found in the list");
        }
        
    }
	

}
