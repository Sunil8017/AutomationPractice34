package MapInterface;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//create Treemap 
	TreeMap <Integer,String> tmap= new TreeMap <Integer,String>();
	tmap.put(1, "one");
	tmap.put(2, "Two");       //add element in tree map (put,putAll)
	tmap.put(3, "Three");
	tmap.put(4, "Four");
	tmap.put(5, "Five");
	tmap.put(6, "Six");
	
	
	TreeMap <Integer,String> tmap1= new TreeMap <Integer,String>();
	tmap1.putAll(tmap);  //addElement 
	tmap1.putIfAbsent(7,"Seven" );
	
	System.out.println("treemap content is : "+tmap1);
	
	
	//access element from Treemap (get or getorDefault)
	System.out.println("value of key = 7 : "+tmap.getOrDefault(7, "default"));
	
	System.out.println("value of key = 4 : "+tmap.getOrDefault(4, "default"));
	
	//Remove element from treeMap
	
	tmap.remove(6);
	
	System.out.println("treemap content is : "+tmap);
	
	//Replace element 
	tmap.replace(4, "Forty");
		
	}

}
