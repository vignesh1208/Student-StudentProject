package Serialization;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.ListIterator;

import Queue.Employee;

public class Serialization {

	public static void main(String[] args) throws IOException {
		ArrayList<Employee> a1=new ArrayList<Employee>();
		a1.add(new Employee(100,"viki"));
		a1.add(new Employee(101,"sweatha"));
		a1.add(new Employee(102,"praveen"));
		a1.add(new Employee(103,"karthiga"));
		//Iterator<String> itr= a1.iterator();
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Vmuralitha001\\Downloads\\file1.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(a1);
		
		ListIterator<Employee> itr= a1.listIterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	}
}
