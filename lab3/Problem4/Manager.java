package lab3.Problem4;

import java.util.Date;
import java.util.Vector;

public class Manager extends Employee {
	private double bonus;
	private Vector<Employee> team;

	public Manager(String personName, double salary, Date hireDate, String insuranceNumber, double bonus) {
		super(personName, salary, hireDate, insuranceNumber);
		this.bonus = bonus;
		this.team = new Vector<Employee>();
	}

	public double getBonus() { return bonus; }
	public void setBonus(double bonus) { this.bonus = bonus; }

	public Vector<Employee> getTeam() { return team; }

	public void addEmployee(Employee e) { team.add(e); }

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!super.equals(obj)) return false;
		if (getClass() != obj.getClass()) return false;
		Manager other = (Manager) obj;
		return Double.compare(bonus, other.bonus) == 0;
	}

	@Override
	public String toString() {
		return "Manager [name=" + getPersonName() + ", salary=" + getSalary()
				+ ", bonus=" + bonus + ", team=" + team + "]";
	}

	// Если зарплаты равны ТО сравниваем по бонусу
	@Override
	public int compareTo(Employee other) {
		int result = super.compareTo(other);
		if (result == 0 && other instanceof Manager) {
			Manager otherManager = (Manager) other;
			result = Double.compare(this.bonus, otherManager.bonus);
		}
		return result;
	}

	// клонируем Vector и каждого сотрудника в нём
	@Override
	public Manager clone() throws CloneNotSupportedException {
		Manager m = (Manager) super.clone();
		m.team = new Vector<Employee>();
		for (Employee e : this.team) {
			m.team.add(e.clone());
		}
		return m;
	}
}
