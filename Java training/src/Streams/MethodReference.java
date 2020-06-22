package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MethodReference 

{
	public static void main(String[] args) {

		List<Product_S> product=new ArrayList<Product_S>();
		 product.add(new Product_S(10,"viki",10034.4f));
		 product.add(new Product_S(20,"Sweatha",15030.4f));
		 product.add(new Product_S(30,"Praveen",20031.4f));
		 product.add(new Product_S(40,"Karthu",20534.4f));

		 List<String> product_list=	product.stream()
				                    .map(Product_S::getName)
				                    .collect(Collectors.toList());
		 System.out.println(product_list);
	}
}
