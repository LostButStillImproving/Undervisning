package classicswitch;

import cars.*;
import enumswitch.*;

public class CarCreator {
    public Car createCar(CarTypes carType) {
        switch (carType) {
            case TOYOTA:
                return new TOYOTA();
            case KIA:
                return new KIA();
            case MAZDA:
                return new MAZDA();
            default:
                throw new IllegalArgumentException("Invalid car type: " + carType);
        }
    }
}
