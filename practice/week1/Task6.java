package week1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean flag = true;
        // 
            
        for(int i = 0; i< (s.length()+1)/2; i++)  { 
            char r = s.charAt(i);
            char l = s.charAt(s.length()-1-i);
            if (r != l) {
                flag = false;
            }
        }
        if(flag){
            System.out.println("polindrom");
        } else { 
            System.out.println("It is not a polindrom");
        }
        sc.close();
    }
}
