package lab2.problem4;

public class Parallel extends Circuit {
    private Circuit a;
    private Circuit b;

    public Parallel(Circuit a, Circuit b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getResistance() {
        double r1 = a.getResistance();
        double r2 = b.getResistance();
        return (r1 * r2) / (r1 + r2);
    }

    @Override
    public double getPotentialDiff() { return a.getPotentialDiff(); }

    @Override
    public void applyPotentialDiff(double V) {
        a.applyPotentialDiff(V);
        b.applyPotentialDiff(V);
    }
}
