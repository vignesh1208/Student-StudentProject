import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result1 {

    /*
     * Complete the 'countPalindromes' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */
	 public static boolean palindrome_check(String str2)
		{
		 System.out.println(str2+",,");
			char[] a=str2.toCharArray();
			for(int i=0,j=a.length-1;i<a.length&&j>=0;i++,j--)
			{
				if(a[i]==a[j])
				continue;
				else
				return false;
			}
			System.out.println(str2+"..");
			return true;
		}
	 
	 
	    public static int countPalindromes(String s) {
	    	
	    	int count=0;
	    	if(palindrome_check(s))
				count++;
	    	for(int i=0;i<s.length();i++)
	    	{
	    		System.out.println("s[0]"+s.charAt(i));
	    		for(int j=s.length()-1;j>0;j--)
	    		{
	    			if(j-i>1)
	    			{
	    			if(palindrome_check(s.substring(i, j)))
	    				count++;
	    			}
	    		
	    			System.out.println(count+" i "+i+" j "+j);
	    		}
	    	}
	    	
	    	return count+s.length();
	   

	    }

}
public class Solution1 {
    public static void main(String[] args) throws IOException {
     System.out.println(Result1.countPalindromes("abccba"));
    }
}
