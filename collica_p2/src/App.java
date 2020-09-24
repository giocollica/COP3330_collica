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
    }

    private static void displayBmiInfo(BodyMassIndex bmi) {
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
        System.out.println("Do you want to calculate another BMI?");
        System.out.println("Enter Y for yes, or N for no: ");
        Scanner input = new Scanner(System.in);
        String yesOrNo = input.nextLine();
        if(yesOrNo.equals("Y")) {
            return true;
        } else if(yesOrNo.equals("N")) {
            return false;
        } else {
            System.out.println("Input not recognized");
            return false;
        }
    }



}
