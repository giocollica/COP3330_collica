import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BodyMassIndexTest {

    @Test
    public void testGetBmi(){
        int height = 70;
        int weight = 160;
        BodyMassIndex bmi = new BodyMassIndex(height, weight);
        double answer = bmi.getBmi();

        assertEquals(22.955102040816328, answer);
    }

    @Test
    public void testCalculateBmiNumber(){
        int height = 70;
        int weight = 160;
        BodyMassIndex bmi = new BodyMassIndex(height, weight);
        double answer = bmi.calculateBmiNumber(height, weight);

        assertEquals(22.955102040816328, answer);
    }

    @Test
    public void testCalculateBmiCategoryUnder(){
        int height = 70;
        int weight = 120;
        BodyMassIndex bmi = new BodyMassIndex(height, weight);
        double bmiNumber = bmi.calculateBmiNumber(height, weight);
        String answer = bmi.calculateBmiCategory(bmiNumber);

        assertEquals("Underweight", answer);
    }

    @Test
    public void testCalculateBmiCategoryNormal(){
        int height = 70;
        int weight = 160;
        BodyMassIndex bmi = new BodyMassIndex(height, weight);
        double bmiNumber = bmi.calculateBmiNumber(height, weight);
        String answer = bmi.calculateBmiCategory(bmiNumber);

        assertEquals("Normal Weight", answer);
    }

    @Test
    public void testCalculateBmiCategoryOver(){
        int height = 70;
        int weight = 200;
        BodyMassIndex bmi = new BodyMassIndex(height, weight);
        double bmiNumber = bmi.calculateBmiNumber(height, weight);
        String answer = bmi.calculateBmiCategory(bmiNumber);

        assertEquals("Overweight", answer);
    }

    @Test
    public void testCalculateBmiCategoryObese(){
        int height = 70;
        int weight = 230;
        BodyMassIndex bmi = new BodyMassIndex(height, weight);
        double bmiNumber = bmi.calculateBmiNumber(height, weight);
        String answer = bmi.calculateBmiCategory(bmiNumber);

        assertEquals("Obese", answer);
    }

}
