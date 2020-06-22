import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

class Product {

String name;
String category;
int price;
Map<String,String> features;


public Product(String name, String category, int price, Map<String, String> features) {
	super();
	this.name = name;
	this.category = category;
	this.price = price;
	this.features = features;
}

@Override
public String toString() {
	return "Product [name=" + name + ", category=" + category + ", price=" + price + ", features=" + features + "]";
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public Map<String, String> getFeatures() {
	return features;
}
public void setFeatures(Map<String, String> features) {
	this.features = features;
}



}


public class SortByMultipleValues 
{
		public static void sort_product(List<Product> pl)
		{
			Collections.sort(pl,Comparator.comparing(Product::getCategory)
										  .thenComparing(Product::getPrice));
			
		}


		public static void main(String[] args)
		{
			List<Product> productList=new ArrayList<Product>();	
			productList.add(new Product("s9","mobile",50000,null));
			productList.add(new Product("whirlpool","WashingMaching",15000,null));
			productList.add(new Product("Motorola","mobile",25000,null));
			productList.add(new Product("Voltas","AC",50000,null));
			productList.add(new Product("OnePlus","mobile",45000,null));
			System.out.println(productList);
			sort_product(productList);
			System.out.println(productList);
		
		}
}
