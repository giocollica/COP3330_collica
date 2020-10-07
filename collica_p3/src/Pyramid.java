public class Pyramid extends Shape3D{
    private String name;
    private double length;
    private double height;
    private double width;

    public Pyramid(double length, double width, double height){
        this.name = "pyramid";
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public String getName(){
        String name = this.name;
        return name;
    }

    public double getLength(){
        double length = this.length;
        return length;
    }

    public double getWidth(){
        double width = this.width;
        return width;
    }

    public double getHeight(){
        double height = this.height;
        return height;
    }

    public double getArea() {
        return 0;
    }

    public double getVolume() {
        return 0;
    }
}
