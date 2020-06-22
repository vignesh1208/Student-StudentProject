package Exception;

import java.io.IOException;

public class Overloading_Parent_Exception
{
	void msg() throws Exception
	{
	 System.out.println("Parent");
	}
	
	void msg1() 
	{
	 System.out.println("Parent");
	}
	void msg2() throws ArithmeticException
	{
	 System.out.println("Parent");
	}
}