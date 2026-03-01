// Run: javac lab2/problem1/person/*.java && java lab2.problem1.person.PersonTest
package lab2.problem1.person;

import java.util.HashSet;

public class PersonTest {
    public static void main(String[] args) {
        HashSet<Person> people = new HashSet<>();

        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Alice", 25);
        Employee e1 = new Employee("Bob", 30, "E001");
        Employee e2 = new Employee("Bob", 30, "E001");
        Employee e3 = new Employee("Bob", 30, "E002");

        people.add(p1);
        people.add(p2);
        people.add(e1);
        people.add(e2);
        people.add(e3);

        System.out.println("HashSet size: " + people.size());
        for (Person p : people) {
            System.out.println(p);
        }
    }
}
