package HomeTest.car4.transports;

import HomeTest.car4.enums.CarOption;
import HomeTest.car4.enums.WheelSize;
import HomeTest.transport.Color;

import java.util.ArrayList;

    public  class SportCar extends Car {
        private int maxSpeed;
        private boolean hasRacingStripes;

        public SportCar(Color color, String model, int year, double engineVolume, WheelSize wheelSize, int maxSpeed, boolean hasRacingStripes) {
            super(color, model, year, engineVolume, wheelSize, new ArrayList<>());
            addOption(CarOption.CRUISE_CONTROL);
            this.maxSpeed = maxSpeed;
            this.hasRacingStripes = hasRacingStripes;
        }

        public void toggleRacingStripes() {
            hasRacingStripes = !hasRacingStripes;
        }

        public int getMaxSpeed() {
            return maxSpeed;
        }

        public void setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
        }

        public boolean hasRacingStripes() {
            return hasRacingStripes;
        }

        @Override
        public String toString() {
            String racingStripes = hasRacingStripes ? "with racing stripes" : "without racing stripes";
            return String.format("%s, Max speed: %dkm/h, %s", super.toString(), maxSpeed, racingStripes);
        }
    }


