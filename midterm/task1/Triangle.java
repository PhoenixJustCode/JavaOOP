package JavaOOP.midterm.task1;

public class Triangle extends Shape {
    private int a; 

    public Triangle(int a) { 
        this.a  = a;
    }

    @Override
    public double getArea() {
        return 0.0; 
    }
    
    @Override
    public double getPerimeter(){
        return a*3;
    }

}
