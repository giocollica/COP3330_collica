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
}
