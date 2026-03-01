

public class Student extends Person implements CanHavePizza, CanHaveRetake, Movable {
    public Student(String name) {
        super(name);
    }

    @Override public void eatPizza() { System.out.println("Student " + name + " eats pizza."); }
    @Override public void retakeExam() { System.out.println("Student " + name + " retakes exam."); }
    @Override public void move() { System.out.println("Student " + name + " moves."); }
    @Override public void dance() { System.out.println("Student " + name + " dances."); }
}
