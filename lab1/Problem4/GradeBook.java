package lab1.Problem4;

import week2.Student;
import java.util.Arrays;

public class GradeBook {
    private Course course;
    private Student[] students;
    private int[] grades;
    private int studentCount;
    private static final int DEFAULT_CAPACITY = 10;

    public GradeBook(Course course) {
        this.course = course;
        this.students = new Student[DEFAULT_CAPACITY];
        this.grades = new int[DEFAULT_CAPACITY];
        this.studentCount = 0;
    }

    public void addStudent(Student student, int grade) {
        if (studentCount >= students.length) {
            resizeArrays();
        }
        students[studentCount] = student;
        grades[studentCount] = grade;
        studentCount++;
    }

    private void resizeArrays() {
        int newCapacity = students.length * 2;
        students = Arrays.copyOf(students, newCapacity);
        grades = Arrays.copyOf(grades, newCapacity);
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.getName() + "!");
        System.out.println(course.getDescription()); 
        System.out.println();
    }

    public void displayGradeReport() {
        System.out.println("Class average is " + String.format("%.2f", determineClassAverage()) + ".");
        displayBestAndWorst();
        outputBarChart();
    }

    public double determineClassAverage() {
        if (studentCount == 0) return 0.0;
        int total = 0;
        for (int i = 0; i < studentCount; i++) {
            total += grades[i];
        }
        return (double) total / studentCount;
    }

    public void outputBarChart() {
        System.out.println("\nGrades distribution:");
        int[] frequency = new int[11]; 

        for (int i = 0; i < studentCount; i++) {
            int grade = grades[i];
            if (grade == 100) {
                frequency[10]++;
            } else {
                frequency[grade / 10]++;
            }
        }

        for (int i = 0; i < frequency.length; i++) {
            if (i == 10) {
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
            }

            for (int stars = 0; stars < frequency[i]; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private void displayBestAndWorst() {
        if (studentCount == 0) return;

        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        Student bestStudent = null;
        Student worstStudent = null;

        for (int i = 0; i < studentCount; i++) {
            int grade = grades[i];
            Student student = students[i];

            if (grade > highest) {
                highest = grade;
                bestStudent = student;
            }
            if (grade < lowest) {
                lowest = grade;
                worstStudent = student;
            }
        }

        if (bestStudent != null) {
            System.out.println("Lowest grade is " + lowest + " (" + worstStudent.toString() + ")."); 
            System.out.println("Highest grade is " + highest + " (" + bestStudent.toString() + ").");
        }
    }

    @Override
    public String toString() {
        return "GradeBook for " + course.getName() + " with " + studentCount + " students.";
    }
}
