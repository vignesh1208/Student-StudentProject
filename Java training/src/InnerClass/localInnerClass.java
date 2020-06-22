package InnerClass;

public class localInnerClass {
	
	void display()
    {
		
		class localinner
		{
			void msg()
			{
				System.out.println("LocalInner");
			}
		}
		
		localinner obj=new localinner();
		obj.msg();
		
	}
	
	public static void main(String[] args)
	{
		localInnerClass l1=new localInnerClass();
		l1.display();
	}
}
