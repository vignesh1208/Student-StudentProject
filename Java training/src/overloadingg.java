

public class overloadingg extends parent1 
{
	void walk()
	{
		System.out.println("Walking_inner");
	}
	void runn()
	{
		System.out.println("rr");
		super.runn();
		//System.out.println("Running");
	}
	public static void main(String[] args)
	{
		parent1 p1=new overloadingg();
		p1.runn();
	}
}

class parent1{
	void walk()
	{
		System.out.println("Walking");
	}
	void runn()
	{
		walk();
		//System.out.println("Running");
	}
}

 