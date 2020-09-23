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

    public static boolean moreInput(){
        System.out.println("Do you want to calculate another BMi?");
        Scanner yesOrNo = S
    }

    public double getUserHeight(){

    }

    public double getUserHeight(){

    }

    public static void displayBmiInfo(){

    }

    public static void displayBmiStatistics(){

    }

}
