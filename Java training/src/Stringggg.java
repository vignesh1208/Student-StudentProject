import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Stringggg {

	
	    public static int solution(String S) {
	        char[] a=S.toCharArray();
	        int count=0;
	        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
	        	for(int j=0;j<a.length;j++)
	        	{
	        		if(hm.containsKey(a[j]))
	        		{
	        			int ii=hm.get(a[j]);
	        			ii++;
	        			hm.put(a[j],ii);
	        		}
	        		else
	        			hm.put(a[j],1);	        		
	        	}
	        	
	        	Set<Character> hs= hm.keySet();
	        	ArrayList<Character> ha=new ArrayList<Character>(hs);
	        	for(int i=0;i<hs.size();i++)
	        	{
	        		for(int k=0;k<hs.size();k++) {
	        			
	        			if(i==k)
	        				continue;
	        			if(hm.get(ha.get(i))==hm.get(ha.get(k)))
	        			{	count++;
	        				int a1=hm.get(ha.get(k));
	        				hm.put(ha.get(k), a1-1);
	        			}
	        		}
	        	}
	        
	        return count;
	    }
	
	    
	    public static void main(String[] args)
	    {
	    	System.out.println(solution("aaaabbbbccccdddde"));
	    }
}
