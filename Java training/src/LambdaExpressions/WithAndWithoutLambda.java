package LambdaExpressions;

interface Drawable{
	void draw();
}

interface Paint{
	void paint(String a);
}

public class WithAndWithoutLambda
{

	public static void main(String[] args)
	{
	Drawable d=new Drawable() {
		public void draw() {
			System.out.println("Drawing");
		}
	};
	d.draw();
	
	Paint  p=(b)->{
		System.out.println("Painting "+b);
	};
	p.paint("abstract");
	}
	
}
