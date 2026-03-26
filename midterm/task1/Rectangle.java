package JavaOOP.midterm.task1;

public class Rectangle extends Shape{
    private int a;
    private int b;

    public Rectangle(int a, int b){
        super(null);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a*b;
    }
    
    @Override
    public double getPerimeter(){
        return a+a+b+b;
    }
    
}
