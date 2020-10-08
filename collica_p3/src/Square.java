/*
    Giovanni Collica
    Programming Assignment 3
    COP 3330

    This java class is for the Square constructor
 */

//this class is an extension of the Shape2D class
public class Square extends Shape2D {
    //instance variables
    private String name;
    private double sideLength;

    //constructor
    public Square(double sideLength){
        this.name = "square";
        this.sideLength = sideLength;
    }

    //gets the name
    public String getName(){
        String name = this.name;
        return name;
    }

    //gets the side
    public double getSideLength(){
        double sideLength = this.sideLength;
        return sideLength;
    }

    //calculates the area and returns the value
    public double getArea() {
        double area;
        double sideLength = getSideLength();
        area = sideLength * sideLength;

        return area;
    }
}
