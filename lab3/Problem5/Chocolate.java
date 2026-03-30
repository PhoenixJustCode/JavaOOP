package lab3.Problem5;

public class Chocolate implements Comparable<Chocolate> {
	private double weight;
	private String name;

	public Chocolate(double weight, String name) {
		this.weight = weight;
		this.name = name;
	}

	public double getWeight() { return weight; }
	public void setWeight(double weight) { this.weight = weight; }

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	@Override
	public int compareTo(Chocolate other) {
		int result = Double.compare(this.weight, other.weight);
		if (result == 0) {
			return this.name.compareTo(other.name);
		}
		return result;
	}

	@Override
	public String toString() {
		return "Chocolate [weight=" + weight + ", name=" + name + "]";
	}
}
