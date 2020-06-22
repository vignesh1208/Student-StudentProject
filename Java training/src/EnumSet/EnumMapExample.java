package EnumSet;

import java.util.EnumMap;
import java.util.Map.Entry;

public class EnumMapExample 
{

	enum days1{
		SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
	};
	
	public static void main(String[] args) {
	EnumMap<days1,String> map=new EnumMap<days1,String>(days1.class);
	
    map.put(days1.SUNDAY,"1");
    map.put(days1.MONDAY,"2");
    map.put(days1.WEDNESDAY,"3");
    map.put(days1.THURSDAY,"3");
    
    for(Entry<days1, String> e:map.entrySet())
    {
    	System.out.println(e.getKey()+" "+e.getValue());
    }
    
	
}
}

