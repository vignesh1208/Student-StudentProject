package Programming;

public class singleton 
{

	public static volatile singleton instance =null;
	
	private static singleton getInstance()
	{
		if(instance==null)
		{
		//	Synchronized(singleton.class)
			{
				instance=new singleton();
			}
		}
		return instance;
	}
}
