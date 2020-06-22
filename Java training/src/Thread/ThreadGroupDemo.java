package Thread;

public class ThreadGroupDemo implements Runnable {

	
	private static java.lang.ThreadGroup tg1;

	public void run() 
	{
		System.out.println("laaa..."+Thread.currentThread().getName());	
	}

	public static void main(String[] args)
	{
		Runnable runnable1 = new ThreadGroupDemo();
		ThreadGroup tg1 =new ThreadGroup("Parent Thread Group");
		Thread t1=new Thread(tg1,runnable1,"one");
		Thread t2=new Thread(tg1,runnable1,"two");
		Thread t3=new Thread(tg1,runnable1,"three");
		t1.start();
		t2.start();
		t3.start();
		System.out.println("hiiii"+tg1.getName());
		tg1.list();
		System.out.println("Active Count"+tg1.activeCount());
	//	tg1.destroy();
	}
}
