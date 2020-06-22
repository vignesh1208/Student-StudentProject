package Streams;

import java.util.ArrayList;
import java.util.List;

public class Count 
{
	public static void main(String[] args) {

	List<Product_S> product=new ArrayList<Product_S>();
	 product.add(new Product_S(10,"viki",10034.4f));
	 product.add(new Product_S(20,"Sweatha",15030.4f));
	 product.add(new Product_S(30,"Praveen",20031.4f));
	 product.add(new Product_S(40,"Karthu",20534.4f));
	 
	 
	 int count  = (int) product.stream()
			                   .filter(p -> p.price<20031.4f)
			                   .count();
	 System.out.println(" product with price<20031.4f is "+count);
	}
}
