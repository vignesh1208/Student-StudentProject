package Map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashTable1 {

	public static void main(String[] args) {
		Hashtable<Integer,String> emp=new Hashtable<Integer,String>();
		emp.put(1,"A");emp.put(4,"D");emp.put(2,"B");emp.put(8,"Z");emp.put(3,"c");
		
		Iterator<Entry<Integer, String>> itr=emp.entrySet().iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
