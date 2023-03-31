package HomeTest.car4.transports;


import HomeTest.car4.enums.*;

import java.util.HashSet;
import java.util.Set;

public  class SportCar extends Car {
        private int maxSpeed;
        private boolean hasRacingStripes;

        public SportCar(int year, Model model, EngineVolume engineVolume, Color color, WheelSize wheelSize, Set<Option> options, int maxSpeed, boolean hasRacingStripes) {
            super(year, model, engineVolume, color, wheelSize, new HashSet<>());
          //  addOption(CarOption.CRUISE_CONTROL);
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


