// Run: javac lab2/problem1/shape3d/*.java && java lab2.problem1.shape3d.ShapeTest
package lab2.problem1.shape3d;

public class ShapeTest {
    public static void main(String[] args) {
        Shape3D cylinder = new Cylinder(3, 5);
        Shape3D sphere = new Sphere(4);
        Shape3D cube = new Cube(2);

        System.out.println(cylinder);
        System.out.println(sphere);
        System.out.println(cube);
    }
}
