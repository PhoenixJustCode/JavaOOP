package lab2.problem1.shape3d;

public class Cube extends Shape3D {
    private double side;

    public Cube(double s) {
        this.side = s;
    }

    @Override
    public double volume() {
        return Math.pow(side, 3);
    }

    @Override
    public double surfaceArea() {
        return 6 * side * side;
    }
}
