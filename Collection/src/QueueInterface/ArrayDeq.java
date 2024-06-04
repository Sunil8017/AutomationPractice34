package QueueInterface;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> adequeint = new ArrayDeque<>();// Creating Integer Type ArrayDeque
		adequeint.add(1);
		System.out.println("" + adequeint);
		adequeint.add(2);
		System.out.println("" + adequeint);
		adequeint.addLast(42);
		System.out.println("" + adequeint);
		adequeint.addFirst(15);
		System.out.println("" + adequeint);
		adequeint.addFirst(5);
		System.out.println("" + adequeint);
		adequeint.addLast(26);
		System.out.println("" + adequeint);
		adequeint.offerFirst(10);
		System.out.println("" + adequeint);
		adequeint.addFirst(3);
		System.out.println("" + adequeint);
		adequeint.offerLast(7);
		System.out.println("" + adequeint);
		int remfirst = adequeint.removeFirst();
		int remlast = adequeint.removeLast();
		int getfirst = adequeint.getFirst();
		int getlast = adequeint.getLast();

		System.out.println("Removed first element is: " + remfirst + ", Removed last element is: " + remlast);
		System.out.println("First element is: " + getfirst + ", Last element is: " + getlast);

		System.out.println("Deque is: " + adequeint);// Displaying the ArrayDeque on console

		int headElement = adequeint.peekFirst();// It returns head of the ArrayDeque
		System.out.println("Head Element of Deque is: " + headElement);// Displaying the Head Element of ArrayDeque
		
		int lastElement = adequeint.peekLast();
		System.out.println("Last Element of Deque is "+ lastElement);
		
		int pollElement = adequeint.pollFirst();
		System.out.println("Remove first element : "+ pollElement);
		
		int pollElementLast = adequeint.pollLast();
		System.out.println("Remove Last element : "+ pollElementLast);
		
		System.out.println("Updated Deque: " + adequeint);// Displaying the ArrayDeque on console
		System.out.println("Contains() : " + adequeint.contains(2));
		System.out.println("Size of Queue : "+adequeint.size());
		System.out.println("Clone Element : "+adequeint.clone());// Creates a copy of ArrayDeque.

		// Get an iterator over the elements in the Arraydeque
		Iterator<Integer> iterator = adequeint.iterator();

		// Iterate over the elements using the iterator
		while (iterator.hasNext()) {
			System.out.print (iterator.next()+" " );
		}
		System.out.println("\n------------------------------------------------------");
		// Get an iterator over the elements in the Arraydeque in descending order
		Iterator<Integer> iterator1 = adequeint.descendingIterator();

		// Iterate over the elements using the iterator
		while (iterator1.hasNext()) {
			System.out.print(iterator1.next() +" ");
		}
	}

}
