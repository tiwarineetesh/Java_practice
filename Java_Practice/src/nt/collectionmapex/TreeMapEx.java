/**
 * 
 */
package nt.collectionmapex;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author mapit
 *
 */
public class TreeMapEx {
	
	public static void main(String[] args) {
		
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(1001, "Roll Number");
		treeMap.put(2111221, "Identity Card Number");
		treeMap.put(122298, "Library Card Number");
		treeMap.put(32, "Age");
		treeMap.put(982700000, "Mobile Number");
		
		System.out.println("TreeMap is : "+treeMap);
		
		System.out.println("Iterating through foreach");
		treeMap.forEach((key, value) -> System.out.println("[Key] : " + key + " [Value] : " + value));

		System.out.println("Iterating through for loop");
		for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
			System.out.println("[Key] : " + entry.getKey() + " [Value] : " + entry.getValue());
		}
		
		
		Set<Integer> set = treeMap.keySet();
		
		
       


	}

}
