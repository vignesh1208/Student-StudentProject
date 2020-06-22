package Thread;

public class ExtendsThread extends Thread
{

	public void run() 
	{
	  System.out.println("Running");
	}
	
	public static void main(String[] args)
	{
		ExtendsThread t1=new ExtendsThread();
		t1.start();
	}
	
}
