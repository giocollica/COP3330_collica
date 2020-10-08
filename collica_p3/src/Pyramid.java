/*
    Giovanni Collica
    Programming Assignment 3
    COP 3330

    This java class is for the Pyramid constructor
 */

//extends the Shape3D class
public class Pyramid extends Shape3D{
    //instance variables
    private String name;
    private double length;
    private double height;
    private double width;

    //constructor
    public Pyramid(double length, double width, double height){
        this.name = "pyramid";
        this.length = length;
        this.width = width;
        this.height = height;
    }

    //gets the name
    public String getName(){
        String name = this.name;
        return name;
    }

    //gets the length
    public double getLength(){
        double length = this.length;
        return length;
    }

    //gets the width
    public double getWidth(){
        double width = this.width;
        return width;
    }

    //gets the height
    public double getHeight(){
        double height = this.height;
        return height;
    }

    //calculates the area and returns the value
    public double getArea() {
        double length = getLength();
        double width = getWidth();
        double height = getHeight();
        double area;
        area = (length * width) + (length * Math.sqrt(Math.pow(width / 2, 2) +
                Math.pow(height, 2))) + (width * Math.sqrt(Math.pow(length / 2, 2) + Math.pow(height, 2)));

        return area;
    }

    //calculates the volume and returns the value
    public double getVolume() {
        double length = getLength();
        double width = getWidth();
        double height = getHeight();
        double volume;
        volume = (length * width * height) / 3;

        return volume;
    }
}
