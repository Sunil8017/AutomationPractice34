
/*What is the difference between HashMap and Hashtable?
No. HashMap Hashtable
common both having map interface , with common method put,get,contains method 
1) HashMap is not synchronized. Hashtable is synchronized.
2) HashMap can contain one null key and multiple null values.
Hashtable cannot contain any null key or null value.
3) HashMap is not ?thread-safe,? so it is useful for non-threaded 
applications.
Hashtable is thread-safe, and it can be shared between various 
threads.


*/


package CollectionDifference;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;

public class DiffHashMapAndHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		
		
		//hashtable 
		
		Hashtable <Integer,String> ht= new	Hashtable <Integer,String> ();
		
		ht.put(1, "java");
		ht.put(2, "Phython");
		ht.put(3, "Selenium");
		ht.put(4, "cpp");
		
	//  ht.put(5, null);                     //Exception as null pointer exception.
    	//ht.put(null,"null_check");
		
		Enumeration e = ht.elements();  //used for hashtable iteration 
		System.out.println("Size before iteration :"+ht.size());
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
			ht.remove(4,"cpp");
		}
		System.out.println("Size before iteration :"+ht.size());
				
		
		
	}

	


}
