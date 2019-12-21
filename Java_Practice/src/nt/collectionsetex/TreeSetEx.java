/**
 * 
 */
package nt.collectionsetex;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author mapit
 *
 */
public class TreeSetEx {

	/**
	 * 
	 */
	public TreeSetEx() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String[] args) {
		
		// With String value
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("My");
		treeSet.add("Name");
		treeSet.add("Is");
		treeSet.add("Neetesh");
		
		System.out.println("TreeSet is : "+treeSet);
		
		for (Iterator<String> iterator = treeSet.iterator(); iterator.hasNext();) {
			String treeSetValue = (String) iterator.next();
			System.out.println("-- "+treeSetValue);
			
		}
		
		treeSet.clear();
		System.out.println("TreeSet is : "+treeSet);
		
		
		//Checking with Integer
		Set<Integer> treeSet2 = new TreeSet<Integer>();
		treeSet2.add(12);
		treeSet2.add(22);
		treeSet2.add(45);
		treeSet2.add(78);
		treeSet2.add(21);
		treeSet2.add(56);
		treeSet2.add(34);

		System.out.println("TreeSet is : "+treeSet2);
		
		for (Iterator<Integer> iterator = treeSet2.iterator(); iterator.hasNext();) {
			int treeSetValue = iterator.next();
			System.out.println("-- "+treeSetValue);
			
		}
		
	}

}
