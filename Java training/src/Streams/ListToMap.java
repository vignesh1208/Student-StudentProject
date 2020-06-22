package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
 class ListToMap 
{
	public static void main(String[] args) {

		List<Product_S> product=new ArrayList<Product_S>();
		 product.add(new Product_S(10,"viki",10034.4f));
		 product.add(new Product_S(20,"Sweatha",15030.4f));
		 product.add(new Product_S(30,"Praveen",20031.4f));
		 product.add(new Product_S(40,"Karthu",20534.4f));

		 Map<Object, Object> product_map=product.stream()
				                                .filter(p->p.id<25)
				                                .collect(Collectors.toMap(p->p.id, p->p.Name));
		 System.out.println(product_map);
	}
}