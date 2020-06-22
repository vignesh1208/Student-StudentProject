import java.util.Iterator;
import java.util.LinkedList;

public class DescendingIterator {

	public static void main(String[] args) {

		LinkedList<String> ll=new LinkedList<String>();
		ll.add("aa");
		ll.add("bb");
		ll.add("dd");
		ll.add("cc");
		ll.add("ee");
		System.out.println("Ascending Iterator");
		Iterator itr=ll.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println("Descending Iterator");
        Iterator des_itr=ll.descendingIterator();
        while(des_itr.hasNext())
			System.out.println(des_itr.next());
        
	}

}
