package lab1.Problem5;

public class Person {
    private Gender gender;

    public Person(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return gender.toString();
    }
    
    public Gender getGender() {
        return gender;
    }
}
