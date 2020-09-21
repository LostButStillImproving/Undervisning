package ThreePointThirtyFive;

import java.util.Random;
import java.util.Scanner;

/**
 (Even or odd number) Write a program that prompts the user to enter an integer and
 displays whether the integer is an odd number or not. Here are the sample runs:
 */

public class EvenOrOddNumber {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scan.nextInt();
        int oddOrNot = number%2;
        switch (oddOrNot){
            case 1 -> System.out.println("The number is odd");
            case 0 -> System.out.println("The number is even");
        }
    }
}
