public class Circle extends Shape2D{
    private String name;
    private double radius;

    public Circle(double radius){
        this.name = "circle";
        this.radius = radius;
    }

    public String getName(){
        String name = this.name;
        return name;
    }

    public double getRadius(){
        double radius = this.radius;
        return radius;
    }

    public double getArea() {
        return 0;
    }
}
