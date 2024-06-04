package Listnterface;

import java.util.Stack;

public class StackOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Creating an empty Stack
        Stack<Integer> stack = new Stack<Integer>();
 
        // push operation to add elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
 
        // Displaying the Stack
        System.out.println("Initial Stack: " + stack);
        
        //adding 2 elements to initial stack
        stack.add(1,60);
        stack.add(4,80);
        System.out.println("Stack after adding elements: " + stack);
        
        // Checking for the element 80 using search method
        System.out.println("Does the stack contains '80'? "
                                       + stack.search(80)); 
 
        // Removing elements using pop() method
        System.out.println("Popped element: "
                           + stack.pop());
        System.out.println("Popped element: "
                           + stack.pop());
 
        // Displaying the Stack after pop operation
        System.out.println("Stack after pop operation "
                           + stack);
        
        // checking stack is empty or not  
		boolean result = stack.empty();  
		System.out.println("Is the stack empty? " + result);  
		
		//peek operation
		 System.out.println("element at the top of the stack: "
                 + stack.peek());
		 
		 
	   // Removing elements using pop() method
	        System.out.println("Popped element: " + stack.pop());
	        System.out.println("Popped element: " + stack.pop());
	        System.out.println("Popped element: " + stack.pop());
	        
	        
	        // checking stack is empty or not  
			boolean result1 = stack.empty();  
			System.out.println("Is the stack empty? " + result1); 
			
			
			//peek method
			 System.out.println("element at the top of the stack: " + stack.peek());
		 
	}

}
