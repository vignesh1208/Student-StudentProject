package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args) throws IOException {
	
			FileInputStream fin=new FileInputStream("C:\\Users\\Vmuralitha001\\Downloads\\file1.ser");
		    int i=0;
		    while((i=fin.read())!=-1)
		    {
		    	System.out.println(i);
		    	System.out.println((char)i);
		    }
	        fin.close();
	}
}
