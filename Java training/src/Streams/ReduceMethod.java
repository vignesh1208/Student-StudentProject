package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;


enum Enums
{
   D, E, S;
   private Enums()
   {
       System.out.println(20);
   }
}

class X extends ReduceMethod{
}
public class ReduceMethod 
{
	
	public static void main (String args[])

    {

        Display(1);

    }

    public static void Display(Object o)

    {

        System.out.println("In Object Method");

    }

    public void Display(String o)

    {

        System.out.println("In String Method");

    }

    public void Display(StringBuffer o)

    {

        System.out.println("In StringBuffer Method");

    }

}
/*	
	public static void main(String[] args)
    {
        TreeSet<Monkey> d = new TreeSet<Monkey>();
        d.add(new Monkey(1));
        d.add(new Monkey(2));
        d.add(new Monkey(1));
        System.out.println(d.size());
    }
    static class Monkey
    {
        Monkey(int i){}    
    }
     void finalize(){}
}
	/*
	
	
	
	   public static void main(String[] args)
	   {
	       Enums en = Enums.E;
	   }
	

}
	/*
	public static void main (String [] s) {
        System.out.println(" 11<22<33 is :" + (11<22<33));
        System.out.println (" 11>22>33 is :" + (11>22>33));
    }
}
	/*
	 public static void main(String[] args) {

	        int iReturned = new ReduceMethod().testEMethod();

	        System.out.println("Returned value of i = " + iReturned);

	    }

	    public int testEMethod(){

	        int i = 0;

	        try{

	            i = 100/0;

	            return i;

	        }

	        catch(Exception e){

	            i = 200/0;

	            return i;

	        }

	        finally{

	            i = 300;

	        }

	    }}
	/**
	  public int x = 0;

	    public int y = 0;

	 

	    public ReduceMethod(int x, int y) {

	        this.x = x;

	        this.y = 0;

	    }
	    public static void main(String as[]){

	        System.out.println(throwmethod());

	    }

	    public static int throwmethod(){

	        try{

	            throw new ClassNotFoundException();

	        }catch(Exception e){

	            throw new NullPointerException();

	        }

	    }

	  /**  public static void main (String []s) {

	        System.out.println ("something() returns: " + something () );

	    }

	    static Boolean something() {

	        while (true) {

	            try { return true; }

	            finally { break;}

	        }

	        return false;

	    }


	/**	 List<Product_S> product=new ArrayList<Product_S>();
		 product.add(new Product_S(10,"viki",10034.4f));
		 product.add(new Product_S(20,"Sweatha",10034.4f));
		 product.add(new Product_S(30,"Praveen",20034.4f));
		 product.add(new Product_S(40,"Karthu",20034.4f));
		 
		 Float d= product.stream()
				          .map(p->p.price)
				          .reduce(0.0f,(sum,price)-> sum+price);
		System.out.println(d);
		*/		          
		
		
		/*
		 *    
		 *     Float totalPrice = productsList.stream()  
                    .map(product->product.price)  
                    .reduce(0.0f,(sum, price)->sum+price);   // accumulating price  
        	   System.out.println(totalPrice);  
        
        // More precise code   
        float totalPrice2 = productsList.stream()  
                .map(product->product.price)  
                .reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class  
        System.out.println(totalPrice2);
		 */
                         
	

