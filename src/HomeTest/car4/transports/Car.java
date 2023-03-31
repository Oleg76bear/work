package HomeTest.car4.transports;


import HomeTest.car4.enums.*;

import java.util.HashSet;
import java.util.Set;

import static java.lang.String.format;

public class Car {
    private static final String TO_STRING_TEMPLATE = "Car{year: %s, model: %s, engineVol: %s, color: %s, wheelSize: %s, options: %s}";

    private final int year;
    private final Model model;
    private final EngineVolume engineVolume;

    private Color color;
    private WheelSize wheelSize;
    private Set<Option> options;

    public Car(int year, Model model, EngineVolume engineVolume, Color color, WheelSize wheelSize, Set<Option> options) {
        this.year = year;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.wheelSize = wheelSize;
        this.options = options != null ? options : new HashSet<>();
    }

    public Model getModel() {
        return model;
    }

    public EngineVolume getEngineVolume() {
        return engineVolume;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public WheelSize getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(WheelSize wheelSize) {
        this.wheelSize = wheelSize;
    }

    public Set<Option> getOptions() {
        return options;
    }

//    public void setOptions(Set<Option> options) {
//        this.options = options;
//    }

    @Override
    public String toString() {
        return format(
                TO_STRING_TEMPLATE,
                year,
                model,
                engineVolume,
                color,
                wheelSize,
                options
        );
    }

    public void setOptions(Set<Option> options) {this.options = options;
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
//    } TODO Я головой помотал, но так и не смог в List убрать [[]], кроме как через регулярку.


