package JavaOOP.midterm.task1;

abstract class Shape {
    private String color; 
    private Vector<String> shapes;
    
    public Shape(String color) { 
        this.color = color;
    }

    public double getArea() {
        return 0.0; 
    }

    public double getPerimeter(){
        return 0.0;
    }
}
