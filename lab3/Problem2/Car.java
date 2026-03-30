package lab3.Problem2;

// Car реализует только Moveable (не MoveableVertically)
// потому что машина может двигаться только влево-вправо (по горизонтали)
public class Car implements Moveable {
	private String model;
	private int position;

	public Car(String model, int position) {
		this.model = model;
		this.position = position;
	}

	public String getModel() { return model; }
	public int getPosition() { return position; }

	@Override
	public void moveRight() { position++; }

	@Override
	public void moveLeft() { position--; }

	@Override
	public String toString() {
		return "Car [model=" + model + ", position=" + position + "]";
	}
}
