package Problem1;

public class Cylinder extends Shape implements Volume, LateralSurfaceArea {
	final double PI = 3.14;
	int radius;
	int height;

	Cylinder(int radius, int height){
		this.radius=radius;
		this.height=height;
	}
	
	public double getLateralSurfaceArea() {
		return 2*PI*radius*height;
	}

	@Override
	public double getVolume() {
		double v = PI*radius*radius*height;
		return v;
	}

	@Override
	double getArea() {
		double s = 2*PI*radius*(height+radius);
		return s;
	}

	@Override
	public String toString() {
		return "Cylinder [LateralSurfaceArea()= " + getLateralSurfaceArea() + ", Volume()=" + getVolume() + ", Area()=" + getArea() + "]";
	}

}
