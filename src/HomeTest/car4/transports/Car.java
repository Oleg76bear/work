package HomeTest.car4.transports;

import HomeTest.car4.enums.CarOption;
import HomeTest.car4.enums.WheelSize;
import HomeTest.transport.Color;

import java.util.ArrayList;
import java.util.List;

    public class Car {
        private Color colorCar;
        private String model;
        private int year;
        private double engineVolume;
        private WheelSize wheelSize;
        private List<CarOption> options;


        public Car(Color colorCar, String model, int year, double engineVolume, WheelSize wheelSize, List<CarOption> options) {
            this.model = model;
            this.year = year;
            this.engineVolume = engineVolume;
            this.wheelSize = wheelSize;
            this.options = options != null ? options : new ArrayList<>();
            if (colorCar == null) {
                colorCar = Color.values()[0];
            }
            this.colorCar = colorCar;
        }

        public void changeColor(Color colorCar) {
            this.colorCar = colorCar;
        }

        public void changeWheelSize(WheelSize wheelSize) {
            this.wheelSize = wheelSize;
        }

        public void addOption(CarOption option) {
            this.options.add(option);
        }

        public void removeOption(CarOption option) {
            this.options.remove(option);
        }

        @Override
        public String toString() {
            String optionsStr = "";
            for (CarOption option : options) {
                optionsStr += option.toString() + ", ";
            }
            if (!options.isEmpty()) {
                optionsStr = optionsStr.substring(0, optionsStr.length() - 2);
            }
            return String.format("%s %s (%d), %.1fL, %s wheels, Options: %s",
                    colorCar.getColorCar(), model, year, engineVolume, wheelSize.name(), optionsStr);
        }

        public Color getColor() {
            return colorCar;
        }

        public void setColor(Color color) {
            this.colorCar = colorCar;
        }

    }

//
//        public String toString() {
//            String optionsString = "";
//            if (!options.isEmpty()) {
//                optionsString = Arrays.toString(new List[]{options}).replaceAll("\\[|\\]", "");
//            } else {
//                optionsString = "нет опций";
//            }
//            return String.format("%s %s (%d), %.1fL, %s wheels, Options: %s",
//                    colorCar, model, year, engineVolume, wheelSize, optionsString);
//        }
//    } TODO
//        public String toString() {
//            String optionsString = options == null ? "нет опций" : Arrays.toString(new List[]{options});
//            return String.format("%s %s (%d), %.1fл, %s, %s", colorCar, model, year, engineVolume, wheelSize, optionsString);
//        }
//    } TODO я головой помотал, но так и не смог в List убрать [[]], кроме как через регул€рку.


