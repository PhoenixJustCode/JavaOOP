package week1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        int b = sc.nextInt(); 
        int c = sc.nextInt(); 

        Double result1 = 0.0;
        Double result2 = 0.0;
        int D = b*b-4*a*c;
        if(D <= 0) {
            System.out.println("D less than 0");
        } else {
            result2 = (-1 * b + Math.sqrt(D))/2;
            result1 = (-1 * b - Math.sqrt(D))/2;
            System.out.printf("R2 : %f\n", result2);
            System.out.printf("R1 : %f\n",result1);
        }
        

  
        sc.close();
    }
}
