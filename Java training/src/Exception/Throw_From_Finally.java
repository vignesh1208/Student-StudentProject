package Exception;

import java.io.Console;

public class Throw_From_Finally {
	
	 static void fun() throws IllegalAccessException //throws IllegalAccessException 
, ClassNotFoundException
	    { 
	    	try {
	        System.out.println("Inside fun(). "); 
	        throw new vigneshException("ee");
	        //throw new IllegalAccessException("demo");
	    	}
	    	finally{
	    	throw new ClassNotFoundException();
	    	}
	    } 
	  
	    // This is a caller function  
	    public static void main(String args[]) throws IllegalAccessException, ClassNotFoundException  //throws IllegalAccessException 
	    { 
	        try { 
	            fun(); 
	        } 
	        finally {
	        	
	        }
	      
	    } 
}
