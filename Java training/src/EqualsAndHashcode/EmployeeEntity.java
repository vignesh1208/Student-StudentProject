package EqualsAndHashcode;

public class EmployeeEntity implements Comparable<EmployeeEntity>
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
	
	public EmployeeEntity(String name, int age) {
		super();
		Name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "EmployeeEntity [Name=" + Name + ", age=" + age + "]";
	}
		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + age;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if(!(obj instanceof EmployeeEntity))
		    return false;
		EmployeeEntity employee=(EmployeeEntity)obj;
		return employee.getAge()==this.getAge()
				&&employee.getName()==this.getName();
	}
	@Override
	public int compareTo(EmployeeEntity o) {
	
		return this.Name.compareTo(o.Name);
	}

	
	
}
