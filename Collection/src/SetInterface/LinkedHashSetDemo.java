/* ##Linked HashSet
1.Heterogeneous data----- allowed
2.Insertion Order--- preserved--ordered data
Duplicate elements ----not allowed
Multiple null ----not allowed(only single null allowed) 
*/


package SetInterface;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaration
				LinkedHashSet<Integer> mylset = new LinkedHashSet<Integer>();

		//## Add elements
				mylset.add(400);
				mylset.add(200);
				mylset.add(100);
				mylset.add(500);
				mylset.add(null);
				
				
				System.out.println("My linked hashset is : " + mylset);

				System.out.println("size of linked Hashset is : " + mylset.size());

		//## remove element

				mylset.remove(500); // value will be removed
				System.out.println("Linked hashset after removing an element :" + mylset);
				System.out.println("size of mylset : " + mylset.size());

				//System.out.println(mylset.getFirst());// Accessing first element
				//System.out.println(mylset.getLast());// Accessing last element

			mylset.clear();
			System.out.println(mylset);
				
				System.out.println(mylset.isEmpty());
				
	}
}

				
		
