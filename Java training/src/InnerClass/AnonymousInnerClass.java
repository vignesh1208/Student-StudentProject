package InnerClass;

import InnerClass.innerclass.Inner;


abstract class eat{
	abstract void msg();
}

interface eatable{
	abstract void call();
}
public class AnonymousInnerClass {
	
    
	public static void main(String[] args) {
		
		eat i = new eat(){
			void msg() {
				System.out.println("Inner Class");
			}
		};
		
		
		eatable j=new eatable() {
			public void call() {
				System.out.println("Interface Inner class");
			}
		};
		
		i.msg();
		j.call();
	}
}
