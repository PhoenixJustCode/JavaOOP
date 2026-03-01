package week1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int Balance = 1000;

        int input = sc.nextInt();
        int res = input*Balance/100;
        System.out.printf("Balance : %d \n", res+Balance);
  
        sc.close();
    }
}
