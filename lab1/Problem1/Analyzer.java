package lab1.Problem1;

import java.util.Scanner;

public class Analyzer {
    public static void main(String[] args) {
        
        Data data = new Data();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("enter numbers (Q to quit): ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("Q")) {
                break;
            }

            try {
                double value = Double.parseDouble(input);
                data.add(value);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, введети число заного");
            }
        }

        System.out.println("Average = " + data.getAverage());
        System.out.println("Maximum = " + data.getMax());

        sc.close();
    }
}
