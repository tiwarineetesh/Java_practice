/**
 * 
 */
package nt.collectionmapex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author mapit
 *
 */
public class HashMapEx {
	
	
	   public static void main(String args[]) 
	   { 
	       Map< String,Integer> map = new HashMap< String,Integer>(); 
	       map.put("a", new Integer(100)); 
	       map.put("b", new Integer(200));
	       map.put("c", new Integer(300));
	       map.put("d", new Integer(400));
	  
	       // Returns Set view      
	       Set<Map.Entry< String,Integer> > st = map.entrySet();    
	  
	       for (Map.Entry< String,Integer> me:st) 
	       { 
	           System.out.print(me.getKey()+":"); 
	           System.out.println(me.getValue()); 
	       }
	       
	       
	       Map map2 = new HashMap();
	       //Adding elements to map
	       map2.put(1,"Neetesh");
	       map2.put(5,"Manish");
	       map2.put(2,"Aamir");
	       map2.put(6,"Jitendra");
	       
	       //Traversing Map  
	       Set set = map2.entrySet();  
	       Iterator itr = set.iterator();  
	       while(itr.hasNext()){  
	           //Converting to Map.Entry so that we can get key and value separately  
	           Map.Entry entry=(Map.Entry)itr.next();  
	           System.out.println(entry.getKey()+" "+entry.getValue());  
	       }  
	       
	       map2.clear();
	       System.out.println("Map2 after clear : "+map2);
	       
	       Map<String, String> map3 = new HashMap<>();
	       //Adding elements to map
	       map3.put("Maruti", "Ciaz");
	       map3.put("Tata", "Nexa");
	       map3.put("Hyundai", "Creta");
	       map3.put("Honda", "City");
	       
	       System.out.println("Iterating through foreach");
	       map3.forEach((key, value) -> System.out.println("[Key] : " + key + " [Value] : " + value));

	       System.out.println("Iterating through for loop");
			for (Map.Entry<String, String> entry : map3.entrySet()) {
				System.out.println("[Key] : " + entry.getKey() + " [Value] : " + entry.getValue());
			}
	       
			
	       System.out.println("KeySet Example");

	       //Traversing Map  
	       Set set3 = map3.keySet();
	       System.out.println("Map3 values are : "+map3);
	       System.out.println("Map3 key values are : "+set3);
	       
	       Iterator itr3 = set3.iterator();
	       while(itr3.hasNext()){  
	    	   String entry=(String) itr3.next();
	    	   System.out.println(entry);
	    	   
//	           System.out.println(entry.getKey()+" "+entry.getValue());  
	       }
	       
	   }
	   
} 