package ThreePointSix;

public class method {

    static double calculateBMI (double weight, double feet, double inches) {
        final double FEET_PER_INCH = 1.0/12.0; //constant
        final double FEET_PER_METER = 3.28084; //constant
        final double KILOGRAMS_PER_POUND = 0.45359237; // Constant

        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double inchesToMeters = (FEET_PER_INCH*inches)/FEET_PER_METER;
        double feetToMeters = feet/FEET_PER_METER;
        double heightInMeters = inchesToMeters+feetToMeters;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);
        return bmi;
    }
    static String checkBMI(double bmi){
        // Display result
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }
}

