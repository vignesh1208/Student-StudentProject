package Exception;

import java.io.IOException;
import java.sql.SQLException;

public class Overloading_Parent_Child_Exception extends Overloading_Parent_Exception{

	void msg() throws IOException
	{
		System.out.println("Child");
		try {
		throw new IOException("1");
		}
		finally {}
	}
	
	void msg1() //throws ArithmeticException
	{
	 System.out.println("Parent");
	 int a=1/0;
	 throw new ArithmeticException("DD");
	}
	
	//void msg2() throws IOException
	{
	 System.out.println("Parent");
	}
	
	public static void main(String[] args) {
		
	}
}
