/**
 * 
 */
package nt.collectionsex;

import java.util.HashSet;

/**
 * @author mapit
 *
 */
public class HashSetContainsExample {
	
    public static void main(String args[]) {
        // initialize HashSet  
        HashSet<Integer> hs = new HashSet<Integer>();
        // add elements to HashSet object
        hs.add(3);
        hs.add(17);
        hs.add(6);
        hs.add(9);
        hs.add(7);
        
        for (Integer num : hs) {         
            System.out.println(num);   
        }
        
        
        // check if HashSet contains element
        if (hs.contains(7)) {
            System.out.println("7 was found in the list");
        } else {
            System.out.println("7 was not found in the list");
        }
    }

}
