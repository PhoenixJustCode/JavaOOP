package Problem2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		MoveablePoints m1 = new MoveablePoints(x, y);
		m1.moveDown();
		System.out.println(m1);
		m1.moveLeft();
		System.out.println(m1);
		m1.moveRight();
		System.out.println(m1);
		m1.moveUp();
		System.out.println(m1);
		sc.close();
	}

}
