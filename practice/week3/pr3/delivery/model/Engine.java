package pr3.delivery.model;

public class Engine {
    private String type;
    private double horsePower;

    public Engine(String type, double horsepower) {
        this.type = type;
        this.horsePower = horsepower;
    }

    public String getEngineInfo() {
        return "Type: " + type + ", Horsepower: " + horsePower;
    }
}
