package Exception;

import java.io.FileNotFoundException;

public class ExceptionCodeInCatchBlock
{

	public static void main(String[] args)     
	{
		int i=50;
		int j=0;
		
		try 
		{	
		
		int data=i/j;
	    //System.out.println("Rest"+data);
		}
		
		catch(ArithmeticException e)
		{
		 System.out.println("Arithmetic Exception Block  " +(i/(j+2)));
		}
		
		catch(Exception e)
		{
		 System.out.println("Genereal Exception Block  "+(i/(j+2)));
		}
		
		catch(Throwable e) {
			System.out.println(e);
		}
		
		System.out.println("Rest of Code");
}
}
