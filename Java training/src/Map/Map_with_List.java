package Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.apache.commons.collections4.MultiMap;

public class Map_with_List 
{

	public static void main(String[] args)
	{
		HashMap<String,ArrayList<String>> hm = new HashMap<String,ArrayList<String>>();
		
		//MultiMap<String,String> mm=new MultiMap<String,String>(); 
		
		hm.put("phone",new ArrayList<String>(Arrays.asList("RAM","Screen","Battery","ROM")));
		hm.put("Fridge",new ArrayList<String>(Arrays.asList("Cooler","trays","container")));
		
		ArrayList<String> a=hm.get("Fridge");
		if(!a.isEmpty())
		{
			a.add("MilkTray");
		}
		
		
		hm.put("AC",new ArrayList<String>(Arrays.asList("Filter","Fan","container")));
		
		
		System.out.println(hm);
	}
}
