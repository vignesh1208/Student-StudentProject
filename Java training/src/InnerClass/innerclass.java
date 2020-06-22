package InnerClass;

public class innerclass {

	
	class Inner{
		void msg() {
			System.out.println("Inner Class");
		}
	}
	
	public static void main(String[] args) {
		
		innerclass inner=new innerclass();
		innerclass.Inner in=inner.new Inner();
		in.msg();
	}
}
