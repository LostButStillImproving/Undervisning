package main;
import classicswitch.CarCreator;
import cars.Car;
import enumswitch.CarTypes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to build a car?[Y/N]");
        String input = scan.nextLine().toUpperCase();

        if (input.equals("Y")){
            CarCreator carCreator = new CarCreator();
            System.out.println("What kind of car do you want? [KIA/TOYOTA/MAZDA]");
            String carBrand = scan.nextLine().toUpperCase();
            Car car;

            switch (carBrand) {
                case "KIA" -> {car = carCreator.createCar(CarTypes.KIA);}
                case "TOYOTA" -> {car = carCreator.createCar(CarTypes.TOYOTA);}
                case "MAZDA" -> {car = carCreator.createCar(CarTypes.MAZDA);}
                default -> throw new IllegalArgumentException("This ain't no kind of car I can make: " + carBrand);
            }

            System.out.print("I made a " + car.getClass().getSimpleName() + " " + car.getName() +
                    " for ya, and this is what it sounds like: ");
            car.dyt();

        } else System.out.println("Alright, goodbye!");

    }
}
