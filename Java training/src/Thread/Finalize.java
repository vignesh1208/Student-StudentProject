package Thread;

public class Finalize 

{
	public void finalize() {
		System.out.println("Object is garbage collected");
	}
public static void main(String[] args) {
	Runtime r=Runtime.getRuntime();
	r.addShutdownHook(new Thread() {
		public void run() {
			System.out.println("Shutdown Hook task completed.");
		}
	});
	
		Finalize f1=new Finalize();
		f1=null;
		System.gc();
		
	}
}
