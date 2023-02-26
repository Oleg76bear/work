
package shcool.car;

import java.util.ArrayList;
import java.util.List;

public class Car {


    private final Color color;
    private final Model model;
    private   String year;
    private final WheelSize wheelSize;
    private final EngineVolume engineVolume;
    private List<Option> options;


    public Car(Color color, Model model,  WheelSize wheelSize, EngineVolume engineVolume) {
        this.color = color;
        this.model = model;

        this.wheelSize = wheelSize;
        this.engineVolume = engineVolume;
        this.options = new ArrayList<>();
    }



    public Car(Color color, Model model, String year, WheelSize wheelSize, EngineVolume engineVolume) {
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

    public String getYear() {
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
    public EngineVolume setEngineVolume(EngineVolume engineVolume) {
        return engineVolume;
    }
    public List<Option> getOptions() {
        return options;
    }

    public void addOption(Option option) {
        options.add(option);
    }
    public class Wheel {
        private final WheelSize size;
        private Color color;

        public Wheel(WheelSize size, Color color) {
            this.size = size;
            this.color = color;
        }

        public WheelSize getSize() {
            return size;
        }

        public Color getColor() {
            return color;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        public void paint(Color color) {
            this.color = color;
        }
    }
    public void removeOption(Option option) {
        options.remove(option);
    }

    public void printInfo() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
      //  System.out.println("Year: " + year);
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
        //  ", year=" + year +
                ", engineVolume=" + engineVolume +
                ", color=" + color +
                ", wheelSize=" + wheelSize +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Car)) {
            return false;
        }
        Car other = (Car) obj;
        return this.color == other.color &&
                this.model == other.model &&
                this.wheelSize == other.wheelSize &&
                this.engineVolume == other.engineVolume &&
                this.options.equals(other.options);
    }
    public static void main(String[] args) {
        Car car = new Car(Color.BLUE, Model.AUDI,"2022", WheelSize.SIZE_15, EngineVolume.V4_1_6);
        car.addOption(Option.LEATHER_SEATS);
        car.addOption(Option.NAVIGATION);
        car.printInfo();
        car.setWheelSize(WheelSize.SIZE_19);
        car.removeOption(Option.NAVIGATION);
        car.printInfo();
    }
}