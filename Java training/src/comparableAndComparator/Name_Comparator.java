package comparableAndComparator;

import java.util.Comparator;

class Name_Comparator implements Comparator<Employee_SortByName>{

	@Override
	public int compare(Employee_SortByName E1, Employee_SortByName E2) {
		return E2.Name.compareTo(E1.Name);
	}

}
/**
class Name_Comparator implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		Employee_SortByName E1;
		Employee_SortByName E2;
		return E1.Name.compareTo(E2.Name);
	}

}
*/