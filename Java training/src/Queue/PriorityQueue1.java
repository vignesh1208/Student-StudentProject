package Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
	PriorityQueue<Employee> pq=new PriorityQueue<Employee>();
	Employee e1=new Employee(1,"viki");
	Employee e2=new Employee(4,"viki");
	Employee e3=new Employee(3,"viki");
	Employee e4=new Employee(2,"viki");
	Employee e5=new Employee(0,"viki");
	pq.add(e1);
	pq.add(e2);
	pq.add(e3);
	pq.add(e4);
	pq.add(e5);
	System.out.println(pq);
	Iterator<Employee> itr=pq.iterator();
	while(itr.hasNext())
		System.out.println(itr.next());
}
}
