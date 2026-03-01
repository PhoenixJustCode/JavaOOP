package Problem4;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Test {

	public static void main(String[] args) throws ParseException, CloneNotSupportedException {
//		String personName, double salary, Date hireDate, String insuranceNumber
		Employee e1 = new Employee("Nurtas", 9999999.9, new SimpleDateFormat("dd/MM/yyyy").parse("17/10/2003"), "21B00921"); 
		Employee e2 = new Employee("Adlet", 9999999.8, new SimpleDateFormat("dd/MM/yyyy").parse("10/06/2000"), "21B30921");
		@SuppressWarnings("unused")
		Employee clone = (Employee) e1.clone();
		Manager m = new Manager("Klara", 9999999.6, new SimpleDateFormat("dd/MM/yyyy").parse("15/09/1966"), "21B56921", 11111.1);
		m.add(e1);
		m.add(e2);
//		ComparatorByName comp = new ComparatorByName();
//		comp.compare(e1, e2);
		System.out.println(m);
		Manager m1 = (Manager) m.clone();
		System.out.println(m1);
		System.out.println(e1.clone());
	}

}
