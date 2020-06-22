package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortByAge_Lambda 
{
	  public static void main(String args[]){    
		  ArrayList<Employee_SortByAge> al=new ArrayList<Employee_SortByAge>();    
		  al.add(new Employee_SortByAge("Vijay",23));    
		  al.add(new Employee_SortByAge("Ajay",27));    
		  al.add(new Employee_SortByAge("Jai",21));   
		  al.add(new Employee_SortByAge(null,26));   
	      
		  Comparator<Employee_SortByAge> cm1=Comparator.comparing(Employee_SortByAge::getAge);
		  Collections.sort(al,cm1);
		  for(Employee_SortByAge st: al){  
			     System.out.println(st.Name+" "+st.age);  
			     }  
		  //Here, we sort the list of elements that also contains null.
		  
		  Comparator<Employee_SortByAge> cm3=Comparator.comparing(Employee_SortByAge::getName,Comparator.nullsFirst(String::compareTo));  
		  Collections.sort(al,cm1);  
		  System.out.println("Considers null to be less than non-null");  
		  for(Employee_SortByAge st: al){  
		     System.out.println(st.Name+" "+st.age);  
		     }  
		  Comparator<Employee_SortByAge> cm2=Comparator.comparing(Employee_SortByAge::getName,Comparator.nullsLast(String::compareTo));  
		  Collections.sort(al,cm2);  
		  System.out.println("Considers null to be greater than non-null");  
		  for(Employee_SortByAge st: al){  
		     System.out.println(st.Name+" "+st.age);  
		     }
		  /**
		  Considers null to be less than non-null
		  105 null 21
		  106 Ajay 27
		  101 Vijay 23
		  Considers null to be greater than non-null
		  106 Ajay 27
		  101 Vijay 23
		  105 null 21
	       */
	  }
}
