package lab3.Problem6;

import lab2.problem5.Animal;
import lab2.problem5.Person;

// Улучшенная персона:
// Встроенные интерфейсы: Comparable (сравнение по возрасту), Cloneable (клонирование)
// Пользовательские интерфейсы: Employable (трудоустройство), Introduceable (представление)
public class ImprovedPerson extends Person implements Comparable<ImprovedPerson>, Cloneable, Employable, Introduceable {
	private String position;
	private boolean employed;

	public ImprovedPerson(String name, int age) {
		super(name, age);
		this.position = "";
		this.employed = false;
	}

	@Override
	public String getOccupation() {
		return employed ? position : "Безработный";
	}

	@Override
	protected boolean canOwn(Animal pet) {
		return true;
	}

	// --- Comparable ---
	@Override
	public int compareTo(ImprovedPerson other) {
		return Integer.compare(this.age, other.age);
	}

	// --- Cloneable ---
	@Override
	public ImprovedPerson clone() throws CloneNotSupportedException {
		return (ImprovedPerson) super.clone();
	}

	// --- Employable ---
	@Override
	public void hire(String position) {
		this.position = position;
		this.employed = true;
		System.out.println(name + " принят на работу: " + position);
	}

	@Override
	public void fire() {
		System.out.println(name + " уволен с должности: " + position);
		this.position = "";
		this.employed = false;
	}

	@Override
	public boolean isEmployed() {
		return employed;
	}

	// --- Introduceable ---
	@Override
	public String introduce() {
		String info = "Привет, я " + name + ", мне " + age + " лет.";
		if (employed) {
			info += " Работаю как " + position + ".";
		}
		if (hasPet()) {
			info += " У меня есть питомец: " + getPet().getName() + ".";
		}
		return info;
	}

	@Override
	public String toString() {
		return super.toString() + ", employed=" + employed + ", position=" + position;
	}
}
