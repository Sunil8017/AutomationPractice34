package Listnterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ArraylistMethod {


		public static void main(String[] args) {
			
		//String ArrayList
			ArrayList<String> col=new ArrayList<String>();
			col.add("Red");
			col.add("Black");
			col.add("Blue");
			col.add("Pink");
			col.add("Yellow");
			col.add("Orange");
			col.add("Blue");
			col.add("Black");
			System.out.println(col);
			System.out.println("-------Methods of ArrayList-----------");
			
			System.out.println("Size of ArrayList: " +col.size());
			System.out.println("Get Elements: " +col.get(3));
			
			System.out.println("Contains: "+col.contains("green"));
			
			System.out.println("hascode Value: "+col.hashCode());
			
			System.out.println("Frist Occurance :"+col.indexOf("Blue"));
			
			System.out.println("Last Occurance : "+col.lastIndexOf("Black"));
			
			System.out.println("Is Empty: "+col.isEmpty());
			
			col.remove(4);
			System.out.println("After Removing specific element :"+col);
			
			col.set(3, "Purple");
			System.out.println("After Replacing Element Pink :" +col);
			
			
			//Sorting elements
			Collections.sort(col);
			System.out.println("------sorted Collection is--------");
			System.out.println(col);
			
		/*	ListIterator<String>list=col.listIterator(3);
			while(list.hasPrevious())
			{
				System.out.print(list.previous() +" ");
			}
		*/	
			
			
			
		//Integer arrayList 
			ArrayList<Integer> marks = new ArrayList<Integer>();
			marks.add(67);
			marks.add(45);
			marks.add(78);
			marks.add(89);
			marks.add(67);
			marks.add(93);
			marks.add(11);
			// marks.add(null);
			System.out.println(marks);

			System.out.println("Size of ArrayList: " + marks.size());
			System.out.println("Get Elements: " + marks.get(3));
			System.out.println("Get Elements: " + marks.get(4));
			System.out.println("Get Elements: " + marks.get(5));
			System.out.println("Get Elements: " + marks.get(0));
			System.out.println("Contains: " + marks.contains(89));
			System.out.println("Contains: " + marks.contains(30));
			System.out.println("hascode Value: " + marks.hashCode());
			System.out.println("First Occurance :" + marks.indexOf(67));
			System.out.println("First Occurance :" + marks.indexOf(89));
			System.out.println("Last Occurance :" + marks.lastIndexOf(11));
			System.out.println("Last Occurance :" + marks.lastIndexOf(67));
			System.out.println("Is Empty: " + marks.isEmpty());
			System.out.println(marks);

			System.out.println("Is Remove: " + marks.remove(5));
			// System.out.println(marks);
			System.out.println("After Removing specific element :" + marks);
			System.out.println("After Adding specific element :" + marks.set(3, 99));
			System.out.println(marks);

			//Collection in Ascending order
			
			Collections.sort(marks);
			System.out.println("------sorted Collection is--------");
			System.out.println(marks);

				
					

			ListIterator<Integer> list = marks.listIterator();
				System.out.println("Elements iterates in Forward Direction");
				while (list.hasNext()) {
					
					System.out.print(list.next() + " ");
			
				}	
					

				
			ListIterator<Integer> list1 = marks.listIterator(6);
			 System.out.println("Elements iterates in BackWard Direction");
			while (list1.hasPrevious()) {
				
				System.out.print(list.previous() + " ");
				
			}
	}

}
