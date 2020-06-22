package LambdaExpressions.Practise;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee implements Comparable<Employee>

{
	int id;
	String name;
	Float salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee o) {
		if(this.salary<o.salary)
			return 1;
		else if(this.salary>o.salary)
		return -1;
		else
			return 0;
	}
	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
}

public class test1 

{
	public static void main(String[] args)
	{
		 	PriorityQueue<Employee> pq=new PriorityQueue<Employee>();
	        Employee e2=new Employee(2,"vikiii",1600);
			Employee e1=new Employee(1,"Praveen",150000);
			Employee e4=new Employee(3,"Sheela",1000);
			Employee e3=new Employee(2,"viki",1500);
			Employee e5=new Employee(1,"Praveen_highest",2220000);
			Employee e6=new Employee(3,"Sheela",100000);
			
			ArrayList<Employee> pq1=new ArrayList<Employee>();
			pq1.add(e1);pq1.add(e2);pq1.add(e3);pq1.add(e4);pq1.add(e5);pq1.add(e6);
			pq.add(e1);pq.add(e2);pq.add(e3);pq.add(e4);pq.add(e5);pq.add(e6);
			
			
			System.out.println(pq.stream().filter(p->p.salary>100000).count());
			
			
			System.out.println("laa"+pq.stream().collect(Collectors.summingDouble(p->p.salary)));

			pq.stream().filter(p->p.salary<1700).distinct().forEach(System.out::println);
			
			System.out.println("Before sort "+pq1);
			Collections.sort(pq1,(p1,p2)->{ return p1.name.compareTo(p2.name);});
			System.out.println("After sort "+pq1);
			
		/**	Stream<Employee> ee=pq.stream().filter(e->e.salary>2000);
			ee.forEach(e->System.out.println(e));
			
			Stream<Employee> ee2=pq.parallelStream().filter(e->e.salary<2000);
			ee2.forEach(e->System.out.println(e));
		**/	
	}
}
