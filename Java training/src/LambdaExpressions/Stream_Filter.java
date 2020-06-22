package LambdaExpressions;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

	    
public class Stream_Filter {
public static void main(String[] args) {
	
	List<product> list=new ArrayList<product>();
	list.add(new product(10,"viki","50"));
	list.add(new product(20,"Sweatha","60"));
	list.add(new product(50,"Praveen","70"));
	list.add(new product(40,"Karthiga","80"));
	
	Collections.sort(list,(a1,a2)->{
	      return a1.name.compareTo(a2.name);
	    		  });
	
    Stream<product> filtered_Stream=list.stream().filter(p->p.id<35);
    filtered_Stream.forEach(product->System.out.println(product.name));
}
}