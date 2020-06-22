import java.util.HashMap;

public class Duplicate_characters 
{

	public static HashMap<Character,Integer> count(String s2)
	{
		HashMap<Character,Integer> h1=new HashMap<Character,Integer>();
		char[] c1=s2.toCharArray();
		int count=0;
		for(int i=0;i<c1.length;i++)
		{
			for(int j=0;j<c1.length;j++)
			{
				if(c1[i]==c1[j])
				{
					count++;
				}
			}
			h1.put(c1[i], count);
			count=0;
		}
		return h1;
	}
	
	
	public static void main(String[] args)
	{
		String s1="Microservices";
		HashMap<Character,Integer> h2=new HashMap<Character,Integer>();
		h2=count(s1);
		System.out.println(h2);
	}
}
