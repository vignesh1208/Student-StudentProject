package LambdaExpressions.Practise;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

class person
{
	
	int id;
	String name;
	
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		person other = (person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "person [id=" + id + ", name=" + name + "]";
	}
	public person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}

public class Predicate_Consumer 

{
	public static void main(String[] args)
	{
		person p1=new person(10,"viki");
		person p2=new person(20,"Swee1");
		person p3=new person(30,"viki1");
		person p4=new person(40,"Swee2");
		ArrayList<person> al=new ArrayList<person>();
		al.add(p1);al.add(p2);al.add(p3);al.add(p4);
		
		printConditionally(al,p->p.getName().startsWith("Swe"),p->System.out.println(p.name));
	}


	public static void printConditionally(ArrayList<person> al1,Predicate<person> p,Consumer<person> pp)
	{
	for(person pp1:al1)
	{
	if(p.test(pp1))
	{
		pp.accept(pp1);
	}
	}
	}
}
