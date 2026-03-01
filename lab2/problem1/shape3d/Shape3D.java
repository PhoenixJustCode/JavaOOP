package lab2.problem1.shape3d;

public abstract class Shape3D {
    public abstract double volume();
    public abstract double surfaceArea();

    @Override
    public String toString() {
        return String.format("Shape: %s, Volume: %.2f, Surface Area: %.2f", 
            this.getClass().getSimpleName(), volume(), surfaceArea());
    }
}
