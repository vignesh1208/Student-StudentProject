package EqualsAndHashcode;

import java.util.HashSet;
import java.util.Set;

public class EmployeeEntityTest 
{
	public static void main(String[] args)
	{
	EmployeeEntity e1=new EmployeeEntity("viki",28);
	EmployeeEntity e2=new EmployeeEntity("Sweatha",23);
	EmployeeEntity e3=new EmployeeEntity("viki",28);
	EmployeeEntity e4=new EmployeeEntity("Karthu",29);
	
	Set<EmployeeEntity> set=new HashSet<EmployeeEntity>();
	set.add(e1);//set.add(e2);set.add(e3);set.add(e4);
	if(set.contains(e3))
		System.out.println("True"+"    e1.hashCode()"+e1.hashCode()+"   e3.hashCode()"+e3.hashCode());
	}
}
