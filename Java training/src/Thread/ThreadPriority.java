package Thread;

public class ThreadPriority extends Thread
{

	public void run() 
	{
         for(int i=0;i<5;i++)
	     System.out.println(i+" "+this.getName() +"   priorityyyy "+ThreadPriority.currentThread().getPriority());
	}
	
	public static void main(String[] args)
	{
		ThreadPriority t1=new ThreadPriority();
		ThreadPriority t2=new ThreadPriority();
		ThreadPriority t3=new ThreadPriority();
		t1.setName("v1");
		t2.setName("v2");
		t3.setName("v3");
		t1.setPriority(ThreadPriority.MIN_PRIORITY);
		t2.setPriority(ThreadPriority.MAX_PRIORITY);
		t3.setPriority(ThreadPriority.NORM_PRIORITY);
		t2.start();
		t1.start();
		t3.start();
	}
	
}

