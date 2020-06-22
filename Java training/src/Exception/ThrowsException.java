package Exception;


public class ThrowsException { 
	  
    // This method throws an exception 
    // to be handled 
    // by caller or caller 
    // of caller and so on. 
    static void fun() throws IllegalAccessException //throws IllegalAccessException 
    { 
    	try {
        System.out.println("Inside fun(). "); 
        throw new IllegalAccessException("demo");
    	}
    	finally{
    		
    	}
    } 
  
    // This is a caller function  
    public static void main(String args[]) throws IllegalAccessException //throws IllegalAccessException 
    { 
        try { 
            fun(); 
        } 
        finally {
        	
        }
      
    } 
} 