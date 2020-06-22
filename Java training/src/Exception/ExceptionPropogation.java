package Exception;

import java.io.IOException;

public class ExceptionPropogation 
{

	static void m() 
	{
		int i=50/0;
	}
	
	static void n() 
	{
		try {
			m();
			}
			catch(ArithmeticException e){
				System.out.println("Arithmetic Exception caught in n");
			}
		m();
	}
	
	static void p() 
	{
		try {
		n();
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic Exception caught in p");
		}
		
	}
	
	public static void main(String[] args)
	{
		p();
	}
}
