package lab3.Problem2;

// Реализует MoveableVertically (который расширяет Moveable)
// Значит реализует все 4 метода: moveRight, moveLeft, moveUp, moveDown
public class MoveablePoints implements MoveableVertically {
	private int x, y;

	public MoveablePoints(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() { return x; }
	public void setX(int x) { this.x = x; }
	public int getY() { return y; }
	public void setY(int y) { this.y = y; }

	@Override
	public void moveRight() { x++; }

	@Override
	public void moveLeft() { x--; }

	@Override
	public void moveUp() { y++; }

	@Override
	public void moveDown() { y--; }

	@Override
	public String toString() {
		return "MoveablePoints [x=" + x + ", y=" + y + "]";
	}
}
