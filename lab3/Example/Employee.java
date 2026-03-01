package Problem4;

import java.util.Date;
import java.util.Objects;

public class Employee extends Person implements Comparable<Employee>, Cloneable{
	
	private double salary;
	private Date hireDate;
	private String insuranceNum;
	
	public Employee() { 
		
	}
	
	public Employee(String name, int age, Date birthDate, double salary, Date hireDate, String insuranceNum) {
		super(name,age,birthDate);
		this.salary       = salary;
		this.hireDate 	  = hireDate;
		this.insuranceNum = insuranceNum;
	}
	
	public String getInsuranceNum() {
		return insuranceNum;
	}
	public void setInsuranceNum(String insuranceNum) {
		this.insuranceNum = insuranceNum;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

	public String toString() {
		return "Employee [salary=" + salary + ", hireDate=" + hireDate + ", insuranceNum=" + insuranceNum + "]";
	}
	
	public int hashCode() {
		return Objects.hash(salary,hireDate,insuranceNum);
	}
	
	public boolean equals(Object obj) {
		if(!super.equals(obj)) return false;
		if(this.getClass() == obj.getClass()) {
			Employee e = (Employee) obj;
			return this.salary == e.salary && this.hireDate.equals(e.hireDate) && this.insuranceNum.equals(e.insuranceNum);
		}
		return false;
	}
	
	
	//-1 "this" is smaller 
	// 1 "this" is greater
	// 0 they are equal to each other
	public int compareTo(Employee e) {
		if(e.salary > this.salary) return -1;
		if(e.salary < this.salary) return 1;
		return 0;
	}
	
	public Object clone() throws CloneNotSupportedException {
		Employee e = (Employee) super.clone();
		e.hireDate = (Date) this.hireDate.clone();
		return e;
	}
}
