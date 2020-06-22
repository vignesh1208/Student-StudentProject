package Thread;

public class JoinMethod extends Thread
{

	public void run() 
	{
      for(int i=0;i<5;i++)
	  System.out.println(i+" "+Thread.currentThread());
	}
	
	public static void main(String[] args)
	{
		JoinMethod t1=new JoinMethod();
		JoinMethod t2=new JoinMethod();
		JoinMethod t3=new JoinMethod();
		t1.start();
		try 
		{
			t1.join();
		} catch (InterruptedException e) {
			
		e.printStackTrace();
		}
		t2.start();
		t3.start();
	}
	
}
