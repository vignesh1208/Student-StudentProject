class Animal_poly1
{
void eat() {
	System.out.println("Eating");
}
}
class BabyDog_poly1 extends Animal_poly1
{
void eat() {
		System.out.println("BabyDog Eating");
	}	
}


public class Static_and_Dynamic_Binding {
	public static void main(String[] args) 
	{
		
		System.out.println("Static Binding Animal");
		//Static Binding
		Animal_poly1 a=new Animal_poly1();
		a.eat();
		
		
		System.out.println("Dynamic Binding Animal to Babydog");
		//Dynamic Binding
		Animal_poly1 b=new BabyDog_poly1();
		b.eat();
	}

}
