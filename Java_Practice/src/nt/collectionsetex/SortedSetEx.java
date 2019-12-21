/**
 * 
 */
package nt.collectionsetex;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author mapit
 *
 */
public class SortedSetEx {
	
	
	public static void main(String[] args) {
		
		
				
	    SortedSet<String> sortedSet = new TreeSet<String>(); 
	    sortedSet.add("Indore"); 
	    sortedSet.add("Bhopal"); 
	    sortedSet.add("Jabalpur"); 
	    sortedSet.add("Gwalior"); 
	  
	    System.out.println("Sorted Set: " + sortedSet);
	    System.out.println("First: " + sortedSet.first()); 
	    System.out.println("Last: " + sortedSet.last()); 
		
	    
		SortedSet<String> sortedSet2 = new TreeSet<String>();
		sortedSet2.add("my");
		sortedSet2.add("name");
		sortedSet2.add("is");
		sortedSet2.add("neetesh");
		sortedSet2.add("a");
		sortedSet2.add("b");
		sortedSet2.add("c");
		sortedSet2.add("d");
		
		System.out.println("SortedSet is : "+sortedSet2);
	    System.out.println("First: " + sortedSet2.first()); 
	    System.out.println("Last: " + sortedSet2.last()); 
		
		/*
		 * for (Iterator<String> iterator = treeSet.iterator(); iterator.hasNext();) {
		 * String treeSetValue = (String) iterator.next();
		 * System.out.println("-- "+treeSetValue);
		 * 
		 * }
		 */

	    
	}

}
