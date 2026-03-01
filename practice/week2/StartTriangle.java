package week2;

import java.util.Scanner;

public class StartTriangle {
    public int count;
    public final String STR = "[*]";

    StartTriangle(int cnt) { 
        this.count = cnt;
    }
    
    public String toString() {
        StringBuilder out = new StringBuilder();
        for(int i = 1; i<= this.count; i ++) { 
            out.append(STR.repeat(i));
            out.append("\n");
        }

        return out.toString();
    }


    public static void main(String []args) { 
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        StartTriangle small = new StartTriangle(year);

        System.out.println(small.toString());
        sc.close();
    }
}
