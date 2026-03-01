package week2;

import java.util.Scanner;

public class Student {
    private String name;
    private int id;
    private int yearOfStudy;

    public Student(String name, int year) { 
        this.name = name;
        this.yearOfStudy = year;
    }

    void Inc() { 
        this.yearOfStudy = yearOfStudy + 1;
    }
    public int GetYear() { 
        return this.yearOfStudy;
    }

    public int GetId() { 
        return this.id;
    }
    public String GetName() { 
        return this.name;
    }

    @Override
    public String toString() {
        return name + " (" + id + ")";
    }


    public static void main(String []args) { 
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        // String skip = sc.nextLine();
        String name = sc.nextLine();

        Student st = new Student(name, year);

        System.out.println(st.GetId());
        System.out.println(st.GetName());
        
        st.Inc();
        System.out.println(st.GetYear());
        sc.close();
    }
}
