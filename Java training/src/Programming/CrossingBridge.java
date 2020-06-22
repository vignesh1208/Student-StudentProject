package Programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

 class People implements Comparable<People>
{
	String name;
	int time;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public People(String name, int time) {
		super();
		this.name = name;
		this.time = time;
	}
	@Override
	public int compareTo(People o) {
		if(this.time<o.time)
			return 1;
		else if(this.time>o.time)
			return-1;
		else			
		return 0;
	}
	@Override
	public String toString() {
		return "People [name=" + name + ", time=" + time + "]";
	}
	
}
 
 
public class CrossingBridge 
{

	public static int timeTaken(ArrayList<People> p1)
	{
		
		int sum=0;
		int temp=0;
		int size=p1.size();
		Collections.sort(p1);
		if(p1.size()==2)
			return p1.get(size-2).getTime();
		if(p1.size()==1)
			return p1.get(size-1).getTime();
		
		for(int i=0;i<p1.size();i+=2)
		{
			if((i<p1.size()-3))
			{
			temp+=(p1.get(size-1).time)+(p1.get(size-2).time);
			temp+=p1.get(i).getTime();
			temp+=p1.get(size-2).getTime();
			}
			else
			{
				if(i==p1.size()-3)
				{temp+=p1.get(i).getTime();
				temp+=(p1.get(size-1).time)+(p1.get(size-2).time);
				}
				else
				temp+=p1.get(size-2).time;
				break;
			}
				
		}	
		return temp;
	}
	
	public static void main(String[] args)
	{
		ArrayList<People> p=new ArrayList<People>();
		p.add(new People("A",100));
		p.add(new People("B",200));
		p.add(new People("C",75));
		p.add(new People("D",50));
		p.add(new People("A",5));
		p.add(new People("D",1));
	//	p.add(new People("E",2));
	//	p.add(new People("E",2));
	//	p.add(new People("F",2));
	//	p.add(new People("G",2));
		int i1 = 1;
	    Integer i2 = 1;
	    Integer i3 = new Integer(1);
	    System.out.println("i1 == i2"+(i1==i2));
	    System.out.println("i1 == i3"+(i1==i3));		
		System.out.println("The total time taken is "+timeTaken(p));
	}
	
}
