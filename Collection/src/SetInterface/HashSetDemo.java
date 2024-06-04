package SetInterface;

		/*Set Interface
		 * Member of the java collection Frameworks
		 * It extends Collection Interface
		 * Unlike Lists it cannot contains Duplicate Elements
		 * 
		 * ## Properties
		 * 1. It cannot contains duplicate elements
		 * 2. Single null element is also allowed
		 * 3.Unordered collection of Object
		 * 4. It is Non synchronized
		 * 5. It supports Generic Concepts
		 * 
		 * 
		 * ##Extended by 
		 * 1.Sorted Set-
		 * 2. Navigable set-It has a feature to navigate among the set element
		 * 
		 * ##Implemented By:
		 * 1.HashSet
		 * 2.LinkedHashSet
		 * 3.TreeSet
		 * 4.EnumSet
		 * 
		 */


		/* ## HashSet-
		 * 
		 * 1. Class in java Collection Framework
		 * 2. Implements  Set Interface
		 * 3. It uses HashTable to store  the data
		 * 4. HashSet internally uses HashMap to store the data-whenever we create Hashset object
		 *  -one HashMap object associated with it is also created
		 *  5.Elements of HashSet are stored as Keys in HashMap 
		 *  and values associated with those keys will be a constant
		 * 
		 */
		/* ## properties
		  
		1. Heterogeneous data----- allowed
		2.Insertion Order---not preserved---unordered data(Index not supported)
		3.Duplicate elements ----not allowed
		4.Multiple null ----not allowed(only single null allowed) 
		5. Default capacity/Initial capacity --is the  Initial size allocated in HashTable (16)
		6. load factor or fill ratio--How full the HashTable is allowed to get 
		before its capacity is automatically increased--(0.75)

		*/


		import java.util.ArrayList;

		import java.util.HashSet;
		//import java.util.Set;
		import java.util.Iterator;

public class HashSetDemo {

			public static void main(String[] args) {
				// ## Declaration

				// HashSet hset = new HashSet(); 1st way
				// Set hset=new HashSet(); //2nd way
				// HashSet<String> hset=new HashSet <String>(); // 3rd way

				HashSet<String> hset = new HashSet<String>();
				HashSet<String> hset1 = new HashSet<String>();

				// ##Adding element in myset
				hset.add("Solapur");
				hset.add("Pune");
				hset.add("Mumbai");
				hset.add("Thane");
				hset.add(null);
				hset.add(null);
				hset.add("Pune");   // Duplicate element not allowed-- while rum time it will check duplicacy.
				
				hset1.add("Solapur");
				
				// ##Printing Hashset
				System.out.println("Hashset is : " + hset);
				
				
				// adding element in hashset1
				hset1.addAll(hset);
				hset1.add("Kolhapur");
				System.out.println("hset1 is : " + hset1);
				
				
				System.out.println("Contains all : "+ (hset1.containsAll(hset)));


				// size of hashset
				System.out.println("size of myset: " + hset.size());

				// ##Removing element
				hset.remove("Pune");// Pune is value (not an index)
				
				System.out.println("After removing hset is : " + hset);
				System.out.println("after removing size of hset : " + hset.size());

				// ##contains
				System.out.println(hset.contains("Thane"));
				System.out.println(hset.contains("Sangali"));
				
				// ## isempty
				
				System.out.println("Is empty :"+hset.isEmpty());
				
				/*
				 * ## Inserting Element--not possible 
				 * 1. Insertion is not possible in any hashing Technique 
				 * 2. elements are stored in random order
				 */

				/*
				 * ## Access specific element-- Direct we can not access the elements from hashset 
				 * 1. we can access elements in Indirect way (alternative approach) 
				 * 2. convert set collection to arraylist
				 *
				 */

				// ## Convert Hashset --> Arraylist

				ArrayList al = new ArrayList(hset);
				System.out.println("my arraylist is : " + al);

				System.out.println("2nd index value is : " + al.get(2)); // 0th index value from array
				System.out.println("3rd index value is : " + al.get(3)); // 3rd index value
				System.out.println("Last element is : "+al.get(hset.size()-1));
				/*
				 * ## Read all elements using for loop
				 *  1. normal "for loop" ---not possible-- index is required for normal for loop 
				 *  2. we can use "for--each" loop
				 */
				System.out.print("For--Each loop values :");
				for ( Object x : hset) {
					System.out.print(x + " ");
				}
				System.out.println();
				
				// ## Iterator

				Iterator it = hset.iterator();
				System.out.print("Iterator Values : ");
				while (it.hasNext()) {
					System.out.print(it.next() + "  ");

				}
				System.out.println();
				
				hset1.removeAll(hset);
		     System.out.println("after removing all element : " +hset1);

				// ## clear all elements from hashset
				hset.clear();
				System.out.println("After clearing all element :" + hset);
				
				//isempty
				System.out.println("Is empty :"+hset.isEmpty());
			}

	}

