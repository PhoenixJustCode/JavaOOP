package lab3.Problem6;

import lab2.problem5.Animal;
import java.util.ArrayList;
import java.util.List;

// Улучшенное животное:
// Встроенные интерфейсы: Comparable (сравнение по возрасту), Cloneable (клонирование)
// Пользовательские интерфейсы: Trainable (дрессировка), Feedable (кормление)
public class ImprovedAnimal extends Animal implements Comparable<ImprovedAnimal>, Cloneable, Trainable, Feedable {
	private List<String> learnedCommands;
	private boolean hungry;

	public ImprovedAnimal(String name, int age) {
		super(name, age);
		this.learnedCommands = new ArrayList<>();
		this.hungry = true;
	}

	@Override
	public String getSound() {
		return "...";
	}

	// --- Comparable ---
	@Override
	public int compareTo(ImprovedAnimal other) {
		return Integer.compare(this.getAge(), other.getAge());
	}

	// --- Cloneable ---
	@Override
	public ImprovedAnimal clone() throws CloneNotSupportedException {
		ImprovedAnimal copy = (ImprovedAnimal) super.clone();
		copy.learnedCommands = new ArrayList<>(this.learnedCommands);
		return copy;
	}

	// --- Trainable ---
	@Override
	public void train(String command) {
		if (!learnedCommands.contains(command)) {
			learnedCommands.add(command);
			System.out.println(getName() + " выучил команду: " + command);
		} else {
			System.out.println(getName() + " уже знает команду: " + command);
		}
	}

	@Override
	public boolean knowsCommand(String command) {
		return learnedCommands.contains(command);
	}

	// --- Feedable ---
	@Override
	public void feed(String food) {
		hungry = false;
		System.out.println(getName() + " покормлен: " + food);
	}

	@Override
	public boolean isHungry() {
		return hungry;
	}

	public List<String> getLearnedCommands() {
		return learnedCommands;
	}

	@Override
	public String toString() {
		return super.toString() + ", commands=" + learnedCommands + ", hungry=" + hungry;
	}
}
