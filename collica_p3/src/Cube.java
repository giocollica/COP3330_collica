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
        double sideLength = getSideLength();
        double area;
        area = 6 * (sideLength * sideLength);

        return area;
    }

    public double getVolume() {
        double sideLength = getSideLength();
        double volume;
        volume = (sideLength * sideLength * sideLength);

        return volume;
    }
}
