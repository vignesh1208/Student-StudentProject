package Programming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'processStrings' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING str1
     *  2. STRING str2
     */

    public static List<String> processStrings(String str1, String str2) {
    	char[] c=str1.toCharArray();
        char[] c2=str2.toCharArray();
        String s="a";
        String s1="a";
        ArrayList<String> l1=new ArrayList<String>();
        for(int i=0;i<c.length;i++)
        {
            int flag=0;
            for(int j=0;j<c2.length;j++)
            {
                if(c[i]==c2[j])
                {
                    flag=1;
                }
            }
            if(flag==0)
            s=s+c[i];
            flag=0;
        }
        s=s.substring(1);
        if(!s.isEmpty())
        l1.add(s);
         for(int i=0;i<c2.length;i++)
        {
            int flag=0;
            for(int j=0;j<c.length;j++)
            {
                if(c2[i]==c[j])
                {
                    flag=1;
                }
            }
            if(flag==0) 
            s1=s1+c2[i];
           // System.out.println(s1+"...");
            flag=0;
        }
        s1=s1.substring(1);
        if(!s.isEmpty())
        l1.add(s1);
        return l1;

    }

}

public class c1 {
    public static void main(String[] args) throws IOException {
     
        List<String> result = Result.processStrings("ABC","ABD");
        System.out.println(result);
    }
}
