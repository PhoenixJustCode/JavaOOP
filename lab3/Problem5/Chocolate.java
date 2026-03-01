package Problem5;

public class Chocolate implements Comparable<Chocolate>{
	private double weight;
	private String name;
	public Chocolate(double weight, String name) {
		this.weight = weight;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int compareTo(Chocolate c) {
		  if (this.weight > c.weight) return 1;
		  if (this.weight < c.weight) return -1;
		  if(this.weight ==  c.weight) {
			  return this.getName().compareTo(c.getName());
		  }
		  return 0;
		 }

	@Override
	public String toString() {
		return "Chocolate [weight=" + weight + ", name=" + name + "]";
	}
	
}
