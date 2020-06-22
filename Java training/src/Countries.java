import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Countries 
{

	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("India");
		al.add("India");
		al.add("India");
		al.add("India");
		al.add("America");
		al.add("America");
		al.add("America");
		al.add("Srilanka");
		al.add("Srilanka");
		al.add("Srilanka");
		al.add("Singapore");
		al.add("Singapore");
		al.add("Singapore");
		al.add("Singapore");
		al.add("Singapore");
		
		HashSet<String> hs=new HashSet<String>(al);
		ArrayList<String> al2=new ArrayList<String>(hs);
		
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		
		
		HashMap<String,Integer> hm2 = new HashMap<String,Integer>();
		HashMap<String,Integer> hm3 = new HashMap<String,Integer>();
		
		//al.forEach(hm3.put(String::trim, Collections.frequency(al, toString())));
		
		for(String s:al){
			hm2.put(s, Collections.frequency(al, s));
		}
		
		
		System.out.println("hm2 "+hm2);
		for(int i=0;i<al2.size();i++)
		{
			int j=Collections.frequency(al,al2.get(i));
			hm.put(al2.get(i),j);
		}
		System.out.println(hm);
		
	}
}
