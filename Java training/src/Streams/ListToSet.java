package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListToSet 
{

		public static void main(String[] args) {

			List<Product_S> product=new ArrayList<Product_S>();
			 product.add(new Product_S(10,"viki",10034.4f));
			 product.add(new Product_S(20,"Sweatha",15030.4f));
			 product.add(new Product_S(30,"Praveen",20031.4f));
			 product.add(new Product_S(40,"Karthu",20534.4f));
			 
			 Set<Float> ProductPriceList=product.stream()
					                     .filter(p ->p.price<20000.0f)
					                     .map(p->p.price)
					                     .collect(Collectors.toSet());
			 System.out.println(ProductPriceList);
			 
	}
}
