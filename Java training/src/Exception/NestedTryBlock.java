package Exception;

import java.io.FileNotFoundException;

public class NestedTryBlock 

{

	public static void main(String[] args) 
	{
		int i=50;
		int j=0;
		
		try 
		{	
			try 
			{
			int data=i/j;
		    }
			
			catch(ArithmeticException e)
		    {
		      System.out.println("Arithmetic Exception Block  " +(i/(j+2)));
		    }
			
			finally 
			{
		     System.out.println("Nested Finally");	
			}
			
			System.out.println("Try Block Code");
			int k=i/j;
			
		}	
		
		catch(Exception e)
		{
			System.out.println("Genereal Exception Block  "+(i/(j+2)));
		}
		
		finally 
		{
	     System.out.println("Finally");	
		}
		
	}
	
}
