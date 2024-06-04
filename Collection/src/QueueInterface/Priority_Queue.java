package QueueInterface;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Priority_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		pq.add(4);
		pq.offer(2);
		pq.add(1);
		pq.add(3);
		pq.offer(6);
		pq.add(9);
		pq.add(5);
		pq.add(10);
		pq.add(7);
		pq.add(8);
	
		System.out.println("Priority queue content is :" + pq);
		// pq.clear();

		 System.out.println("Head of Queue :" + pq.element());
		System.out.println("Head of Queue :" + pq.peek());

		System.out.println("Head removed : " + pq.poll());
		System.out.println("Priority queue content is :" + pq);

		System.out.println("If element is present in Queue : " + pq.contains(0)); // If the element is found, it returns
																					// true, if not it returns false.
		System.out.println("Size of queue : " + pq.size());

		// Convert the deque to an array
		Object[] array = pq.toArray();// It converts a priority queue to an array
		// Print the elements in the array
		System.out.println("Convert into Array :  " + Arrays.toString(array));

		Iterator<Integer> itr = pq.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}

}
