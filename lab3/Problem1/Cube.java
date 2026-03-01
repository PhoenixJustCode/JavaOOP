package Problem1;

public class Cube extends Shape implements Volume, LateralSurfaceArea, Perimeter{
	int a;
	
	Cube(int a){
		this.a=a;
	}
	
	@Override
	double getArea() {
		return 6*a*a;
	}

	@Override
	public double getPerimeter() {
		return 12*a;
	}

	@Override
	public double getVolume() {
		return a*a*a;
	}

	@Override
	public double getLateralSurfaceArea() {
		return 6*a*a;
	}

	@Override
	public String toString() {
		return "Cube [a=" + a + ", Area()=" + getArea() + ", Perimeter()=" + getPerimeter() + ", Volume()="
				+ getVolume() + ", LateralSurfaceArea()=" + getLateralSurfaceArea() + "]";
	}
	
	
	
	
	
}
