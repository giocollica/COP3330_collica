/*
    Giovanni Collica
    Programming Assignment 2
    COP 3330

    This java class is designed to be
    the test class. The purpose of this
    class is to test to make sure the
    methods are working as intended and
    returning the intended values.
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//main class
public class BodyMassIndexTest {

    //Test for getBmi() method
    @Test
    public void testGetBmi(){
        int height = 70;
        int weight = 160;
        BodyMassIndex bmi = new BodyMassIndex(height, weight);
        double answer = bmi.getBmi();

        assertEquals(22.955102040816328, answer);
    }

    //Test for calculateBmiNumber method
    @Test
    public void testCalculateBmiNumber(){
        int height = 70;
        int weight = 160;
        BodyMassIndex bmi = new BodyMassIndex(height, weight);
        double answer = bmi.calculateBmiNumber(height, weight);

        assertEquals(22.955102040816328, answer);
    }

    //Test for calculateBmiCategory to calculate Underweight category
    @Test
    public void testCalculateBmiCategoryUnder(){
        int height = 70;
        int weight = 120;
        BodyMassIndex bmi = new BodyMassIndex(height, weight);
        double bmiNumber = bmi.calculateBmiNumber(height, weight);
        String answer = bmi.calculateBmiCategory(bmiNumber);

        assertEquals("Underweight", answer);
    }

    //Test for calculateBmiCategory to calculate Normal Weight category
    @Test
    public void testCalculateBmiCategoryNormal(){
        int height = 70;
        int weight = 160;
        BodyMassIndex bmi = new BodyMassIndex(height, weight);
        double bmiNumber = bmi.calculateBmiNumber(height, weight);
        String answer = bmi.calculateBmiCategory(bmiNumber);

        assertEquals("Normal Weight", answer);
    }

    //Test for calculateBmiCategory to calculate Overweight category
    @Test
    public void testCalculateBmiCategoryOver(){
        int height = 70;
        int weight = 200;
        BodyMassIndex bmi = new BodyMassIndex(height, weight);
        double bmiNumber = bmi.calculateBmiNumber(height, weight);
        String answer = bmi.calculateBmiCategory(bmiNumber);

        assertEquals("Overweight", answer);
    }

    //Test for calculateBmiCategory to calculate Obese category
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
