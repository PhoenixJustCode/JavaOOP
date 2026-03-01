package pr3.delivery.model;

public class Truck extends Vehicle {
    private int maxLoad;

    public Truck(String model, double baseCost, Engine engine, int maxLoad) {
        super(model, baseCost, engine);
        this.maxLoad = maxLoad;
    }

    @Override
    public double calculateDeliveryCost() {
         return baseCost * 1.5; // Base cost + 50% 
    }

    public double calculateDeliveryCost(double distance, double fuelPrice) {
        return calculateDeliveryCost() + (distance * fuelPrice * 0.1); 
    }

    @Override
    public String getVehicleInfo() {
        return super.getVehicleInfo() + ", Max Load: " + maxLoad;
    }
}
