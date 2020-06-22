package Queue;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
public static void main(String[] args) {
	Queue<Integer> q1=new LinkedList<Integer>();
	Deque<Integer> DQ= new ArrayDeque<Integer>(); 
	//Deque<Integer>q2=new LinkedList<Integer>();
	q1.add(5);
	q1.add(4);
	q1.add(2);
	q1.add(3);
	System.out.println(q1.peek());
	System.out.println(q1);
	System.out.println(q1.poll());
	System.out.println(q1);
	System.out.println(q1.remove(2));
	System.out.println(q1);
	System.out.println(q1.remove(9));
	System.out.println(q1);
}
}
