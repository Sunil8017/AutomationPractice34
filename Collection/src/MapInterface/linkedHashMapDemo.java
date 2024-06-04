package MapInterface;

import java.util.LinkedHashMap;
import java.util.Map;

/*
Java LinkedHashMap class hierarchy:
 1. Java LinkedHashMap class is Hashtable and Linked list implementation of the Map interface, with predictable iteration order. 
 2. It inherits HashMap class and implements the Map interface.


Features Of the LinkedHashMap:-
  1. Java LinkedHashMap contains values based on the key.
  2. Java LinkedHashMap contains unique elements.
  3. Java LinkedHashMap may have one null key and multiple null values.
  4.Java LinkedHashMap is non synchronized.
  5.Java LinkedHashMap maintains insertion order.


Declaration LinkedHashMap class:
          public class LinkedHashMap<K,V> extends HashMap<K,V> implements Map<K,V>  

LinkedHashMap class Parameters:
          K: It is the type of keys maintained by this map.
          V: It is the type of mapped values.

A LinkedHashMap is an extension of the HashMap class and it implements the Map interface. Therefore, the class is declared as:
public class LinkedHashMap extends HashMap implements Map 


*/

public class linkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Java LinkedHashMap Example
		
		
		LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
		  
		  hm.put(3,"Aishwarya");  
		  hm.put(2,"rupali");  
		  hm.put(1,"dipika");  
		  
		for(Map.Entry m:hm.entrySet())
		{  
		   System.out.println(m.getKey()+" "+m.getValue());  
		   //Entry is the subinterface of Map. It provides methods to get key and value.
	    } 
		
		//Java LinkedHashMap Example: Key-Value pair
		
		  //Fetching key
		  System.out.println("Keys: "+hm.keySet());  
	      
		  //Fetching value  
	       System.out.println("Values: "+hm.values());  
	      
	       //Fetching key-value pair  
	       System.out.println("Key-Value pairs: "+hm.entrySet());
	       
	       //Java LinkedHashMap Example:remove()
	       System.out.println("size of linkedhashmap: "+ hm.size()); 
	       hm.remove(3);
	      
	       
	       System.out.println("After invoking remove() method: "+hm);    
	}

	

}
