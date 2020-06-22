package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortReverseOrder
{
	public static void main(String[] args)
	{
	ArrayList<String> al=new ArrayList<String>();  
    al.add("Viru");    
    al.add("Saurav");    
    al.add("Mukesh");    
    al.add("Tahir");   
    Collections.sort(al, Collections.reverseOrder());
    System.out.println(al);
    
	}
}
