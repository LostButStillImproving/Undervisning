package enumswitch;

import cars.*;

public enum CarTypes {

    TOYOTA {
        @Override
        public Car createCar() {
            return new TOYOTA();
        }
    },
    MAZDA {
        @Override
        public Car createCar() {
            return new MAZDA();
        }
    },
    KIA {
        @Override
        public Car createCar() {
            return new KIA();
        }
    };

    public abstract Car createCar();
}
