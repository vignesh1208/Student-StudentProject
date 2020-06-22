
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
class ArrayList1 {
public static void main(String[] args) {

	ArrayList<String> a1=new ArrayList<String>();
	a1.add("Ravi");
	a1.add("Ravi1");
	a1.add("Ravi2");
	a1.add("Ravi3");
	//Iterator<String> itr= a1.iterator();
	ListIterator<String> itr= a1.listIterator();
	while(itr.hasNext()) {
	System.out.println(itr.next());
	}
}
}