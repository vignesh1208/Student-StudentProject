package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Employee_SortByAge implements Comparable<Employee_SortByAge> 
{

	String Name;
	int age;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
	
	public Employee_SortByAge(String name, int age) {
		super();
		Name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Employee_SortByAge [Name=" + Name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Employee_SortByAge E1) {
		if(this.age==E1.age)
		return 0;
		else if(this.age>E1.age)
		return 1;
		else
	    return -1;
	}
	
	public static void main(String args[]){  
		ArrayList<Employee_SortByAge> al=new ArrayList<Employee_SortByAge>();  
		al.add(new Employee_SortByAge("Vijay",23));  
		al.add(new Employee_SortByAge("Ajay",27));  
		al.add(new Employee_SortByAge("Jai",21));  
		  
		Collections.sort(al);
		for(Employee_SortByAge st:al){  
		System.out.println(st.Name+" "+st.age);  
		}  
		}

}
