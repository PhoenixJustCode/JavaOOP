package lab1.Problem5;

import java.util.Vector;

public class DragonLaunch {
    private Vector<Person> kidnappedPeople;

    public DragonLaunch() {
        this.kidnappedPeople = new Vector<>();
    }

    public void kidnap(Person p) {
        kidnappedPeople.add(p);
    }

    public Boolean willDragonEatOrNot() {
        int boysCount = 0;
        int survivors = 0;

        for (Person p : kidnappedPeople) {
            if (p.getGender() == Gender.BOY) {
                boysCount++;
            } else {
                if (boysCount > 0) {
                    boysCount--;
                } else {
                    survivors++;
                }
            }
        }
        
        return (boysCount + survivors) > 0;
    }

    public static void main(String[] args) {
        DragonLaunch launch1 = new DragonLaunch();
        launch1.kidnap(new Person(Gender.BOY)); 
        launch1.kidnap(new Person(Gender.BOY));
        launch1.kidnap(new Person(Gender.GIRL));
        launch1.kidnap(new Person(Gender.GIRL));
        System.out.println("BBGG: Will dragon eat? " + launch1.willDragonEatOrNot());


        DragonLaunch launch2 = new DragonLaunch();
        launch2.kidnap(new Person(Gender.GIRL));
        launch2.kidnap(new Person(Gender.BOY));
        launch2.kidnap(new Person(Gender.GIRL));
        launch2.kidnap(new Person(Gender.BOY));
        System.out.println("GBGB: Will dragon eat? " + launch2.willDragonEatOrNot());
    }
}
