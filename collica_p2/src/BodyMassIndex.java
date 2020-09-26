public class BodyMassIndex {

    private double bmi;


    public BodyMassIndex(double height, double weight){
        this.bmi = calculateBmiNumber(height, weight);
    }


    public double calculateBmiNumber(double height, double weight){
        return ((703 * weight) / (height * height));
    }

    public String calculateBmiCategory(double bmi){
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

    public double getBmi(){
        double bmi = this.bmi;
        return bmi;
    }



}
