package pr3.animal.app;

import pr3.animal.model.Animal;
import pr3.animal.model.Dog;
import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        // animals.add(new Animal("Generic Animal", 5));
        animals.add(new Dog("Buddy", 3, "Golden Retriever"));
        animals.add(new Dog("Max", 2, "German Shepherd"));

        for (Animal animal : animals) {
            System.out.println(animal.getInfo());
            animal.makeSound();
            animal.eat("Bone");
            System.out.println("-------------------");
        }
    }
}
