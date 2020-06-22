package LambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lambda_example {

    
	public static void main(String[] args)
	{
	List<Integer> l1=new ArrayList<Integer>();
    l1.add(4);
    l1.add(3);
    l1.add(5);
    l1.add(1);
    System.out.println(l1);
    Collections.sort(l1,(i1,i2) -> i1.compare(i1, i2));
    System.out.println(l1);
    
    product p1=new product(300,"Viki","Lakh");
    product p2=new product(100,"aiki","Lakh");
    product p3=new product(200,"diki","Lakh");
    List<product> l2=new ArrayList<product>();
    l2.add(p1);
    l2.add(p2);
    l2.add(p3);
    l2.forEach((a)->System.out.println("list "+a));
    System.out.println(l2);
    Collections.sort(l2,(i3,i4) -> Integer.compare(i3.id,i4.id));
    System.out.println(l2);
	Collections.sort(l2,(i5,i6) -> i5.name.compareTo(i6.name));
	}
}
