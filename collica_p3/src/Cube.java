/*
    Giovanni Collica
    Programming Assignment 3
    COP 3330

    This java class is for the Cube constructor
 */

//extends the Shape3D class
public class Cube extends Shape3D{
    //instance variables
    private String name;
    private double sideLength;

    //constructor
    public Cube(double sideLength){
        this.name = "cube";
        this.sideLength = sideLength;
    }

    //gets the name
    public String getName(){
        String name = this.name;
        return name;
    }

    //gets the side length
    public double getSideLength(){
        double sideLength = this.sideLength;
        return sideLength;
    }

    //calculates the area and returns the value
    public double getArea() {
        double sideLength = getSideLength();
        double area;
        area = 6 * (sideLength * sideLength);

        return area;
    }

    //calculates the volume and returns the value
    public double getVolume() {
        double sideLength = getSideLength();
        double volume;
        volume = (sideLength * sideLength * sideLength);

        return volume;
    }
}
