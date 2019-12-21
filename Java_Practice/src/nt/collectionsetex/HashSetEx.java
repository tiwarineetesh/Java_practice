/**
 * 
 */
package nt.collectionsetex;

import java.util.*;

/**
 * @author mapit
 *
 */


public class HashSetEx {
   public static void main(String[] args) {
		
	String[] vowels = {"a","e","i","o","u"};
		
	Set<String> vowelsSet = new HashSet<String>(Arrays.asList(vowels));
	System.out.println(vowelsSet);

	// Example for array to set
	vowelsSet.remove("e");
	System.out.println(vowelsSet);
	vowelsSet.clear();
	System.out.println(vowelsSet);
	
	Set<String> set = new HashSet<String>();
	set.add("Neetesh");
	set.add("Tiwari");
	set.add("Bhopal");
	set.add("MP");
	
	System.out.println(set);
	for (Iterator<String> iterator = set.iterator(); iterator.hasNext();) {
		String setValues = iterator.next();
		System.out.println("-- "+setValues);
	}
	
	
   }
}