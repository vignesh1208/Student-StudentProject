package Exception;

public class Throwable11 
{

	public static void main(String[] args)     
	{
		try 
		{	
		throw new ClassNotFoundException();
		}
		catch(Throwable e) {
			System.out.println(e);
		}
		
		System.out.println("Rest of Code");
}
}
