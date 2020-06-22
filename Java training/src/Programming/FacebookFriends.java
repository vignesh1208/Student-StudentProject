package Programming;

import java.util.ArrayList;
import java.util.List;

public class FacebookFriends 
{

	public static List<String> compareFriends(List<String> frndsList) 
	{
		int flag=0;
		for(int i=0;i<frndsList.size();i++)
		{
			for(int j=0;j<frndsList.size();j++)
			{
				
				if(frndsList.get(i)==frndsList.get(j))
				continue;
				if(frndsList.get(j)==null)
					continue;
				char[] temp1=frndsList.get(i).toCharArray();
				char[] temp2=frndsList.get(j).toCharArray();
				aa:
				for(int k=0;k<temp1.length;k++)
				{	System.out.println("laaaaaaaaaaaaa"+frndsList.get(i)+"   j   "+frndsList.get(j)+" "+temp1.length);
					bb:
					for(int l=0;l<temp2.length;l++)
					{
						System.out.println(temp1[k]+" "+temp2[l]);
						
					 if(temp1[k]==temp2[l])
					 flag=1;
					}
					if(flag==0) {
						System.out.println(temp1[k]+".,.,.,.,. ");
					break aa;}
					if(k==temp1.length-1)
					break aa;	
					flag=0;
				}
				if(flag==1) {
					System.out.println("dummy");
					frndsList.set(i,null);
					System.out.println("dummy1");
				}
				
			}
		}
		List<String> frndsList2 = new ArrayList<String>();
		for(int i=0;i<frndsList.size();i++) {
		 if(!frndsList.get(i).equals(null))
			 frndsList2.add(frndsList.get(i));
		}
		return frndsList2;

    }
	
	public static void main(String[] args)
	{
		List<String> frndsList = new ArrayList<String>();
		frndsList.add("U1,U2");
		frndsList.add("U3,U4");
		frndsList.add("U2,U1");
		System.out.println(compareFriends(frndsList));
	}
}
