package ThreePointSix;

import java.util.Scanner;

import static ThreePointSix.method.calculateBMI;

/**
 *3.6
 (Health application: BMI) Revise Listing 3.4, UI.java, to
 let the user enter weight, feet, and inches. For example, if a person is 5 feet and 10
 inches, you will enter 5 for feet and 10 for inches.
 */

public class UI {
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

            // Compute BMI
            double bmi = calculateBMI(weight, feet, inches);
            System.out.println("BMI is " + bmi);
            //Check BMI
            String result = method.checkBMI(bmi);

    }
}

