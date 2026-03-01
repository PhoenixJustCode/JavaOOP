package week1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
    
        int a = sc.nextInt(); 

        System.out.printf("Area: %d\n", a*a);
        System.out.printf("Perimeter: %d\n", 4*a);
        System.out.printf("Diag: ", a * Math.sqrt(2));

        sc.close();
    }
}
