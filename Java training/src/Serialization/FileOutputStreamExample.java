package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

	public static void main(String[] args) throws IOException {
	
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Vmuralitha001\\Downloads\\file1.ser");
		String s="Welcome";
		byte b[]=s.getBytes();
		fos.write(b);
		fos.close();
		

	}
}
