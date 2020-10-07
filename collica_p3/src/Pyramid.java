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
        double length = getLength();
        double width = getWidth();
        double height = getHeight();
        double area;
        area = (length * width) + (length * Math.sqrt(Math.pow(width / 2, 2) +
                Math.pow(height, 2))) + (width * Math.sqrt(Math.pow(length / 2, 2) + Math.pow(height, 2)));

        return area;
    }

    public double getVolume() {
        double length = getLength();
        double width = getWidth();
        double height = getHeight();
        double volume;
        volume = (length * width * height) / 3;

        return volume;
    }
}
