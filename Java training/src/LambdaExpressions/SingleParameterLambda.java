package LambdaExpressions;

interface Paint1{
	String paint(String Style);
}


public class SingleParameterLambda 
{
	public static void main(String[] args) 
	{
		
	Paint1 P=( style)->{
		return "Painting a "+style+" Paint";
	};
	
		SingleParameterLambda s1=new SingleParameterLambda();
		System.out.println(P.paint("Abstract"));
	}

}
