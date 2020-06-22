package LambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class ListForEachLoop 

{

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("abc");
		list.add("def");
		list.add("ghi");
		list.add("jkl");
		
		list.forEach(
				(a)->{System.out.println(a);}
				);
}
}
