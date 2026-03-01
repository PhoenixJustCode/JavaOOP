

public class IPhone implements SellableAndPluggable {
    private double price;

    @Override public void setPrice(double price) { this.price = price; }
    @Override public void plug() { System.out.println("iPhone plugged in."); }
    @Override public void info() { System.out.println("iPhone info: $" + price); }
}
