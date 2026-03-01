package lab2.problem5;

import java.util.Objects;

public abstract class Person {
    protected String name;
    protected int age;
    protected Animal pet;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void assignPet(Animal pet) {
        if (canOwn(pet)) this.pet = pet;
        else System.out.println(name + " cannot own a " + pet.getClass().getSimpleName());
    }

    public void removePet() { this.pet = null; }
    public boolean hasPet() { return this.pet != null; }
    public Animal getPet() { return pet; }
    
    public abstract String getOccupation();
    protected abstract boolean canOwn(Animal pet);

    public void leavePetWith(Person caretaker) {
        if (this.hasPet()) {
            if (caretaker.canOwn(this.pet)) {
                caretaker.assignPet(this.pet);
                this.removePet();
                System.out.println(name + " left pet with " + caretaker.name);
            } else System.out.println(caretaker.name + " cannot take care of this pet!");
        }
    }

    public void retrievePetFrom(Person caretaker) {
        this.assignPet(caretaker.getPet());
        caretaker.removePet();
        System.out.println(name + " retrieved pet from " + caretaker.name);
    }

    @Override
    public String toString() {
        String petStr = hasPet() ? pet.toString() : "No pet";
        return String.format("%s (%d), Occupation: %s, Pet: %s", name, age, getOccupation(), petStr);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() { return Objects.hash(name, age); }
}
