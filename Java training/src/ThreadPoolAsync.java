import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolAsync implements Callable {

	@Override
	public Object call() throws Exception {
		return Thread.currentThread().getName();
	}
	
	public static void main(String[] args)
	{
		Future<String> ff=null;
		
		for (int i=0;i<10;i++)
		{
			ExecutorService e2=Executors.newFixedThreadPool(3);
			Callable c1=new ThreadPoolAsync();
			try 
			{
				ff=e2.submit(c1);
			} 
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println("lalalla");
		try {
			System.out.println("..."+ff.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
