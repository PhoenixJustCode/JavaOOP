// Run: javac lab2/problem5/*.java && java lab2.problem5.PetTest
package lab2.problem5;

public class PetTest {
    public static void main(String[] args) {
        Person john = new Employee("John", 30, "Engineer");
        Person alice = new PhDStudent("Alice", 26, "Comp. Science");
        Animal rex = new Dog("Rex", 3);
        john.assignPet(rex);
        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);
        System.out.println("--- Initial State ---\n" + registry);
        System.out.println("--- John goes on vacation, tries to leave Rex with Alice ---");
        john.leavePetWith(alice);
        System.out.println("\n--- John leaves Rex with a Student instead ---");
        Person bob = new Student("Bob", 20, "Math");
        registry.addPerson(bob);
        john.leavePetWith(bob);
        System.out.println("\n--- Registry after John goes on vacation ---\n" + registry);
        john.retrievePetFrom(bob);
        System.out.println("\n--- Final Registry State ---\n" + registry);
    }
}
