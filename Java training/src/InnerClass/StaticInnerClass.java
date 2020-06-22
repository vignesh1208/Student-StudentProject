package InnerClass;

public class StaticInnerClass
{
		
		static class localinner
		{
			void msg()
			{
				System.out.println("LocalInner");
			}
		}
		
	
	public static void main(String[] args)
	{
		StaticInnerClass.localinner obj=new StaticInnerClass.localinner();
		obj.msg();
	}
}
