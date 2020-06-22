package Exception;

public class CustomException 
{
 
	public static void main(String[] args) throws vigneshException  {
		
	
		String name="viknesh";
	try {
		if(name.equalsIgnoreCase("Vignesh"))
			System.out.println("success");
		else
			throw new vigneshException("Name is not well formed");
	}
//	catch(vigneshException e)
  //  {
//	System.out.println("vignesh Exception caught");
  //   }
	finally {
		
	}
	
	
	}

}
