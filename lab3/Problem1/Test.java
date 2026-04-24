// javac lab3/Problem1/*.java && java -cp . lab3.Problem1.Test
package lab3.Problem1;

public class Test {
	public static void main(String[] args) {
		Shape s1 = new Triangle(3, 4, 5, 4);
		System.out.println(s1);

		Shape s2 = new Cube(5);
		System.out.println(s2);

		Shape s3 = new Cylinder(3, 7);
		System.out.println(s3);
	}
}
