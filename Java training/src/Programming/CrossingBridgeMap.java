
package Programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;

 
public class CrossingBridgeMap 
{

	public static int timeTaken(TreeMap<String,Integer> p1)
	{
		TreeSet<Entry<String,Integer>> s1=(TreeSet<Entry<String, Integer>>) p1.entrySet();
		int sum=0;
		int temp=0;
		for(int i=0;i<p1.size();i++)
		{
			if(i<p1.size()-3)
			{
			}
			
		}
		return temp;
	}
	
	public static void main(String[] args)
	{
		TreeMap<String,Integer> p=new TreeMap<String,Integer>();
		p.put("A", 100);
		p.put("A", 200);
		p.put("A", 500);
		p.put("A", 400);
		p.put("A", 300);
		System.out.println("The total time taken is "+timeTaken(p));
	}
	
}
