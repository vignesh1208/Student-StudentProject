package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet1 {

	public static void main(String[] args) {
		Set<Integer> s1=new HashSet<Integer>();
		s1.add(2);
		s1.add(5);
		s1.add(6);
		s1.add(7);
		s1.add(2);
		s1.add(2);
		s1.add(3);
		s1.add(4);
		s1.add(9);
		s1.add(8);
		Iterator<Integer> itr=s1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
