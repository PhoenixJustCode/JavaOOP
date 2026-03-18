// How to run:
// cd practice/week5/problem5
// javac pr5/io/util/ExpressionException.java pr5/io/app/ExpressionEvaluator.java
// java pr5.io.app.ExpressionEvaluator
// (make sure expressions.txt is in the problem5 directory)

package pr5.io.app;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class ExpressionEvaluator {
    public static void main(String[] args) {
        try (
            BufferedReader reader = new BufferedReader(new FileReader("expressions.txt"));
            PrintWriter results = new PrintWriter(new FileWriter("results.txt"));
            PrintWriter log = new PrintWriter(new FileWriter("log.txt"))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;

                try {
                    double result = evaluate(line);
                    results.println(line + " = " + result);
                    System.out.println(line + " = " + result);
                } catch (NoSuchElementException e) {
                    String error = "Missing operand in expression: \"" + line + "\"";
                    log.println(error);
                    System.out.println("ERROR: " + error);
                } catch (NumberFormatException e) {
                    String error = "Invalid number in expression: \"" + line + "\" - " + e.getMessage();
                    log.println(error);
                    System.out.println("ERROR: " + error);
                } catch (UnsupportedOperationException e) {
                    String error = "Unsupported operator in expression: \"" + line + "\" - " + e.getMessage();
                    log.println(error);
                    System.out.println("ERROR: " + error);
                }
            }

            System.out.println("\nResults written to results.txt");
            System.out.println("Errors logged to log.txt");

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }

    private static double evaluate(String expression) {
        String validOperators = "+-*/";
        int opIndex = -1;
        char operator = ' ';

        // Find any non-digit, non-dot operator character (skip first char for negative numbers)
        for (int i = 1; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (!Character.isDigit(c) && c != '.') {
                opIndex = i;
                operator = c;
                break;
            }
        }

        if (opIndex == -1) {
            throw new NoSuchElementException("No operator found");
        }

        if (validOperators.indexOf(operator) == -1) {
            throw new UnsupportedOperationException("Unsupported operator: " + operator);
        }

        StringTokenizer st = new StringTokenizer(expression, String.valueOf(operator));

        String firstToken;
        String secondToken;

        try {
            firstToken = st.nextToken().trim();
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Missing first operand");
        }

        try {
            secondToken = st.nextToken().trim();
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Missing second operand");
        }

        if (firstToken.isEmpty()) {
            throw new NoSuchElementException("Missing first operand");
        }
        if (secondToken.isEmpty()) {
            throw new NoSuchElementException("Missing second operand");
        }

        double a = Double.parseDouble(firstToken);
        double b = Double.parseDouble(secondToken);

        switch (operator) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
            default:
                throw new UnsupportedOperationException("Unsupported operator: " + operator);
        }
    }
}
