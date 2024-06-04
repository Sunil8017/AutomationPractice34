/*What is the difference between Set and Map?
The differences between the Set and Map are given below.
 Set contains values only whereas Map contains key and values both.
 Set contains unique values whereas Map can contain unique Keys with 
duplicate values.
 Set holds a single number of null value whereas Map can include a 
single null key with n number of null values.
   


The differences between the HashSet and HashMap are listed below.
 HashSet implements Set interface whereas HashMap implements the 
Map interface
 HashSet contains only values whereas HashMap includes the entry 
(key, value). 
HashSet can be iterated, but HashMap needs to convert 
into Set to be iterated.

 HashSet cannot have any duplicate value whereas HashMap can 
contain duplicate values with unique keys.
 HashSet contains the only single number of null value whereas 
HashMap can hold a single null key with n number of null values.

 */

package CollectionDifference;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

/* ## Hashset 


2.Insertion Order---not preserved---unordered data(Index not supported)
3.Duplicate elements ----not allowed
4.Multiple null ----not allowed(only single null allowed)


HashMap
1.Basically Map interface
2.HashMap is Basically Key Value Pair
3.Key  is always Unique
4.Only One Null key  Value is Allowed 
5.Value can be  duplicate 
6.Multiple null values are allowed
Insertion Order---not preserved---unordered data(Index not supported)

*/


public class DiffbetweenHashSetAndHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashSet Example 
		
      HashSet<String> hset = new HashSet<String>();
	

		// ##Adding element in myset
		hset.add("Solapur");
		hset.add("Pune");
		hset.add("Mumbai");
		hset.add("Thane");
	    hset.add(null);
		hset.add(null);
		hset.add("Pune");   // Duplicate element not allowed-- while rum time it will check duplicacy.
		

		
		// ##Printing Hashset
		System.out.println("Hashset is : " + hset);
		// ## Iterator

				Iterator it = hset.iterator();
				System.out.print("Iterator Values : ");
				while (it.hasNext()) {
					System.out.print(it.next() + "  ");

				}
				System.out.println();
				
		
		
		
 
		
		//HashMap Example 
		HashMap <Character,Integer> hm= new HashMap <Character,Integer>();
		
		hm.put('Y', 1);
		hm.put('O', 2);
		hm.put('G', 1);
		hm.put('Y',5);
		hm.put(null, 6);
		hm.put('E', null);
		hm.put('S', null);
		hm.put('Y', 7);
		hm.put('M',6);
		
		

		
		for(Entry<Character, Integer> hm1 :hm.entrySet()){
			
			System.out.println(hm1.getKey()+" "+hm1.getValue());
		   }
		
      

	}

}
