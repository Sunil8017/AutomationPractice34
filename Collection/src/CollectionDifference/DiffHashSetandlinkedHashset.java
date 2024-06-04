package CollectionDifference;

import java.util.HashSet;
import java.util.LinkedHashSet;

/* ## HashSet 

1. Heterogeneous data----- allowed
2.*****Insertion Order---not preserved---unordered data(Index not supported)***very Important
3.Duplicate elements ----not allowed
4.Multiple null ----not allowed(only single null allowed) 
*/

/* ##Linked HashSet
1.Heterogeneous data----- allowed
2.*****Insertion Order--- preserved--ordered data  ***very Important
3.Duplicate elements ----not allowed
Multiple null ----not allowed(only single null allowed) 
*/


public class DiffHashSetandlinkedHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Declaration
		LinkedHashSet<Integer> mylset = new LinkedHashSet<Integer>();

//## Add elements
		mylset.add(400);
		mylset.add(200);
		mylset.add(100);
		mylset.add(500);
		mylset.add(500);
		mylset.add(null);
		mylset.add(null);
		
		
		
		System.out.println("My linked hashset is : " + mylset);

		System.out.println("size of linked Hashset is : " + mylset.size());
		
		
		
		
		HashSet<String> hset = new HashSet<String>();
	

		// ##Adding element in myset
		hset.add("Solapur");
		hset.add("Pune");
		hset.add("Mumbai");
		hset.add("Mumbai");
		hset.add("Thane");
		hset.add(null);
		hset.add(null);
		hset.add("Pune");   // Duplicate element not allowed-- while rum time it will check duplicacy.
		

		
		// ##Printing Hashset
		System.out.println("Hashset is : " + hset);

	}

}
