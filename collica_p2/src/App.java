/*
    Giovanni Collica
    Programming Assignment 2
    COP 3330

    This java class is designed to be
    the main app class. It uses the
    BodyMassIndex class to calculate
    and display a users BMI and BMI
    Category by taking input from the
    user of their height and weight
 */

import java.util.ArrayList;
import java.util.Scanner;

//main app class
public class App {
    //main method
    public static void main(String[] args) {
        ArrayList<BodyMassIndex> bmiData = new ArrayList<BodyMassIndex>();

        while (moreInput()) {
            double height = getUserHeight();
            double weight = getUserWeight();

            BodyMassIndex bmi = new BodyMassIndex(height, weight);
            bmiData.add(bmi);

            displayBmiInfo(bmi);
        }

        displayBmiStatistics(bmiData);
    }

    //method to display the average bmi of all users
    private static void displayBmiStatistics(ArrayList<BodyMassIndex> bmiData) {
        double sum = 0;
        double average = 0;
        for(int i = 0; i < bmiData.size(); i++){
            sum += bmiData.get(i).getBmi();
        }

        average = sum / bmiData.size();

        System.out.printf("\n\nThe average BMI of all users was %.2f", average);

    }

    //method to display bmi info for each user
    private static void displayBmiInfo(BodyMassIndex bmi) {
        System.out.printf("BMI:     %.2f\n", bmi.getBmi());
        System.out.print("Category: " + bmi.getBmiCategory() + "\n\n");
    }

    //method to get the height of the user
    private static double getUserHeight() {
        double height = 0;
        while(height <= 0) {
            System.out.println("Enter your height in inches: ");
            Scanner input = new Scanner(System.in);
            height = input.nextDouble();
        }
        return height;
    }

    //method to get the weight of the user
    private static double getUserWeight() {
        double weight = 0;
        while(weight <= 0) {
            System.out.println("Enter your weight in pounds: ");
            Scanner input = new Scanner(System.in);
            weight = input.nextDouble();
        }
        return weight;
    }

    //method to read whether the user wants to calculate another BMI
    public static boolean moreInput(){
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("Do you want to calculate another BMI?");
            System.out.println("Enter Y for yes, or N for no: ");

            String yesOrNo = input.nextLine();

            if (yesOrNo.equals("Y") || yesOrNo.equals("y")) {
                return true;
            } else if (yesOrNo.equals("N") || yesOrNo.equals("n")) {
                return false;
            } else {
                System.out.println("Input not recognized");
            }
        }
    }

}
