package Problem4;

import java.util.Date;
import java.util.Objects;

public class Employee extends Person implements Comparable<Employee>, Cloneable{
	private double salary;
	public Date hireDate;
	private String insuranceNumber;
	
	public Employee(String personName, double salary, Date date, String insuranceNumber) {
		super(personName);
		this.salary = salary;
		this.hireDate = date;
		this.insuranceNumber = insuranceNumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getInsuranceNumber() {
		return insuranceNumber;
	}

	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!super.equals(obj)) return false;
		if (getClass() != obj.getClass()) return false;
		Employee other = (Employee) obj;
		return Objects.equals(insuranceNumber, other.insuranceNumber)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", hireDate=" + hireDate + ", insuranceNumber=" + insuranceNumber + "]";
	}

	public int compareTo(Employee e) {
		  if(e.salary > this.salary) return -1;
		  if(e.salary < this.salary) return 1;
		  return 0;
		 }

	public Object clone() throws CloneNotSupportedException{
		Employee e = (Employee) super.clone();
		e.hireDate=(Date) this.hireDate.clone();
		return e;
	}
	
}
