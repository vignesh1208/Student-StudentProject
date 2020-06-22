package LambdaExpressions.Practise;

import java.util.ArrayList;
import java.util.Collections;

interface showable
{
	public void show();
}

public class TypeInterference 
{

	public static void main(String[] args)
	{
		showable s=()->{ System.out.println("Showing");
						 System.out.println("Done Showing");};
		s.show();
		
		
		Runnable r=()->{
			System.out.println("Runnableee");
		};
		r.run();
		
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(1);a1.add(6);a1.add(2);a1.add(5);a1.add(7);a1.add(8);
		System.out.print(a1);
		System.out.println();
		
		
		Collections.sort(a1,(aa,aaa)->aa.compareTo(aaa));
		System.out.print(a1);
		
		
	}
	
	

}
