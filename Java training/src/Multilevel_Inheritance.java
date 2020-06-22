
 class Animal {
	
	void eat() {
		System.out.println("eating");
	}
}


class Dog extends Animal{
	void bark() {
		System.out.println("Barking");
	}
}

public class Multilevel_Inheritance extends Dog{

	
	public static void main(String[] args) {
		Multilevel_Inheritance m1=new Multilevel_Inheritance();
		m1.bark();
		m1.eat();
		
	}

}
