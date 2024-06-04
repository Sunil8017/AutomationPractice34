package Listnterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();

		// add(Object)= to add an element at the end

		ll.add("Prajakta");
		ll.add("Rahul");
		ll.add("Apurva");
		ll.add("Darshan");
		ll.add("Shraddha");
		ll.add("Sharad");
		ll.add("Nita");
		ll.add("Tanuja");

		System.out.println("Initial LinkedList: ");
		System.out.println(ll);
		System.out.println();

		// add(int index, Object)= to add an element at a specific index

		ll.add(1, "Omkar");
		System.out.println(ll);
		System.out.println();

		// set(int index, Object)=change the element
		// this method takes an index and the updated element which needs to be inserted
		// at that index.

		ll.set(4, "Girish");
		System.out.println("Updated /set  LinkedList: ");
		System.out.println(ll);
		System.out.println();

		// addFirst(E e)=This method Inserts the specified element at the beginning of
		// this list.
		// addLast(E e)=This method Appends the specified element to the end of this
		// list.

		ll.addFirst("Rohit");
		System.out.println("Add First element: ");
		System.out.println(ll);
		System.out.println();

		ll.addLast("Shubham");
		System.out.println(" Add last element: ");
		System.out.println(ll);
		System.out.println();

		// remove(Object)=to simply remove an object
		// remove(int index)=removes the element present at that specific index
		// remove=This method retrieves and removes the head (first element) of this
		// list.
		// This method is overloaded to perform multiple operations based on different
		// parameters.

		/*
		 * ll.remove(); System.out.println("After remove operation: " +ll);
		 * System.out.println();
		 */

		ll.remove("Nita");
		System.out.println(" The object remove : " + ll);
		System.out.println();

		ll.remove(5);
		System.out.println(" The index remove : " + ll);
		System.out.println();

		// removeFirst()=This method removes and returns the first element from this
		// list.
		// removeLast()=This method removes and returns the last element from this list.

		ll.removeFirst();
		System.out.println("First element remove: " + ll);
		System.out.println();

		ll.removeLast();
		System.out.println("Last element remove: " + ll);
		System.out.println();
		
		//removeFirstOccurrence(Object o)=This method removes the first occurrence of the specified element in this list
		ll.removeFirstOccurrence("Prajakta");
		System.out.println("Removed First occurrence of 'Prajakta' from the list : " +ll);
		System.out.println();

		
		//removeLastOccurrence(Object o)=removes the last appearance of that element in the list.
		
		ll.removeLastOccurrence("Tanuja");
		System.out.println("Removed Last occurrence of 'Tanuja' from the list : " +ll);
		System.out.println();

		// size()=This method returns the number of elements in this list.
		System.out.println("The size of the linked list is: " + ll.size());
		System.out.println();
        
		//offerFirst(E e)=inserts the specified element at the front of this list.  
		//offerLast(E e)=inserts the specified element at the end of this list. 
		
		System.out.println("Insert the specific element at the first of the list " );
		//ll.offer("Supriya");
		ll.offerFirst("Aarya");
		ll.offerFirst("Vaishnavi");
		ll.offerFirst("Sapna");
		System.out.println(ll);
		System.out.println();
		
		System.out.println("Insert the specific element at the last of the list " );
		ll.offerLast("Krupa");
		ll.offerLast("Shweta");
		ll.offerLast("Gayatri");
		System.out.println(ll);
		System.out.println();
		
		
		//getFirst()=the first element in this list.
		//getLast()=the last element in this list.
		
		System.out.println("Element at 1st index is : "+ ll.getFirst());
		System.out.println();
        
		System.out.println("Element at last index is : "+ll.getLast());
        
		System.out.println();
        
		System.out.println("Element at 1st index is : "+ ll.get(3));
		System.out.println();

	
		//contains(Object element) =used to check whether an element is present 
		
		System.out.println("Check List contains 'Aarati': " + ll.contains("Aarti"));
		System.out.println();

		System.out.println("Check List contains 'Apurva': " + ll.contains("Apurva"));
		System.out.println();
		
		
		// toArray()=Convert LinkedList into an Array the method has
		// no parameter

		Object[] a = ll.toArray();
		System.out.print("After converted LinkedList to Array: ");
		for (Object element : a)
			System.out.print(element + " ");
		System.out.println();
		System.out.println();


		/*
		 * // toArray(arrayName) – with parameter
		 * 
		 * // Creating the array and using toArray() String[] arr = new String[9];
		 * ll.toArray(arr); System.out.print("After converted LinkedList to Array: ");
		 * for (String elements : ll) System.out.print(elements + " ");
		 * 
		 */

		// addAll(Collection C)=to append all of the elements from the collection passed
		// as parameter to this function
		// to the end of a list keeping in mind the order of return by the collections
		// iterator.
         
		
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("10");
		list.add("20");
		list.add("30");
		list.add("40");
		list.add("50");

		
		Collection<String> collect = new ArrayList<String>();
		collect.add("60");
		collect.add("70");
		collect.add("80");
		collect.add("90");
		collect.add("100");

		System.out.println("The LinkedList is: " + list);

		// Appending the collection to the list
		list.addAll(collect);

		System.out.println("The new linked list is: " + list);
		System.out.println();
		
		//addAll(int index, Collection C)=at a specific index or position of a list.
		
		list.addAll(1, collect); 
	    System.out.println("The new linked list is: " + list); 
		System.out.println();



		
		 Iterator<String> itr=ll.iterator(); 
		 while(itr.hasNext()) {
		 System.out.println(itr.next()); 
		 }
		 
		 
		 Iterator<String> itr1=list.iterator(); 
		 while(itr1.hasNext()) {
			 
		 System.out.println(itr1.next()); 
	}


	}
}	


