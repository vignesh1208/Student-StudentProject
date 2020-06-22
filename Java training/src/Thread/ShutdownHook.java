package Thread;

public class ShutdownHook 
{

	public static void main(String[] args) {
		
		Runtime r=Runtime.getRuntime();
		r.addShutdownHook(new Thread() {
			public void run() {
				System.out.println("Shutdown Hook task completed.");
			}
		});
		
		System.out.println("Now the main thread is sleeping , Press Ctrl+C to exit");
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
	}
}
