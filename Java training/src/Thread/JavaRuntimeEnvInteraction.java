package Thread;

public class JavaRuntimeEnvInteraction {

	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime();
		System.out.println("Total Memory "+r.totalMemory());
		System.out.println("Free Memory " +r.freeMemory());
		for(int i=0;i<1000000000;i++)
		{
			for(int j=0;j<1000000000;j++) {
				for(int k=0;k<10000;k++) {
					JavaRuntimeEnvInteraction ii=new JavaRuntimeEnvInteraction();
		}
		}
		}
		System.out.println();
		System.out.println("Total Memory "+r.totalMemory());
		System.out.println("Free Memory after 1000 instance creation" +r.freeMemory());
		System.out.println("Max Memory "+r.maxMemory());
	}
}
