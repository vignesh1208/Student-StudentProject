package comparableAndComparator;

import java.util.Comparator;

public class Age_Comparator implements Comparator<Employee_SortByName>{

	@Override
	public int compare(Employee_SortByName e1, Employee_SortByName e2) {
		return e1.age.compareTo(e2.age);
	}

}
