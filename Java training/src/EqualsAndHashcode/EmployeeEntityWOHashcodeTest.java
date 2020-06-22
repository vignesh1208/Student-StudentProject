package EqualsAndHashcode;

import java.util.HashSet;
import java.util.Set;

public class EmployeeEntityWOHashcodeTest 
{
	public static void main(String[] args)
	{
		EmployeeEntityWOHashcode e1=new EmployeeEntityWOHashcode("viki",28);
		EmployeeEntityWOHashcode e2=new EmployeeEntityWOHashcode("Sweatha",23);
		EmployeeEntityWOHashcode e3=new EmployeeEntityWOHashcode("viki",28);
		EmployeeEntityWOHashcode e4=new EmployeeEntityWOHashcode("Karthu",29);
	
	Set<EmployeeEntityWOHashcode> set=new HashSet<EmployeeEntityWOHashcode>();
	set.add(e1);//set.add(e2);set.add(e3);set.add(e4);
	if(set.contains(e3))
		System.out.println("True");
	else {
		System.out.println("False");
		System.out.println("True"+"e1.hashCode()"+e1.hashCode()+"e3.hashCode()"+e3.hashCode());
	}}
}
/**
Now can you see why if two objects are considered equal, their hashcodes must also be equal? 
Otherwise, you'd never be able to find the object since the default hashcode method in class Object 
virtually always comes up with a unique number for each object, even if the equals() method is overridden 
in such a way that two or more objects are considered equal. It doesn't matter how equal the objects are 
if their hashcode don't reflect that. So one more time: If two objects are equal, their hashcodes must be
 equal as well.
*/