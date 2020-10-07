public class Cube extends Shape3D{
    private String name;
    private double sideLength;

    public Cube(double sideLength){
        this.name = "cube";
        this.sideLength = sideLength;
    }

    public String getName(){
        String name = this.name;
        return name;
    }

    public double getSideLength(){
        double sideLength = this.sideLength;
        return sideLength;
    }

    public double getArea() {
        return 0;
    }

    public double getVolume() {
        return 0;
    }
}
