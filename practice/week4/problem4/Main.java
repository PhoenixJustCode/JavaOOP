//cd D:\8.Java\practice\week4\problem4; javac *.java; java Main
import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
            new Student("Charlie", 3.5),
            new Student("Alice", 3.8),
            new Student("Bob", 3.2)
        ));

        System.out.println("Original:");
        students.forEach(System.out::println);

        System.out.println("\nSorted by GPA (Comparable):");
        Collections.sort(students);
        students.forEach(System.out::println);

        System.out.println("\nSorted by Name (Comparator):");
        Collections.sort(students, new NameComparator());
        students.forEach(System.out::println);
    }
}
