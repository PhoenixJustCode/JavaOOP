// Запуск: java lab3.Problem6.Test
//cd d:/8.Java && java -Dfile.encoding=UTF-8 lab3.Problem6.Test 2>&1

package lab3.Problem6;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) throws CloneNotSupportedException {

		// === ImprovedAnimal ===
		System.out.println("=== ImprovedAnimal ===");
		ImprovedAnimal dog = new ImprovedAnimal("Bobik", 3);
		ImprovedAnimal cat = new ImprovedAnimal("Murka", 5);
		ImprovedAnimal parrot = new ImprovedAnimal("Kesha", 1);

		// Trainable
		dog.train("sit");
		dog.train("paw");
		dog.train("sit");
		System.out.println("Bobik knows 'sit': " + dog.knowsCommand("sit"));
		System.out.println("Bobik knows 'roll': " + dog.knowsCommand("roll"));

		// Feedable
		System.out.println("\nBobik hungry: " + dog.isHungry());
		dog.feed("meat");
		System.out.println("Bobik hungry: " + dog.isHungry());

		// Comparable (sort by age)
		System.out.println("\n--- Sort animals by age ---");
		ImprovedAnimal[] animals = {dog, cat, parrot};
		Arrays.sort(animals);
		for (ImprovedAnimal a : animals) {
			System.out.println(a);
		}

		// Cloneable
		System.out.println("\n--- Clone ---");
		ImprovedAnimal dogClone = dog.clone();
		dogClone.train("roll");
		System.out.println("Original commands: " + dog.getLearnedCommands());
		System.out.println("Clone commands:    " + dogClone.getLearnedCommands());

		// === ImprovedPerson ===
		System.out.println("\n=== ImprovedPerson ===");
		ImprovedPerson p1 = new ImprovedPerson("Alikhan", 25);
		ImprovedPerson p2 = new ImprovedPerson("Dana", 22);
		ImprovedPerson p3 = new ImprovedPerson("Marat", 30);

		// Employable
		p1.hire("Java Developer");
		p2.hire("Designer");
		System.out.println("Alikhan employed: " + p1.isEmployed());
		System.out.println("Marat employed: " + p3.isEmployed());

		// Introduceable
		System.out.println("\n--- Introduce ---");
		p1.assignPet(dog);
		System.out.println(p1.introduce());
		System.out.println(p2.introduce());
		System.out.println(p3.introduce());

		// Comparable (sort by age)
		System.out.println("\n--- Sort people by age ---");
		ImprovedPerson[] people = {p1, p2, p3};
		Arrays.sort(people);
		for (ImprovedPerson p : people) {
			System.out.println(p);
		}

		// Cloneable
		System.out.println("\n--- Clone ---");
		ImprovedPerson p1Clone = p1.clone();
		p1Clone.fire();
		System.out.println("Original: " + p1);
		System.out.println("Clone:    " + p1Clone);
	}
}
