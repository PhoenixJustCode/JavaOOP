// Запуск: java lab3.Problem2.Test
package lab3.Problem2;

public class Test {
	public static void main(String[] args) {
		MoveablePoints point = new MoveablePoints(0, 0);
		System.out.println("Start: " + point);
		point.moveRight();
		System.out.println("moveRight: " + point);
		point.moveUp();
		System.out.println("moveUp: " + point);
		point.moveLeft();
		System.out.println("moveLeft: " + point);
		point.moveDown();
		System.out.println("moveDown: " + point);

		System.out.println();

		Car car = new Car("Toyota", 5);
		System.out.println("Start: " + car);
		car.moveRight();
		System.out.println("moveRight: " + car);
		car.moveLeft();
		System.out.println("moveLeft: " + car);
	}
}
