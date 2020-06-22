package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;

public class Employee_SortByName 
{

	String Name;
	Integer age;
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
	
	public Employee_SortByName(String name, int age) {
		super();
		Name = name;
		this.age = age;
	}
	
	public static void main(String args[]){  
		ArrayList<Employee_SortByName> al=new ArrayList<Employee_SortByName>();  
		al.add(new Employee_SortByName("Vijay",23));  
		al.add(new Employee_SortByName("Ajay",27));  
		al.add(new Employee_SortByName("Jai",21));  
		Collections.sort(al,new Name_Comparator());
	//	Collections.sort(al,new Age_Comparator());
		for(Employee_SortByName st: al)
		{  
			System.out.println(st.Name+" "+st.age);  
		}  
		}

}
