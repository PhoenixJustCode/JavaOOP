public class Restaurant {

    public boolean servePizza(CanHavePizza eater) {
        eater.eatPizza();

        if (eater instanceof Person) {
            System.out.println(
                "Processing payment for Person: " +
                ((Person) eater).getName()
            );
        }

        return true;
    }
}
