package Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ResolveExceptionInCatch 
{
	public static void main(String[] args) 
	{
		int i=30;
		int j=0;
		
			
			if(i>40)
		throw new ArithmeticException();
		int data=i/j;
	    System.out.println("Rest"+data);
		
		
	/*	catch(ArithmeticException e)
		{
		 System.out.println("Arithmetic Exception Block  ");//+(i/(j+2)));
		 j+=2;
		}
		
		catch(IOException e)
		{
		 System.out.println("General Exception Block  "+(i/(j+2)));
		}*/
		System.out.println(i/j);
	}
}
