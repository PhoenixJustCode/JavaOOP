// javac lab3/Problem4/*.java && java -cp . lab3.Problem4.Test
package lab3.Problem4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) throws ParseException, CloneNotSupportedException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Employee e1 = new Employee("Nurtas", 500000, sdf.parse("17/10/2020"), "21B00921");
		Employee e2 = new Employee("Adlet", 450000, sdf.parse("10/06/2019"), "21B30921");
		Employee e3 = new Employee("Zarina", 500000, sdf.parse("01/03/2021"), "21B40555");

		// --- toString ---
		System.out.println("=== toString ===");
		System.out.println(e1);
		System.out.println(e2);

		// --- equals ---
		System.out.println("\n=== equals ===");
		System.out.println("e1.equals(e2): " + e1.equals(e2));
		System.out.println("e1.equals(e1): " + e1.equals(e1));

		// --- Comparable (sort by salary) ---
		System.out.println("\n=== Comparable (salary) ===");
		Employee[] employees = {e1, e2, e3};
		Arrays.sort(employees);
		for (Employee e : employees) {
			System.out.println(e.getPersonName() + " - " + e.getSalary());
		}

		// --- ComparatorByName ---
		System.out.println("\n=== Comparator by name ===");
		Arrays.sort(employees, new ComparatorByName());
		for (Employee e : employees) {
			System.out.println(e.getPersonName());
		}

		// --- DateComparable ---
		System.out.println("\n=== Comparator by hireDate ===");
		Arrays.sort(employees, new DateComparable());
		for (Employee e : employees) {
			System.out.println(e.getPersonName() + " - " + e.getHireDate());
		}

		// --- Manager ---
		System.out.println("\n=== Manager ===");
		Manager m1 = new Manager("Klara", 600000, sdf.parse("15/09/2015"), "21B56921", 50000);
		Manager m2 = new Manager("Bolat", 600000, sdf.parse("20/01/2018"), "21B77777", 80000);
		m1.addEmployee(e1);
		m1.addEmployee(e2);
		System.out.println(m1);
		System.out.println(m2);

		// --- Manager compareTo (same salary -> compare by bonus) ---
		System.out.println("\n=== Manager compareTo ===");
		System.out.println("m1 vs m2: " + m1.compareTo(m2));

		// --- Clone Employee ---
		System.out.println("\n=== Clone Employee ===");
		Employee e1Clone = e1.clone();
		System.out.println("Original: " + e1);
		System.out.println("Clone:    " + e1Clone);
		e1Clone.setPersonName("Changed");
		e1Clone.setSalary(999);
		System.out.println("After changing clone:");
		System.out.println("Original: " + e1);
		System.out.println("Clone:    " + e1Clone);

		// --- Deep Clone Manager ---
		System.out.println("\n=== Deep Clone Manager ===");
		Manager m1Clone = m1.clone();
		System.out.println("Original team size: " + m1.getTeam().size());
		System.out.println("Clone team size:    " + m1Clone.getTeam().size());
		m1Clone.getTeam().get(0).setPersonName("CHANGED_IN_CLONE");
		System.out.println("Original team[0]: " + m1.getTeam().get(0).getPersonName());
		System.out.println("Clone team[0]:    " + m1Clone.getTeam().get(0).getPersonName());
	}
}
