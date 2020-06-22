package Thread;

public class runMethod extends Thread
{

	public synchronized void run() 
	{
      for(int i=0;i<10;i++)
	  System.out.println(i);
	}
	
	public static void main(String[] args)
	{
		runMethod t1=new runMethod();
		t1.start();
		
		runMethod t2=new runMethod();
		t2.start();
	}
	
}
