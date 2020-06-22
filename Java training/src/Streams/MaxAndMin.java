package Streams;

import java.util.ArrayList;
import java.util.List;

public class MaxAndMin
{

	public static void main(String[] args) 
	{
		 List<Product_S> product=new ArrayList<Product_S>();
		 product.add(new Product_S(10,"viki",10034.4f));
		 product.add(new Product_S(20,"Sweatha",10030.4f));
		 product.add(new Product_S(30,"Praveen",20031.4f));
		 product.add(new Product_S(40,"Karthu",20034.4f));
		 
		 Product_S Product=product.stream()
				                  .max((product1,product2)->product1.price > product2.price ?1:-1)
				                  .get();
		 System.out.println("Maximum Price is :"+Product.price);
		
		 Product_S Product1=product.stream()
                 .max((product1,product2)->product1.price < product2.price ?1:-1)
                 .get();
		 System.out.println("Minimum Price is :"+Product1.price);

		 
	}
}
