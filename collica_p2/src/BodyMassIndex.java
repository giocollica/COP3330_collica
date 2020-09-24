public class BodyMassIndex {
    private double height;
    private double weight;
    private double bmi;
    private String bmiCategory;

    public BodyMassIndex(double height, double weight){
        this.height = height;
        this.weight = weight;
        this.bmi = calculateBmiNumber();
        this.bmiCategory = calculateBmiCategory();


    }


    public double calculateBmiNumber(){
        double bmi = ((703 * weight) / (height * height));
        return bmi;
    }

    public String calculateBmiCategory(){
        String bmiCategory = null;
        if(bmi < 18.5){
            bmiCategory = "Underweight";
        } else if(bmi >= 18.5 && bmi < 25){
            bmiCategory = "Normal weight";
        } else if(bmi >= 25 && bmi < 30){
            bmiCategory = "Overweight";
        } else {
            bmiCategory = "Obese";
        }
        return bmiCategory;
    }

}
