
package shcool.car;

import java.util.ArrayList;
import java.util.List;

public class Car {


    private final Color color;
    private final Model model;
    private final Year year;
    private final WheelSize wheelSize;
    private final EngineVolume engineVolume;
    private List<Option> options;
public enum Color{
    RED,
    BLUE,
    GREEN,
    BLACK,
    WHITE,
}
    public enum Model {
        AUDI,
        BMW,
        MERCEDES,
        TOYOTA,
        HONDA,
    }
public enum WheelSize {
    SIZE_15,
    SIZE_16,
    SIZE_17,
    SIZE_18,
    SIZE_19,
    SIZE_20,
}
    public enum EngineVolume {
        V4_1_6,
        V4_2_0,
        V6_3_0,
        V8_4_0,
    }
public enum Year {
    YEAR_2020,
    YEAR_2021,
    YEAR_2022,
}
    public enum Option {
        NAVIGATION,
        SUNROOF,
        LEATHER_SEATS,
        PARK_ASSIST,
    }

    public Car( Color color, Model model, Year year, WheelSize wheelSize, EngineVolume engineVolume) {
        this.color = color;
        this.model = model;
        this.year = year;
        this.wheelSize = wheelSize;
        this.engineVolume = engineVolume;
        this.options = new ArrayList<>();
    }

    public Color getColor() {
        return color;
    }

    public Color setColor(Color color) {
       return color;
    }

    public Model getModel() {
        return model;
    }

    public Year getYear() {
        return year;
    }

    public WheelSize getWheelSize() {
        return wheelSize;
    }

    public WheelSize setWheelSize(WheelSize wheelSize) {
        return wheelSize;
    }

    public EngineVolume getEngineVolume() {
        return engineVolume;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void addOption(Option option) {
        options.add(option);
    }

    public void removeOption(Option option) {
        options.remove(option);
    }

    public void printInfo() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Wheel Size: " + wheelSize);
        System.out.println("Engine Volume: " + engineVolume);
        System.out.print("Options: ");
        for (Option option : options) {
            System.out.print(option + ", ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Car{" +
                "model=" + model +
                ", year=" + year +
                ", engineVolume=" + engineVolume +
                ", color=" + color +
                ", wheelSize=" + wheelSize +
                '}';
    }
    public static void main(String[] args) {
        Car car = new Car(Color.BLUE, Car.Model.AUDI, Year.YEAR_2020, WheelSize.SIZE_15, Car.EngineVolume.V4_1_6);
        car.addOption(Car.Option.LEATHER_SEATS);
        car.addOption(Car.Option.NAVIGATION);
        car.printInfo();
        car.setWheelSize(WheelSize.SIZE_19);
        car.removeOption(Car.Option.NAVIGATION);
        car.printInfo();
    }
}