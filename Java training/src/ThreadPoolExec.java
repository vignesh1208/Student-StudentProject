import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExec implements Runnable 
{

	@Override
	public void run() {
	
		System.out.println(Thread.currentThread().getName());
	}
	

	
	
	public static void main(String[] args)
	{
		ExecutorService exe= Executors.newFixedThreadPool(3);
		
		for(int i=0;i<10;i++)
		{
			Runnable e=new ThreadPoolExec();
			exe.execute(e);
			
			//exe.submit(e);
		}
		
	}
}
