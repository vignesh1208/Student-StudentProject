import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Array_VS_LinkedList 
{	
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		Queue<Integer> l1=new LinkedList<Integer>();
		Deque<Integer> l2=new LinkedList<Integer>();
		a1.add(5);
		a1.add(1);
		a1.add(3);
		a1.add(2);
		
		l1.add(5);
		l1.add(1);
		l1.add(3);
		l1.add(2);
		
		l2.add(5);
		l2.add(1);
		l2.add(3);
		l2.add(2);

		System.out.println(l1);
		System.out.println(l1.peek());
		//System.out.println(l1.poll());
		//System.out.println(l1.add(6)+".."+l1.peek()+" "+l1);
		
		Stack<Integer> s1=new Stack<Integer>();
		s1.push(5);
		s1.push(1);
		s1.push(3);
		s1.push(2);
		System.out.println("Queue "+l1+" Stack "+s1);
		System.out.println("Queue poll "+l1.poll()+" Stack poll "+s1.pop()+" Deque poll first "+l2.pollFirst()+" Deque poll last" +l2.pollLast());
		System.out.println("Queue "+l1+" Stack "+s1+" Deque"+l2);
		
	}

}
