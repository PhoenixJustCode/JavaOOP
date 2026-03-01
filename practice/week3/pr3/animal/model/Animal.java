package pr3.animal.model;

public abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound() ;
        // System.out.println("Animal sound");
    public abstract void eat();
// System.out.println("Animal is eating");

    public abstract void eat(String food);
        // System.out.println("Animal is eating " + food);

    public String getInfo() {
        return "Name: " + name + ", Age: " + age;
    }
}
