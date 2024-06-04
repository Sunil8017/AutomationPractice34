package QueueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Queue using LinkedList implementation
		Queue<String> queue1 = new LinkedList<>();

		// Add elements to the queue
		queue1.add("Rajat");
		queue1.offer("Indrayani");

		queue1.add("Sachin");
		queue1.offer("Param");

		System.out.println("Queue content is " + queue1);

		//queue1.clear();
		//System.out.println("First Element:" + queue1.element());

		//System.out.println("head:" + queue1.peek());

		queue1.clear();

	   // queue1.remove();
		queue1.poll();
		System.out.println("Queue is " + queue1);

		
		// Get the size of the queue
		System.out.println("Size : " + queue1.size());

		

	}

}
