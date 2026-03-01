// Run: javac lab2/problem4/*.java && java lab2.problem4.CircuitTest
package lab2.problem4;

public class CircuitTest {
    public static void main(String[] args) {
        Circuit r1 = new Resistor(7.0);
        Circuit r2 = new Resistor(10.0);
        Circuit r3 = new Resistor(6.0);
        Circuit r4 = new Resistor(4.0);
        
        Circuit c1 = new Parallel(r1, r2);
        Circuit c2 = new Series(r3, r4);
        Circuit circuit = new Parallel(c1, c2);
        
        System.out.println("Equivalent Resistance: " + circuit.getResistance());
        circuit.applyPotentialDiff(12.0);
        System.out.println("Total Current: " + circuit.getCurrent());
        System.out.println("Total Power: " + circuit.getPower());
    }
}
