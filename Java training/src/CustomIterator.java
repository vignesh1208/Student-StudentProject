import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

 class CustomizedIterator implements Iterator<Object> 
 {
	 int index;
	 List<Integer> l1;
	 
	 CustomizedIterator(List<Integer> l2)
	 {
		 index=0;
		 l1=l2;
	 }
	 
	@Override
	public boolean hasNext() {
		
		return index<l1.size();
	}

	@Override
	public Object next() {
	
		if(!(l1.get(index)%2==0))
			return l1.get(index++);
		
		index++;
		return 0;
	}	
}

 
 
public class CustomIterator extends ArrayList
{
	
	
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return super.iterator();
	}

	public static void main(String[] args)
	{
		List<Integer> all=new ArrayList<Integer>();
		all.add(1);all.add(2);all.add(3);
		all.add(4);all.add(5);all.add(6);	
		all.add(0);
		System.out.println(all);
		all.removeIf(x->x==0);
		System.out.println(all);
		
		Iterator itr1=all.iterator();
		itr1.hasNext();
		CustomizedIterator itr= new CustomizedIterator(all);
		
		while(itr.hasNext())
		{
			int a=(int) itr.next();
			if(a!=0)
			System.out.println(a);
		}
		
		
		
	}
}