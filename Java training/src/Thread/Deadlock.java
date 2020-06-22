package Thread;

public class Deadlock {

	public static void main(String[] args) {
		final String resource1="viki";
		final String resource2="Swetha";
		
		
		Thread t1=new Thread() {
			public void run() {
				synchronized(resource1){
					System.out.println("Thread1: Locked Resource 1");
					try {Thread.sleep(1000);}
					catch(Exception e) {}
				
				 synchronized(resource2){
					System.out.println("Thread1: Locked Resource 2");
				}
				}
			}
		};
		
		Thread t2=new Thread() {
			public void run() {
				synchronized(resource2){
					System.out.println("Thread2: Locked Resource 2");
					try {Thread.sleep(1000);}
					catch(Exception e) {}
				
				synchronized(resource1){
					System.out.println("Thread2: Locked Resource 1");
				}	
				}
				
			}
		};
		t1.start();
		t2.start();
	}
}
