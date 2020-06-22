


class Dog2 extends Animal{
	public static void main(String[] args) {
		Dog2 d1=new Dog2();
		d1.eat();
	}
}
class Animal22 {
	
	void eat() {
		System.out.println("eating");
	}
}

public class Multipe_Inheritance extends Animal22 {
	public static void main(String[] args) {
		Multipe_Inheritance d2=new Multipe_Inheritance();
		d2.eat();
	}
}
