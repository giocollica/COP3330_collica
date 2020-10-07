public class Triangle extends Shape2D {
    private String name;
    private double base;
    private double height;

    public Triangle(double base, double height){
        this.name = "triangle";
        this.base = base;
        this.height = height;
    }

    public String getName() {
        String name = this.name;
        return name;
    }

    public double getBase(){
        double base = this.base;
        return base;
    }

    public double getHeight(){
        double height = this.height;
        return height;
    }

    public double getArea() {
        double area;
        double base = getBase();
        double height = getHeight();
        area = (0.5) * (base * height);

        return area;
    }
}
