/*
The differences between the HashMap and TreeMap are given below.
 HashMap maintains no order, but TreeMap maintains ascending order.

 HashMap is implemented by hash table whereas TreeMap is 
implemented by a Tree structure.
 HashMap can be sorted by Key or value whereas TreeMap can be 
sorted by Key.
 HashMap may contain a null key with multiple null values whereas 
TreeMap cannot hold a null key but can have multiple null values.
*/
package CollectionDifference;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;
import java.util.Map.Entry;

public class DiffHashMapandTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TreeMap <Integer,String> tmap= new TreeMap <Integer,String>();
		tmap.put(1, "one");
		tmap.put(2, "Two");       //add element in tree map (put,putAll)
		tmap.put(3, "Three");
		tmap.put(9, "Four");
		tmap.put(8, "Eight");
		tmap.put(5, "Five");
		tmap.put(6, "Six");
		tmap.put(10, null);
		tmap.put(4,null);
		//tmap.put(null," eleven");
		
		
		
		TreeMap <Integer,String> tmap1= new TreeMap <Integer,String>();
		tmap1.putAll(tmap);  //addElement 
		tmap1.putIfAbsent(7,"Seven" );
		
		System.out.println("treemap content is : "+tmap1);
		
		
		
		//HashMap Example 
				HashMap <Character,Integer> hm= new HashMap <Character,Integer>();
				hm.put('Y', 1);
				hm.put('O', 2);
				hm.put('G', 1);
				hm.put('Y',5);
				hm.put(null, 6);
				hm.put('E', null);
				hm.put('S', null);
				hm.put('Y', 5);
				
				

				
				for(Entry<Character, Integer> hm1 :hm.entrySet()){
					
					System.out.println(hm1.getKey()+" "+hm1.getValue());
				   }
		
	}
	
	
	

}
