public class Shape {
    private String name;
    private double sideLength;
    private double base;
    private double length;
    private double height;
    private double radius;
    private double width;

    public Square(double sideLength){
        this.name = "square";
        this.sideLength = sideLength;
    }

    public Triangle(double base, double height){
        this.name = "triangle";
        this.base = base;
        this.height = height;
    }

    public Circle(double radius){
        this.name = "Circle";
        this.radius = radius;
    }

    public Cube(double radius){
        this.name = "Cube";
        this.radius = radius;
    }

    public Pyramid(double length, double width, double height){
        this.name = "Pyramid";
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Sphere(double radius){
        this.name = "Sphere";
        this.radius = radius;
    }

    public String getName(){
        String name = this.name;
        return name;
    }

    public double getSideLength(){
        double sideLength = this.sideLength;
        return sideLength;
    }

    public double getBase(){
        double base = this.base;
        return base;
    }

    public double getLength(){
        double length = this.length;
        return length;
    }

    public double getHeight(){
        double height = this.height;
        return height;
    }

    public double getRadius(){
        double radius = this.radius;
        return radius;
    }

    public double getWidth(){
        double width = this.width;
        return width;
    }
}
