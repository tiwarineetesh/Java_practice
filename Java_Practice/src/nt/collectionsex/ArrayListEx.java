/**
 * 
 */
package nt.collectionsex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author mapit
 * My practice program to store values in arraylist and iterate throuh
 * iterator and foreach 
 */


public class ArrayListEx {
	
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("This");
		list.add("is");
		list.add("my");
		list.add("ArrayList");
		list.add("Program");
		
		
		System.out.println("List is : "+list);
		
		System.out.println("\n\nThrough Iterator");
		
		Iterator<String> iterator = list.iterator();
		int x = 1;
		while (iterator.hasNext()) {
			String listItem = (String) iterator.next();
			System.out.println(x+" - "+listItem);
			x++;
		}
		
		System.out.println("\rThrough foreach loop");		
		x = 1;
		for (String listItem : list) {
			
			System.out.println(x+ "- "+listItem);
			x++;
		}

		
		System.out.println("\n\nBy simple for loop");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));			
		}
		
	}

}
