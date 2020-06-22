package EqualsAndHashcode;

public class EmployeeEntityWOHashcode 
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
	
	
	
	public EmployeeEntityWOHashcode(String name, int age) {
		super();
		Name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "EmployeeEntityWOHashcode [Name=" + Name + ", age=" + age + "]";
	}
	/**	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + age;
		return result;
	} */
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if(!(obj instanceof EmployeeEntityWOHashcode))
		    return false;
		EmployeeEntityWOHashcode employee=(EmployeeEntityWOHashcode)obj;
		return employee.getAge()==this.getAge()
				&&employee.getName()==this.getName();
	}
	
}
