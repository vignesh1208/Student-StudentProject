package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable
{
	
	private String message;
	
	public WorkerThread(String message)
	{
		this.message=message;
	}
	
	public void run()
	{
	System.out.println(Thread.currentThread().getName()+ "(Start) Message ="+message);
	processMessage();
	System.out.println("(End)");
	}
	private void processMessage() {
		try
		{
		Thread.sleep(2000);	
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}
	
}


public class ThreadPool {

	public static void main(String[] args) {
		ExecutorService executor=Executors.newFixedThreadPool(5);
		//ExecutorService executor=Executors.newCachedThreadPool();
		//ExecutorService executor=Executors.newSingleThreadExecutor();
		for(int i=0;i<10;i++)
		{
			Runnable worker=new WorkerThread(" "+i);
			executor.execute(worker);
			
		}
		
		executor.shutdown();
		while(!executor.isTerminated()) {}
		System.out.println("Finished all threads");
	}
}
