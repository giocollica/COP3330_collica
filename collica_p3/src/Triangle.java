/*
    Giovanni Collica
    Programming Assignment 3
    COP 3330

    This java class is for the Triangle constructor
 */

//this class is an extension of the Shape2D class
public class Triangle extends Shape2D {
    //instance variables
    private String name;
    private double base;
    private double height;

    //constructor
    public Triangle(double base, double height){
        this.name = "triangle";
        this.base = base;
        this.height = height;
    }

    //gets the name
    public String getName() {
        String name = this.name;
        return name;
    }

    //gets the length of the base
    public double getBase(){
        double base = this.base;
        return base;
    }

    //gets the length of the height
    public double getHeight(){
        double height = this.height;
        return height;
    }

    //calculates area and returns the value
    public double getArea() {
        double area;
        double base = getBase();
        double height = getHeight();
        area = (0.5) * (base * height);

        return area;
    }
}
