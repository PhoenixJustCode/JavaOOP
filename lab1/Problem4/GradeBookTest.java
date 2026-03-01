package lab1.Problem4;

import week2.Student;
import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Course course = new Course("CS101", "intro to Computer Science", 3, "None");
        GradeBook gradeBook = new GradeBook(course);

        System.out.println("Welcome to the grade book for " + course.getName() + "!");
        System.out.println("Please input grades for students:");

        while (true) {
            System.out.print("Student name (or 'stop' to finish): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("stop")) break;

            System.out.print("Student ID: ");
            int id = Integer.parseInt(scanner.nextLine());

            Student student = new Student(name, id);

            System.out.print("Grade: ");
            int grade = Integer.parseInt(scanner.nextLine());
            
            gradeBook.addStudent(student, grade);
        }

        System.out.println();
        gradeBook.displayGradeReport();
        
        scanner.close();
    }
}
