package SetInterface;

import java.util.Iterator;
import java.util.TreeSet;

//Tree set is the direct implemented class of navigable set but indirectly implements
//sorted and set interface

//Properties:
//1. It is not index based data structure
//2. It does not follow insertion order
//3. It follow sorting order
//4. It always store same data type elements
//5. Can not store duplicate elements
//6. It is non-sychronized data structure
//7. it can not store null value.


public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SortedSet<Integer> ts=new TreeSet<Integer>();// Way 1

				TreeSet<Integer> ts = new TreeSet<Integer>();// way 2

				ts.add(40);
				ts.add(20);
				ts.add(60);
				ts.add(50);
				ts.add(20);
				ts.add(30);
				ts.add(10);
				ts.add(10);// can not add duplicate value
				ts.add(11);
				//ts.add(null);// can not add null value

				System.out.println("Treeset is : " + ts);// follow sorting order not insertaion order
				System.out.println("first element : " + " " + ts.first());
				System.out.println("last element : " + " " + ts.last());

				ts.pollLast();
				System.out.println("remove last element : " + " " + ts);

				ts.pollFirst();
				System.out.println("Remove first element : " + " " + ts);

				// ts.headSet(30);
				// System.out.println("Headset is : "+ts); /// Need more clarification on this
				// line
				System.out.println(" Headset is : " + ts.headSet(11));

				System.out.println("Tailset is: " + ts.tailSet(50));

				System.out.println(ts.contains(10));

				Iterator<Integer> it = ts.iterator();
				while (it.hasNext()) {

					System.out.println(it.next());
				}

				///////////////////////////////////////////////////////////////////////

				TreeSet<String> tt = new TreeSet<String>();

				tt.add("A");
				tt.add("B");
				tt.add("E");
				tt.add("a");
				tt.add("Z");
				tt.add("H");

				// tt.add(100);//only same data type elements
				System.out.println("my treeSet is : " + tt);

				System.out.println("celling value : " + tt.ceiling("W")); // next to that element
				System.out.println("floor value : " + tt.floor("A")); // before to that element
				System.out.println("higher element of B is : " + tt.higher("Z"));
				System.out.println("lower element of B is : " + tt.lower("A"));

				ts.clear(); // clear method to clear all element
				System.out.println("After clearing treeset is : "+ts);
			}

		}


