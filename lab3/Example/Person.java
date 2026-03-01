package Problem4;

import java.util.Date;
import java.util.Objects;

public class Person {
	public String name;
	private int age;
	private Date birthDate;
	
	public Person() {
		
	}
	
	public Person(String name, int age, Date birthDate) {
		this.name      = name;
		this.age       = age;
		this.birthDate = birthDate;
	}
	
	
	public int getAge() {
		return age;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	
	
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", birthDate=" + birthDate + "]";
	}

	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		Person p = (Person) obj;
		return this.age == p.age && this.birthDate.equals(p.birthDate) && this.name.equals(p.name);
	}
	
	public int hashCode() {
		return Objects.hash(age, birthDate, name);
	}
}
