package lab2.problem5;

import java.util.ArrayList;
import java.util.List;

public class PersonRegistry {
    private List<Person> people = new ArrayList<>();
    public void addPerson(Person p) { people.add(p); }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Person Registry:\n");
        for (Person p : people) sb.append("- ").append(p.toString()).append("\n");
        return sb.toString();
    }
}
