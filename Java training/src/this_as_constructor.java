
public class this_as_constructor {
	int data =10;
	this_as_constructor(){
		B b=new B(this);
		b.display();
	}
	public static void main(String[] args) {
		this_as_constructor a =new this_as_constructor();
	}
}

class B{
	this_as_constructor a1;
	B(this_as_constructor a1){
		this.a1=a1;
	}
	void display(){
		System.out.println(a1.data);
	}
}

