package Serialization;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.ListIterator;

import Queue.Employee;

public class Deserialization {

	public static void main(String[] args) throws IOException {
		ArrayList<Employee> a2=new ArrayList<Employee>();
		
		//Iterator<String> itr= a1.iterator();
		FileInputStream fis=new FileInputStream("C:\\Users\\Vmuralitha001\\Downloads\\file.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
	    try {
			a2=(ArrayList<Employee>) ois.readObject();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	    ois.close();
	    fis.close();
		ListIterator<Employee> itr= a2.listIterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	}
}
