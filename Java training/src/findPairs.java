import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class findPairs 
{

	

	   public static int pairs(Integer[] a)
	   {
		 HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		 
		 for(int i=0;i<a.length;i++)
		 {
			if(hm.containsKey(a[i]))
			{
				int j=hm.get(a[i]);
				j++;
				hm.put(a[i],j);
			}
			else
			{
			  hm.put(a[i],1);
			}
		 }
		 
		Integer aaa= hm.entrySet().stream().map(HashMap.Entry::getValue).reduce(0,(sum,value)->sum+(value/2));
		
		//Integer aaa1= hm.entrySet().stream().map(HashMap.Entry::getValue).collect(Collectors.summingDouble());
		
		Integer aaa1= hm.entrySet().stream().filter(p->p.getKey()>5).collect(Collectors.summingInt(p->p.getKey()));//hm.values().stream().collect(Collectors.summingInt((Integer::intValue)));
		System.out.println(aaa1);
		return aaa;
}
	   
	   public static void main(String[] args)
	   {
		   Integer[] a= {1,2,3,1,1,1,1,1,1,1,2,6,6,6,6,7,8};
		   System.out.println("The total no of pairs in the array are "+pairs(a));
	   }
}
	   
