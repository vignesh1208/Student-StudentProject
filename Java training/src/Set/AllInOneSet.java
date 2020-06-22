package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class AllInOneSet {

	public static void main(String[] args) {
		
		
	System.out.println("HashSet");	
	Set<Integer> s1=new HashSet<Integer>();
	s1.add(2);s1.add(5);s1.add(6);s1.add(7);s1.add(2);s1.add(2);s1.add(3);s1.add(4);s1.add(9);s1.add(8);
	Iterator<Integer> itr=s1.iterator();
	while(itr.hasNext()) {
	System.out.println(itr.next());
	}
	
	System.out.println("LinkedHashSet");
	LinkedHashSet<Integer> s2=new LinkedHashSet<Integer>();
	s2.add(2);s2.add(5);s2.add(6);s2.add(7);s2.add(2);s2.add(2);s2.add(3);s2.add(4);s2.add(9);s2.add(8);
	Iterator<Integer> itr2=s2.iterator();
	while(itr2.hasNext()) {
		System.out.println(itr2.next());
	}
	
	System.out.println("TreeSet");
	TreeSet<Integer> s3=new TreeSet<Integer>();
	s3.add(2);s3.add(5);s3.add(6);s3.add(7);s3.add(2);s3.add(2);s3.add(3);s3.add(4);s3.add(9);s3.add(8);
	
	Iterator<Integer> itr3=s3.iterator();
	while(itr3.hasNext()) {
		System.out.println(itr3.next());
	}
	
	}
}
