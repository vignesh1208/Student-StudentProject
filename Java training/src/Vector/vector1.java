package Vector;

import java.util.Iterator;
import java.util.Vector;

public class vector1 {

	public static void main(String[] args) {
		
		Vector<Integer> v=new Vector();
		v.add(5);
		v.add(4);
		v.add(2);
		v.add(3);
		v.add(1);
		System.out.println(v);
		Iterator itr=v.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
	}
}
