package LambdaExpressions;


interface addable{
	int add(int a,int b);
	
	default int sub(int a,int b)
	{
		return a-b;
	}
	default int mul(int a,int b)
	{
		return a*b;
	}
	static int mul1(int a,int b)
	{
		return a*b;
	}
	
}

interface subtractable{
	int sub(int a,int b);
}

public class MultipleParamerWithOrWOReturnType {

	public static void main(String[] args) {
	
	addable a1=(c,d)->(c+d);
	System.out.println(" Addition WO Return Type"+a1.add(5, 5) );
	
	subtractable s1=(a,b)->{
		return a-b;
	};
	
	System.out.println(" Subtraction With Return Type "+s1.sub(10, 5));
	
	}
	
}
