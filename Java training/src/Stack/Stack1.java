package Stack;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		Stack<Integer> s1=new Stack<Integer>();
		for(int i=0;i<10;i++)
		s1.push(i);
		System.out.println(s1.peek());
		System.out.println();
		for(int i=0;i<10;i++)
	    System.out.print(s1.pop()+" ");
		
	}
}
