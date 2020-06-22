package Thread;

public class ImplementsRunnable implements Runnable
{

	public void run() 
	{
	  System.out.println("Running");
	}
	
	public static void main(String[] args)
	{
		ImplementsRunnable t1=new ImplementsRunnable();
		Thread T1=new Thread(t1);
		T1.start();
	}
	
}
