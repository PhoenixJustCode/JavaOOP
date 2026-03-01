// cd D:\8.Java\practice\week4\problem2; javac *.java; java Main

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Cat cat = new Cat();
        Student student = new Student("John");

        System.out.println("Serving Cat:");
        restaurant.servePizza(cat);

        System.out.println("\nServing Student:");
        restaurant.servePizza(student);
    }
}
