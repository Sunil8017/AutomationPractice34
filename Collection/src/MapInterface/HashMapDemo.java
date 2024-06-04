package MapInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap <Character,Integer> hm= new HashMap <Character,Integer>();
		hm.put('Y', 1);
		hm.put('O', 2);
		hm.put('G', 1);
		hm.put('Y',5);
		hm.put(null, 6);
		hm.put('E', null);
		hm.put('S', null);
		hm.put('Y', 5);
		
		
		System.out.println(hm.size());
		System.out.println(hm.get('Y'));
		System.out.println(hm.get('G'));
		System.out.println(hm.get('O'));
		System.out.println(hm.get('E'));
		System.out.println(hm.get(null));
		
		System.out.println(hm.containsKey('Y'));
		System.out.println(hm.containsKey('Z'));
		
		for(Entry<Character, Integer> hm1 :hm.entrySet()){
			
			System.out.println(hm1.getKey()+" "+hm1.getValue());
		   }
		
      	}
	
}
	  	
		
	         
	      	         

