/**
 * 
 */
package nt.basics;

import java.util.*;

/**
 * @author mapit
 *
 */
public class CollectionsDemo {
	
	
	private ArrayList<String> list = new ArrayList<>();
	private List<String> list2 = new LinkedList();
	private Set<Integer> set = new HashSet<>();
	

	/**
	 * 
	 */
	public CollectionsDemo() {
		// TODO Auto-generated constructor stub
		
		list.add("Neetesh");
		list.add("Tiwari");
		list.add("Bhopal");
		
		list2.add("Manish");
		list2.add("Sharma");
		list2.add("Pune");
//		list2.addL
//		
//		set.add(14);
//		set.add(11);
//		set.add(4);
//		
	}
	
	public void showData() {
		
		System.out.println("ArrayList");
		System.out.println(list);
		System.out.println("LinkedList");
		System.out.println(list2);
		System.out.println("Set");
		System.out.println(set);

		
	} 
	
	public static void main(String[] args) {
		
		CollectionsDemo collectionsDemo = new CollectionsDemo();
		collectionsDemo.showData();
		
	}

}
