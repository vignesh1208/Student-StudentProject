package EnumSet;

import java.util.EnumSet;
import java.util.Set;

enum days{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
};

public class EnumSetExample {

	public static void main(String[] args)
	{
		Set<days> s1=EnumSet.of(days.MONDAY,days.FRIDAY);
		System.out.println(s1);
		Set<days> set1 = EnumSet.allOf(days.class);  
	      System.out.println("Week Days:"+set1);  
	      Set<days> set2 = EnumSet.noneOf(days.class);  
	      System.out.println("Week Days:"+set2);     
	}
}
