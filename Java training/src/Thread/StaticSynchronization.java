package Thread;

public class StaticSynchronization extends Thread{

	synchronized static void sing() {
	    	for(int i=1;i<5;i++) {
	    		System.out.println(i);
		
	    		try 
	    		{
	    			Thread.sleep(400);
	    		}
	    		catch(Exception e) {}
		}
	 	}
	    
	    
	synchronized static void dance() {
		    	for(int i=5;i<10;i++) {
		    		System.out.println(i);
			
		    		try 
		    		{
		    			Thread.sleep(400);
		    		}
		    		catch(Exception e) {}
		}
    	}	
	 
	 public void run() {
		 StaticSynchronization.sing();
		 StaticSynchronization.dance();
	 }
	 
	 public static void main(String[] args) 
	 {
		 StaticSynchronization s1=new StaticSynchronization();
		 s1.start();
		 StaticSynchronization s2=new StaticSynchronization();
		 s2.start();
	 }
}
