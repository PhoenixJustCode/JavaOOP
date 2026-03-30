package lab3.Problem4;

import java.util.Date;
import java.util.Objects;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
	private double salary;
	private Date hireDate;
	private String insuranceNumber;

	public Employee(String personName, double salary, Date hireDate, String insuranceNumber) {
		super(personName);
		this.salary = salary;
		this.hireDate = hireDate;
		this.insuranceNumber = insuranceNumber;
	}

	public Employee(String personName, double salary) {
		super(personName);
		this.salary = salary;
		this.hireDate = new Date();
		this.insuranceNumber = "";
	}

	public double getSalary() { return salary; }
	public void setSalary(double salary) { this.salary = salary; }

	public Date getHireDate() { return hireDate; }
	public void setHireDate(Date hireDate) { this.hireDate = hireDate; }

	public String getInsuranceNumber() { return insuranceNumber; }
	public void setInsuranceNumber(String insuranceNumber) { this.insuranceNumber = insuranceNumber; }

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!super.equals(obj)) return false;
		if (getClass() != obj.getClass()) return false;
		Employee other = (Employee) obj;
		return Double.compare(salary, other.salary) == 0
				&& Objects.equals(insuranceNumber, other.insuranceNumber)
				&& Objects.equals(hireDate, other.hireDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), salary, hireDate, insuranceNumber);
	}

	@Override
	public String toString() {
		return "Employee [name=" + getPersonName() + ", salary=" + salary
				+ ", hireDate=" + hireDate + ", insuranceNumber=" + insuranceNumber + "]";
	}

	@Override
	public int compareTo(Employee other) {
		return Double.compare(this.salary, other.salary);
	}

	@Override
	public Employee clone() throws CloneNotSupportedException {
		Employee e = (Employee) super.clone();
		e.hireDate = (Date) this.hireDate.clone();
		return e;
	}
}
