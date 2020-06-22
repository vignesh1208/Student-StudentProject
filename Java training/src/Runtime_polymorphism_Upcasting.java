class Animal_poly
{
void eat() {
	System.out.println("Eating");
}
}

class Dog_poly extends Animal_poly
{
void eat() {
	System.out.println("Dog Eating");
}
}

class BabyDog_poly extends Dog_poly
{
void eat() {
		System.out.println("BabyDog Eating");
	}	
}

public class Runtime_polymorphism_Upcasting {

public static void main(String[] args) 
{
	System.out.println("Animal to dog");
	Animal_poly a=new Dog_poly();
	a.eat();
	System.out.println("Dog to Babydog");
	Animal_poly b=new BabyDog_poly();
	b.eat();
}
}
