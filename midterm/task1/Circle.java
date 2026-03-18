package JavaOOP.midterm.task1;

public class Circle extends Shape {
    private int radius;

    public Circle(int Radius){
        super(null);
        this.radius = Radius;
    }

    @Override
    public double getArea() {
        return 2 * 3.14 * radius * radius;
    }
    
    @Override
    public double getPerimeter(){
        return 2 * 3.14 * radius;
    }
}