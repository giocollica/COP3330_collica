public class Sphere extends Shape3D{
    private String name;
    private double radius;

    public Sphere(double radius){
        this.name = "sphere";
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

    public double getVolume() {
        return 0;
    }
}
