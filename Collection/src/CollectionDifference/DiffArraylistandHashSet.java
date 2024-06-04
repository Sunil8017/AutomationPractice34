/*What is the difference between List and Set?
 The List and Set both extend the collection interface. 
 The List can contain duplicate elements whereas Set includes unique 
items.
 The List is an ordered collection which maintains the insertion order 
whereas Set is an unordered collection which does not preserve the 
insertion order.

 The List interface can allow n number of null values whereas Set 
interface only allows a single null value.
 *

Difference between Arraylist and HashSet
Arraylist implements List Interface     ---HashSet implements Set Interface in java 
Arraylist allow Duplicate value/data   ----HashSet allows only unique data 
Arraylist  multiple null value allowed ----HashSet only one null value is allowed 
In ArrayList ,insertion Order preserved ---HashSet insertion order is not preserved
Arraylist is IndexBased                 ----Hashset is Object based
Retrive object by calling get(index)Method ----HashSet Doesnot provide get method 
Remove object by calling remove(index)method 
 */



package CollectionDifference;

import java.util.ArrayList;
import java.util.HashSet;

public class DiffArraylistandHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer>  x = new   ArrayList <Integer>(); 
		x.add(1); 
		x.add(1);  
		x.add(2); 
		x.add(3);
		x.add(null);  
		x.add(null);
		x.add(null);
		x.add(2);
		x.add(3);
		x.add(5);

		System.out.println(x);
		

		HashSet<Integer>  y = new  HashSet <Integer>(); 
		y.add(1); 
		y.add(5);
		y.add(1);  
		y.add(2); 
		y.add(6);
		y.add(3);
		y.add(null);  
		y.add(null);
		y.add(null);
		y.add(2);
		y.add(3)   ; 
	



		System.out.println(y);
	}    

}