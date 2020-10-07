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
        double radius = getRadius();
        double area;
        area = (4) * Math.PI * (radius * radius);

        return area;
    }

    public double getVolume() {
        double radius = getRadius();
        double volume;
        volume = (1.333333333333333) * Math.PI * (radius * radius * radius);

        return volume;
    }
}
