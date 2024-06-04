package MapInterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 1. HashMap class implements the Map interface 
		 2. It allows us to store key and value pair 
		 3. If you try to insert the duplicate key,it will replace the element of the corresponding key.
		 4. It is easy to perform operations using the key index like updation, deletion, etc. 
        5. It allows us to store the null elements as well, but there should be only one null key.
        6. It contains only unique keys.
        7. It may have one null key and multiple null values.
        8. It is non synchronized.
        9. It maintains no order.
        10. HashMap class Parameters
               K: It is the type of keys maintained by this map.
               V: It is the type of mapped values.
		 */
		  HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap 
		  
		   map.put(1,"Mango");  //Put elements in Map  
		   map.put(2,"Apple");    
		   map.put(3,"Banana");   
		   map.put(4,"Grapes"); 
		  
		   
		 
		 
		  // No Duplicate Key on HashMap
		   
	       /*map.put(1,"Mango");    
		   map.put(2,"Apple");    
		   map.put(3,"Banana");   
		   map.put(1,"Grapes"); //trying duplicate key*/
		   
		  
		   
		   System.out.println("Iterating Hashmap...");  
		   for(Map.Entry m : map.entrySet())
		//Entry is the subinterface of Map. It provides methods to get key and value.
		   {    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   } 
		   
		   // Java HashMap example to add() elements
		  
		     map.putIfAbsent(5 ,"orange");  
		     System.out.println("After invoking putIfAbsent() method ");  
		      for(Map.Entry m:map.entrySet())
		      {    
		           System.out.println(m.getKey()+" "+m.getValue());    
		      }
		      map.put(6,"pineapple");
		      map.putAll(map);  
		      System.out.println("After invoking putAll() method ");  
		      for(Map.Entry m:map.entrySet())
		      {    
		           System.out.println(m.getKey()+" "+m.getValue()); 
		      }
		      
		      //  Java HashMap example to remove() elements
		      
		      map.remove(3);  
		      System.out.println("Updated list of elements: "+map);  
		      
		       
		      
		      //  Java HashMap example to replace() elements 
		      
		      map.replace(4, "lichi");  
		      for(Map.Entry m:map.entrySet())  
		      {  
		         System.out.println(m.getKey()+" "+m.getValue());   
		      }  
		      
		     // Checking for the key_element  contains'2' 
		        System.out.println("Is the key '2' present? " + map.containsKey(2)); 
		        
		     //  Checking for the Value contains 'guava' 
		        System.out.println("Is the value 'guava' present? " + map.containsValue("guava")); 
		     
		     //  Map equals() method in Java with Examples  
		        HashMap<Integer,String> map1=new HashMap<Integer,String>();
		           map1.put(1,"Mango");  //Put elements in Map1  
				   map1.put(2,"Apple");    
				   map1.put(3,"Banana");   
				   map1.put(4,"Grapes"); 
		       
		        // Displaying the Map 
		        System.out.println("First Map: "+ map); 
		  
		        // Displaying the Map1 
		        System.out.println("Second Map: " + map1); 
		  
		        // Checking the equality 
		        System.out.println("Equality: " + map.equals(map1));
		        
		        // Getting the value of "1"
		        System.out.println("The Value is: " + map.get(1));
		        
		        // Clearing the map using clear() 
		         map.clear(); 
		  
		        // Displaying the final HashMap 
		        System.out.println("Finally the maps look like this: " + map); 
		        
		        //the implementation of int isEmpty() method
		        System.out.println("check the map is empty or not:"+(map.isEmpty())); 
	}

}
