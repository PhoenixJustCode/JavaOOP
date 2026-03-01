package Problem4;

import java.util.Objects;

public class Person {
	private String personName;

	public Person(String personName) {
		this.personName = personName;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Person other = (Person) obj;
		return Objects.equals(personName, other.personName);
	}
	
	public String toString() {
		return "Person [personName=" + personName + "]";
	}
	
}
