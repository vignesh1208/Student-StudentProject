package Queue;

import java.io.Serializable;

public class Employee implements Comparable<Employee>,Serializable{
	transient Integer id;
	String name;
	
	public  Integer getId() {
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
	public int compareTo(Employee emp2) {
		return this.getId().compareTo(emp2.getId());
		
		
	}
	public Employee(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id is" + id + ", and their name is " + name + "]";
	}
	
	
	

}
