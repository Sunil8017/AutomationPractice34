package QueueInterface;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<String> dq = new ArrayDeque<>(); // Array implementation of Deque

		dq.add("Ajay");
		System.out.println(dq);

		dq.add("Balaji");
		System.out.println(dq);

		dq.offerFirst("Indrayani");
		System.out.println(dq);

		dq.addLast("Param");
		System.out.println(dq);
		
		dq.addLast("Ishaan");
		System.out.println(dq);

		dq.offerLast("Raj");
		System.out.println(dq);

		dq.offer("null"); // try to add null - throws exception
		System.out.println("Deque is : " + dq);

		// get element
		System.out.println("Get First Element : " + dq.getFirst());
		System.out.println("Get Last Element : " + dq.getLast());

		// peak element
		System.out.println("Head Element : " + dq.peekFirst());
		System.out.println("Last Element : " + dq.peekLast());

		// remove element
		System.out.println("Remove First Element : " + dq.removeFirst());
		System.out.println("Remove Last Element : " + dq.removeLast());

		System.out.println("Deque is : " + dq);

		// dq.clear();
		// poll- Returns null if the deque is empty.
		System.out.println("Remove first element : " + dq.poll());
		System.out.println("Remove First element : " + dq.pollFirst());
		System.out.println("remove Last element : " + dq.pollLast());

		System.out.println("Updated Deque : " + dq);

	}

}
