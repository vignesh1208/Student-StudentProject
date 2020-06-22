package Interface;

public class NI_Class implements NestedInterface.InnerNestedInterface
{
		public void msg() 
		{
			System.out.println("Nested Interface Message");
		}
		
		public static void main(String[] args)
		{
			NI_Class t1=new NI_Class();
			t1.msg();
		}
		
}
