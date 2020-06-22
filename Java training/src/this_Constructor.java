
public class this_Constructor {

	int rollno;
	String name;
	String flee;
	
	this_Constructor(Integer rollno){
		this.rollno=rollno;
	}
	
	this_Constructor(Integer rollno,String name){
		this(rollno);
		this.name=name;
	}
	
	this_Constructor(Integer rollno,String name,String flee){
		this(rollno,name);
		this.flee=flee;
	}
	
    
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFlee() {
		return flee;
	}

	public void setFlee(String flee) {
		this.flee = flee;
	}

	public static void main(String[] args) {
		
		this_Constructor t1=new this_Constructor(100,"viki","fleeee");
		System.out.println(t1);
		System.out.println(t1.hashCode()+"Name "+t1.name.hashCode());
	}

	@Override
	public String toString() {
		return "this_Constructor [rollno=" + rollno + ", name=" + name + ", flee=" + flee + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((flee == null) ? 0 : flee.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollno;
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
		this_Constructor other = (this_Constructor) obj;
		if (flee == null) {
			if (other.flee != null)
				return false;
		} else if (!flee.equals(other.flee))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollno != other.rollno)
			return false;
		return true;
	}

	

	
	
	
}
