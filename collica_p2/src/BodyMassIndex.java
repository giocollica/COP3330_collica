/*
    Giovanni Collica
    Programming Assignment 2
    COP 3330

    This java class is designed to be
    the BMI class. It's purpose is to
    contain the constructor for
    BodyMassIndex and include the methods
    for calculating the BMI number and
    the category the BMI number would
    fall under
 */

//main class
public class BodyMassIndex {
    //instance variable
    private double bmi;
    private String bmiCategory;

    //constructor
    public BodyMassIndex(double height, double weight){
        this.bmi = calculateBmiNumber(height, weight);
        this.bmiCategory = calculateBmiCategory(bmi);
    }

    //calculate the BMI
    public double calculateBmiNumber(double height, double weight){
        return ((703 * weight) / (height * height));
    }

    //sets the bmi category based on the bmi of the user
    public String calculateBmiCategory(double bmi){
        String bmiCategory = null;
        if(bmi < 18.5){
            bmiCategory = "Underweight";
        } else if(bmi >= 18.5 && bmi < 25){
            bmiCategory = "Normal Weight";
        } else if(bmi >= 25 && bmi < 30){
            bmiCategory = "Overweight";
        } else {
            bmiCategory = "Obese";
        }
        return bmiCategory;
    }

    //method to get the bmi for each instance
    public double getBmi(){
        double bmi = this.bmi;
        return bmi;
    }

    public String getBmiCategory(){
        String bmiCategory = this.bmiCategory;
        return bmiCategory;
    }

}
