public class Shape2D extends Shape {
    public double getArea(){
        String shape = getName();
        if(shape == "square"){
            double area;
            double sideLength = getSideLength();
            area = sideLength * sideLength;

            return area;
        } else if(shape == "triangle"){
            double area;
            double base = getBase();
            double height = getHeight();
            area = (1/2) * (base * height);

            return area;
        } else if(shape == "circle"){
            double area;
            double radius = getRadius();
            area = Math.PI * (radius * radius);

            return area;
        } else {
            return 0;
        }
    }

}
