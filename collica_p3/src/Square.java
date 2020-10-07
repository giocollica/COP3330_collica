public class Square extends Shape2D {
    private String name;
    private double sideLength;

    public Square(double sideLength){
        this.name = "square";
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
}
