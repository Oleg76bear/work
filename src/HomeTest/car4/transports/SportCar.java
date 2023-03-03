package HomeTest.car4.transports;

import HomeTest.car4.enums.CarOption;
import HomeTest.car4.enums.WheelSize;
import HomeTest.transport.Color;

import java.util.ArrayList;

public class SportCar extends Transport.Car {

        private int maxSpeed;

        public SportCar(Color colorCar, String model, int year, double engineVolume, WheelSize wheelSize, int maxSpeed) {
            super(colorCar, model, year, engineVolume, wheelSize, new ArrayList<>());
            addOption(CarOption.CRUISE_CONTROL);
            this.maxSpeed = maxSpeed;
        }

        @Override
        public String toString() {
            return String.format("%s, Max speed: %dkm/h", super.toString(), maxSpeed);
        }
    }


