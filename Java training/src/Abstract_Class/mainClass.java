package Abstract_Class;

public class mainClass implements Cloneable{

	public static void main(String[] args) {

		vehicle v=new Bike();
		v.engine();
		v.steering();
		v.run();
		v.travel();
		
	}
}
