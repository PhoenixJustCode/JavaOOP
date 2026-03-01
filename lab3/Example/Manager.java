package Problem4;

import java.util.Date;
import java.util.Objects;
import java.util.Vector;

public class Manager extends Employee {
	Vector<Employee> team;
	double bonus;
	{	
		team = new Vector<Employee>();
	}
	
	public Manager() {
		
	}
	
	public Manager(String name, int age, Date birthDate, double salary, Date hireDate, String insuranceNum, double bonus) {
		super(name,age,birthDate,salary,hireDate,insuranceNum);
		this.bonus = bonus;
	}
	
	public void addTeamate(Employee e) {
		team.add(e);
	}
	
	public double getBonus() {
		return bonus;
	}
	
	public boolean equals(Object obj) {
		if(!super.equals(obj)) return false;
		if(obj.getClass() == this.getClass()) {
			Manager m = (Manager) obj;
			return m.team.equals(this.team);
		}
		return false;
	}
	
	public int hashCode() {
		return Objects.hash(team); 
	}
	
	public Object clone() throws CloneNotSupportedException {
		Manager m = (Manager) super.clone();
		return m;
	}
}
