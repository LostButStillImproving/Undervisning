package ThreePointSix;

import java.util.Scanner;

/**
 *3.6
 (Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, to
 let the user enter weight, feet, and inches. For example, if a person is 5 feet and 10
 inches, you will enter 5 for feet and 10 for inches.
 */

public class ComputeAndInterpretiBMI {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            // Prompt the user to enter weight in pounds
            System.out.print("Enter weight in pounds: ");
            double weight = input.nextDouble();

            // Prompt the user to enter height in inches
            System.out.print("Enter feet: ");
            double feet = input.nextDouble();
            System.out.print("Enter inches: ");
            double inches = input.nextDouble();

            final double FEET_PER_INCH = 1.0/12.0; //constant
            final double FEET_PER_METER = 3.28084; //constant
            final double KILOGRAMS_PER_POUND = 0.45359237; // Constant


            // Compute BMI
            double weightInKilograms = weight * KILOGRAMS_PER_POUND;
            double inchesToMeters = (FEET_PER_INCH*inches)/FEET_PER_METER;
            double feetToMeters = feet/FEET_PER_METER;
            double heightInMeters = inchesToMeters+feetToMeters;
            double bmi = weightInKilograms / (heightInMeters * heightInMeters);
            // Display result
            System.out.println("BMI is " + bmi);
            if (bmi < 18.5)
                System.out.println("Underweight");
            else if (bmi < 25)
                System.out.println("Normal");
            else if (bmi < 30)
                System.out.println("Overweight");
            else
            System.out.println("Obese");
            }
}
