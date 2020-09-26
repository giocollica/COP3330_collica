import java.util.ArrayList;
import java.util.Scanner;

public class App {
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

    private static void displayBmiStatistics(ArrayList<BodyMassIndex> bmiData) {
        double sum = 0;
        double average = 0;
        for(int i = 0; i < bmiData.size(); i++){
            sum += bmiData.get(i).getBmi();
        }

        average = sum / bmiData.size();

        System.out.printf("\n\nThe average BMI of all users was %.2f", average);

    }



    private static void displayBmiInfo(BodyMassIndex bmi) {
        System.out.printf("BMI:     %.2f\n", bmi.getBmi());
        System.out.print("Category: " + bmi.calculateBmiCategory(bmi.getBmi()) + "\n\n");
    }

    private static double getUserHeight() {
        System.out.println("Enter your height in inches: ");
        Scanner input = new Scanner(System.in);
        double height = input.nextDouble();
        return height;
    }

    private static double getUserWeight() {
        System.out.println("Enter your weight in pounds: ");
        Scanner input = new Scanner(System.in);
        double weight = input.nextDouble();
        return weight;
    }


    public static boolean moreInput(){
        while(true) {
            System.out.println("Do you want to calculate another BMI?");
            System.out.println("Enter Y for yes, or N for no: ");
            Scanner input = new Scanner(System.in);
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
