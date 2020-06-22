
package LambdaExpressions;

public class Thread_Lambda {

	public static void main(String[] args){
	
		//Creating Thread 
		Runnable r1=new Runnable() {
			public void run() {
				System.out.println("Running");
			}
		};
		
		Thread t1=new Thread(r1);
		
		//Creating Thread using Lambda Expression
		Runnable r2=()->{
				System.out.println("Running2");
		};
		Thread t2=new Thread(r2);
		
		t1.start();
		t2.start();
	}
}
