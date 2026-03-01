package Problem4;

import java.util.Date;
import java.util.Vector;

public class Manager extends Employee{
	private double bonus;
	public Vector<Employee> v;
	{
		v = new Vector<Employee>();
	}
	
	public Manager(String personName, double salary, Date hireDate, String insuranceNumber, double bonus) {
		super(personName, salary, hireDate, insuranceNumber);
		this.bonus = bonus;
	}
	
	public double getBonus() {
		return bonus;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public void add(Employee e) {
		v.add(e);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!super.equals(obj)) return false;
		if (getClass() != obj.getClass()) return false;
		Manager other = (Manager) obj;
		return Double.doubleToLongBits(bonus) == Double.doubleToLongBits(other.bonus);
	}

	public String toString() {
		return "Manager [bonus=" + bonus + ", v=" + v + "]";
	}
	
	public Object clone() throws CloneNotSupportedException{
		Manager m = (Manager) super.clone();
		return m;
	}
	
	
	
}
