/*
 * Array is Fixed size(Fixed length data structure) while Arraylist has Dynamic size() as its size automatically increased if you add element .
 * Arrays can hold both primitives as well as objects    ,Arraylist can hold only objects 
 * Array stores homogeneous data ,while arraylist store heterogeneous data
 * insertion deletion is difficult in array but insertion deletion is possible in arraylist .
 * The size of array is checked using length attribute. the size of an arraylist can be checked using size method().

 
 
 */

package CollectionDifference;

import java.util.ArrayList;

public class DiffArrayandArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int [] num = {1,2,3};
		//String[] str = new String[10];
		
		String[] cars = {"cars1","cars2","cars3","cars4"};
		
		System.out.println(cars.length);
		
		//int count = cars.length ;
		//System.out.println(count);
		System.out.println(cars[0]);
		System.out.println(cars[1]);
		System.out.println(cars[2]);
		System.out.println(cars[3]);
		// cars [4] = " car5";
		//System.out.println(cars[4]);
		
		
		
		 cars [0] = "new car";
		 cars [1] = " car5";
		 System.out.println("after replacing ...");
		 System.out.println(cars[0]);
		 System.out.println(cars[1]);
		
		
		
		
		
		ArrayList <Integer>  x = new   ArrayList <Integer>(); 
        x.add(50); 
        x.add(60);  
        x.add(70); 
        x.add(80);
        x.add(90);  
        x.add(100);
        x.add(300);       
        
        System.out.println(x);
        
        System.out.println(x.size());
        
        System.out.println(x.get(3));
        
        x.set(1, 110);
        System.out.println(x);
        
        x.remove(1);
        System.out.println(x);

	}

}
