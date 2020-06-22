import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(6);
		System.out.println(l1);	
		l1.addFirst(1);
		l1.addLast(7);
		System.out.println(l1);	
		
	}
}
