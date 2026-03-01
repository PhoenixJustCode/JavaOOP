package lab1.Problem3;

public class TemperatureTest {
    public static void main(String[] args) {
        System.out.println("Testing Temperature Class...");

        Temperature t1 = new Temperature();
        Temperature t2 = new Temperature(100);
        Temperature t3 = new Temperature('F');
        Temperature t4 = new Temperature(212, 'F');
        Temperature t5 = new Temperature(100, 'C');

        System.out.println("t1 (default): " + t1.getDegreesC() + "C (" + t1.getDegreesF() + "F)");
        System.out.println("t2 (value only): " + t2.getDegreesC() + "C (" + t2.getDegreesF() + "F)");
        System.out.println("t3 (scale only): " + t3.getDegreesC() + "C (" + t3.getDegreesF() + "F)");
        System.out.println("t4 (both): " + t4.getDegreesC() + "C (" + t4.getDegreesF() + "F)");


        System.out.println("\nVerifying conversions:");
        System.out.println("0C in F: " + t1.getDegreesF() + " (Expected: 32.0)");
        System.out.println("100C in F: " + t5.getDegreesF() + " (Expected: 212.0)");
        
        System.out.println("212F in C: " + t4.getDegreesC() + " (Expected: 100.0)");
        System.out.println("0F in C: " + t3.getDegreesC() + " (Expected: -17.77...)");

        System.out.println("\nTesting Setters:");
        t1.setValue(32);
        t1.setScale('F');
        System.out.println("t1 changed to 32F: " + t1.getDegreesC() + "C (Expected: 0.0)");

        t1.setBoth(50, 'C');
        System.out.println("t1 changed to 50C: " + t1.getDegreesF() + "F (Expected: 122.0)");
    }
}
