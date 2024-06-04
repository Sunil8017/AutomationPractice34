package MapInterface;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//hashtable 
		
				Hashtable <Integer,String> ht= new	Hashtable <Integer,String> ();
				
				ht.put(1, "java");
				ht.put(2, "Phython");
				ht.put(3, "Selenium");
				ht.put(4, "cpp");
				
			//  ht.put(5, null);                     //Exception as null pointer exception.
		    //	ht.put(null,"null_check");
				
				Enumeration e = ht.elements();  //used for hashtable iteration 
				System.out.println("Size before iteration :"+ht.size());
				while(e.hasMoreElements()){
					System.out.println(e.nextElement());
					ht.remove(4,"cpp");
				}
				System.out.println("Size before iteration :"+ht.size());
						
				
	}

}
