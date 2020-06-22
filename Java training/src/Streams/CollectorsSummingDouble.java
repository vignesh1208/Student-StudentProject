package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product_S{
	
	int id;
	String Name;
	float price;
	
	
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Product_S [Name=" + Name + ", price=" + price + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public Product_S(int id, String name, float price) {
		super();
		this.id = id;
		Name = name;
		this.price = price;
	}
	
}


public class CollectorsSummingDouble 
{
   public static void main(String[] args) 
   {
	 List<Product_S> product=new ArrayList<Product_S>();
	 product.add(new Product_S(10,"viki",10034.4f));
	 product.add(new Product_S(20,"Sweatha",10034.4f));
	 double totalPrice=product.stream().collect(Collectors.summingDouble(Product_S -> Product_S.price));
	 System.out.println("Total Price is "+totalPrice);
   }
	
}
