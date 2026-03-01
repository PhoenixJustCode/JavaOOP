package pr3.delivery.app;

import pr3.delivery.model.Car;
import pr3.delivery.model.Engine;
import pr3.delivery.model.Truck;
import pr3.delivery.model.Vehicle;
import pr3.delivery.service.DeliveryService;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        Engine carEngine = new Engine("V6", 300);
        Engine truckEngine = new Engine("V8 Diesel", 500);

        List<Vehicle> vehicles = new ArrayList<>();
        Car car = new Car("Toyota Camry", 100, carEngine, 5);
        Truck truck = new Truck("Volvo FH", 200, truckEngine, 20000);

        vehicles.add(car);
        vehicles.add(truck);

        DeliveryService service = new DeliveryService();

        System.out.println("--- All Vehicles ---");
        service.printAllVehicles(vehicles);

        System.out.println("\n--- Delivery Costs ---");
        service.calculateAllDeliveries(vehicles);

        System.out.println("\n--- Total Cost ---");
        System.out.println("Total: " + service.calculateTotalCost(vehicles));

        System.out.println("\n--- Overloaded Methods ---");
        System.out.println("Car with extra weight: " + car.calculateDeliveryCost(50));
        System.out.println("Truck with distance/fuel: " + truck.calculateDeliveryCost(100, 1.5));
    }
}
