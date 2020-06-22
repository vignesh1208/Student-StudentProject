
public class Aggregation_Employee {

	int id;
	String name;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a1 == null) ? 0 : a1.hashCode());
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
		Aggregation_Employee other = (Aggregation_Employee) obj;
		if (a1 == null) {
			if (other.a1 != null)
				return false;
		} else if (!a1.equals(other.a1))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	Animal a1;
	
	public Aggregation_Employee(int id , String name, Animal a1) {
		this.id=id;
		this.name=name;
		this.a1=a1;
	}
	
	public static void main(String[] args) {
		Aggregation_Employee AE=new Aggregation_Employee(10, "Vikii", new Animal());
		AE.a1.eat();
		System.out.println(AE);
		
	}
	
	@Override
	public String toString() {
		return "Aggregation_Employee [id=" + id + ", name=" + name + ", a1=" + a1.toString()+ ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
