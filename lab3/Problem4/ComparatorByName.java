package Problem4;
import java.util.Comparator;
public class ComparatorByName implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		return e1.getPersonName().compareTo(e2.getPersonName());
	}
}