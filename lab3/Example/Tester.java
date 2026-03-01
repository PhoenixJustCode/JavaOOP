package Problem4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

public class Tester {
//	String name, int age, Date birthDate, double salary, Date hireDate, String insuranceNum
	public static void main(String args[]) throws ParseException, CloneNotSupportedException {
		Employee madna = new Employee("Madina", 19, new SimpleDateFormat("dd/MM/yyyy").parse("22/07/2003"), 0, new SimpleDateFormat("dd/MM/yyyy").parse("30/11/2025"),"123456");
		Employee clone = (Employee) madna.clone();
		clone.setInsuranceNum("123");
		madna.setSalary(123);
		Employee a = new Employee("Madina", 19, new SimpleDateFormat("dd/MM/yyyy").parse("22/07/2003"), 0, new SimpleDateFormat("dd/MM/yyyy").parse("30/11/2025"),"123456");
		Employee b = new Employee("Aldiar", 19, new SimpleDateFormat("dd/MM/yyyy").parse("20/05/2003"), 0, new SimpleDateFormat("dd/MM/yyyy").parse("30/11/2025"),"4321");
		Employee c = new Employee("Bakhredin", 19, new SimpleDateFormat("dd/MM/yyyy").parse("08/08/2002"), 2500, new SimpleDateFormat("dd/MM/yyyy").parse("30/11/2025"),"6969696");
		Manager m = new Manager("Miras", 18, new SimpleDateFormat("dd/MM/yyyy").parse("15/10/2004"), 0, new SimpleDateFormat("dd/MM/yyyy").parse("30/11/2025"),"819248918924", 1000);
		m.team.add(a);
		m.team.add(b);
		m.team.add(c);
		Manager mclone = (Manager) m.clone(); 
		System.out.println(m.team);
		Vector<Employee> v = new Vector<Employee>();
		v.add(clone);
		mclone.team = v; 
		System.out.println(mclone.team);
	}
	
}
