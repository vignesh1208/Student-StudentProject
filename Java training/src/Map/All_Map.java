package Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class All_Map 
{

	public static void main(String[] args) 
	{
		
		String str="abc";
		str.intern();
		String str1=new String("abc");
		String str2=str1.intern();
		if(str.equals(str2))
			System.out.println("true"+str+str1);
		else
			System.out.println("False"+str+str1);
		
	Map<Integer,String> emp=new HashMap<Integer,String>();
	System.out.println("HashMap");
	emp.put(1,"A");emp.put(4,"D");emp.put(2,"B");emp.put(8,"Z");emp.put(3,"c");
	
	Iterator<Entry<Integer, String>> itr=emp.entrySet().iterator();
	while(itr.hasNext())
		System.out.println(itr.next());
	
	
	
	System.out.println("LinkedHashMap");
	Map<Integer,String> emp1=new LinkedHashMap<Integer,String>();
	emp1.put(1,"A");emp1.put(4,"D");emp1.put(8,"B");emp1.put(2,"Z");emp1.put(3,"c");
	Iterator<Entry<Integer, String>> itr1=emp1.entrySet().iterator();

	while(itr1.hasNext())
		System.out.println(itr1.next());
	
	
	
	System.out.println("TreeMap");
	Map<Integer,String> emp2=new TreeMap<Integer,String>();
	emp2.put(1,"A");emp2.put(4,"D");emp2.put(8,"B");emp2.put(2,"Z");emp2.put(3,"c");
	
	Iterator<Entry<Integer, String>> itr2=emp2.entrySet().iterator();
	while(itr2.hasNext())
		System.out.println(itr2.next());
		
	
	}
}
