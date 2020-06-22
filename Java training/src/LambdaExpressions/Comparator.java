package LambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class product
{
	int id;
	String name;
	String price;
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
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public product(int id, String name, String price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
    
public class Comparator {
public static void main(String[] args) {
	
	List<product> list=new ArrayList<product>();
	list.add(new product(30,"viki","50"));
	list.add(new product(10,"Sweatha","60"));
	list.add(new product(40,"Praveen","70"));
	list.add(new product(20,"Karthiga","80"));
	
	Collections.sort(list,(a1,a2)->{
	      return a1.name.compareTo(a2.name);
	    		  });

	Iterator<product> itr=list.iterator();
    while(itr.hasNext())
    {
    	System.out.println(itr.next().name);
}
	Collections.sort(list, (p1,p2) -> Integer.compare(p1.id, p2.id));
	
    Iterator<product> itr1=list.iterator();
    while(itr1.hasNext())
    {
    	System.out.println(itr1.next().id);
}
}
}