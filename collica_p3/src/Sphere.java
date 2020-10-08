/*
    Giovanni Collica
    Programming Assignment 3
    COP 3330

    This java class is for the Sphere constructor
 */

//extends the Shape3D class
public class Sphere extends Shape3D{
    //instance variables
    private String name;
    private double radius;

    //constructor
    public Sphere(double radius){
        this.name = "sphere";
        this.radius = radius;
    }

    //gets the name
    public String getName(){
        String name = this.name;
        return name;
    }

    //gets the radius
    public double getRadius(){
        double radius = this.radius;
        return radius;
    }

    //calculates the area and returns the value
    public double getArea() {
        double radius = getRadius();
        double area;
        area = (4) * Math.PI * (radius * radius);

        return area;
    }

    //calculates the volume and returns the value
    public double getVolume() {
        double radius = getRadius();
        double volume;
        volume = (1.333333333333333) * Math.PI * (radius * radius * radius);

        return volume;
    }
}
