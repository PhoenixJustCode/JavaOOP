// How to run:
// cd practice/week5/problem1
// javac pr5/io/app/SafeDivider.java
// java pr5.io.app.SafeDivider

package pr5.io.app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeDivider {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter first integer (or 'q' to quit): ");
                String line = scan.nextLine().trim();
                if (line.equalsIgnoreCase("q")) break;
                int x1 = Integer.parseInt(line);

                System.out.print("Enter second integer: ");
                int x2 = Integer.parseInt(scan.nextLine().trim());

                int result = x1 / x2;
                System.out.println("Result: " + x1 + " / " + x2 + " = " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed. Try again.");
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter integers only. Try again.");
            }
        }

        scan.close();
    }
}
