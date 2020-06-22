class Animal123{
	String color="white";
	
	//Super class constructor is the first one t be executed.
	public Animal123() {
		System.out.println("Super Class Constructor"+color);
	}
}

public class SuperKeyword_Instance_Initializer_Super_Constructor extends Animal123{
	
	public void printColor() {
		System.out.println("Super Color is "+ super.color);
	}
	
	
	//Instance Initializer block is the first to be executed when Object is created
	{
		System.out.println("Instance Initalizer Block");
	}
	//
	public static void main(String[] args) 
	{
		SuperKeyword_Instance_Initializer_Super_Constructor s1=new SuperKeyword_Instance_Initializer_Super_Constructor();
        s1.printColor();
	}

}
