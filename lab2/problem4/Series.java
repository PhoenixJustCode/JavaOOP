package lab2.problem4;

public class Series extends Circuit {
    private Circuit a;
    private Circuit b;

    public Series(Circuit a, Circuit b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getResistance() {
        return a.getResistance() + b.getResistance();
    }

    @Override
    public double getPotentialDiff() {
        return a.getPotentialDiff() + b.getPotentialDiff();
    }

    @Override
    public void applyPotentialDiff(double V) {
        double current = V / getResistance();
        a.applyPotentialDiff(current * a.getResistance());
        b.applyPotentialDiff(current * b.getResistance());
    }
}
