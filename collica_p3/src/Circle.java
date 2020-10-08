/*
    Giovanni Collica
    Programming Assignment 3
    COP 3330

    This java class is for the Circle constructor
*/

//this class is an extension of the Shape2D class
public class Circle extends Shape2D{
    //instance variable
    private String name;
    private double radius;

    //constructor
    public Circle(double radius){
        this.name = "circle";
        this.radius = radius;
    }

    //gets the name
    @Override
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
    @Override
    public double getArea() {
        double area;
        double radius = getRadius();
        area = Math.PI * (radius * radius);

        return area;
    }
}
