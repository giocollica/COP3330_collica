public class BodyMassIndex {
    private double height;
    private double weight;

    public BodyMassIndex(double height, double weight){
        this.height = height;
        this.weight = weight;


    }


    public double calculateBmiNumber(double height, double weight){
        double bmi = ((703 * weight) / (height * height));
        return bmi;
    }

    public void calculateBmiCategory(){

    }

}
