/* What is the difference between HashSet and TreeSet?
 The HashSet and TreeSet, both classes, implement Set interface. The 
differences between the both are listed below.
 HashSet maintains no order whereas TreeSet maintains ascending 
order.
 HashSet implemented by hash table whereas TreeSet implemented by a 
Tree structure.
 HashSet performs faster than TreeSet.

 ## HashSet 

1. Heterogeneous data----- allowed
2.***Insertion Order---not preserved---unordered data(Index not supported)***very Important
3.Duplicate elements ----not allowed
4.****Multiple null ----not allowed(only single null allowed) *****


//TreeSet

1. ****It does not follow insertion order,It follow sorting order
2. Can not store duplicate elements
3. ****it can not store null value.*****

*/


package CollectionDifference;

import java.util.HashSet;
import java.util.TreeSet;

public class DiffHashSetAndTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TreeSet<Integer> ts = new TreeSet<Integer>();// way 2

		ts.add(40);
		ts.add(20);
		ts.add(60);
		ts.add(50);
		ts.add(20);
		ts.add(30);
		ts.add(10);
		ts.add(10);// can not add duplicate value
		ts.add(11);
		//ts.add(null);// can not add null value

		System.out.println("Treeset is : " + ts);// follow sorting order 
		
		
		
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

	}

}
