package Streams;


	import java.util.ArrayList;
	import java.util.List;
	import java.util.stream.Collectors;

	public class FilteringCollection 
	{
	   public static void main(String[] args) 
	   {
		 List<Product_S> product=new ArrayList<Product_S>();
		 product.add(new Product_S(10,"viki",10034.4f));
		 product.add(new Product_S(20,"Sweatha",10034.4f));
		 product.add(new Product_S(30,"Praveen",20034.4f));
		 product.add(new Product_S(40,"Karthu",20034.4f));
		 
		 List<Product_S> filteredProduct=product.stream()
				                 				.filter(p->p.price>11100f)
				                 				.map(p->p)
				                 				.collect(Collectors.toList());
		 System.out.println("Filtered List is "+filteredProduct);
	   }
		
	}
