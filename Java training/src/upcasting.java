

class B1{
		
		public void c() {
			System.out.println("c");
		}
		public void b() {
			System.out.println("bbb");
		}
		
	}

	class A extends B1{
		
		public void b() {
			System.out.println("b");
		}
		
		
		
	}
	public class upcasting {

		public static void main(String[] args) {
			B1 b=new A();
			b.b();
			b.c();
			
		}
}
