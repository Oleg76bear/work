package shcool.car;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarFactory {

    private final List<Car.Year> years;
    private List<Car.Model> models;
    private List<Car.EngineVolume> engineVolumes;
    private List<Car.Color> colors;
    private List<Car.WheelSize> wheelSizes;

    private List<Car> inventory;

    public CarFactory(List<Car.Model> models, List<Car.Year>  year, List<Car.EngineVolume> engineVolumes, List<Car.Color> colors, List<Car.WheelSize> wheelSizes) {
        this.models = models;
        this.years = year;
        this.engineVolumes = engineVolumes;
        this.colors = colors;
        this.wheelSizes = wheelSizes;
        this.inventory = new ArrayList<>();
        produceCars(10);
    }

    private void produceCars(int amount) {
        for (int i = 0; i < amount; i++) {
            Car.Model model = models.get((int) (Math.random() * models.size()));
            Car.EngineVolume engineVolume = engineVolumes.get((int) (Math.random() * engineVolumes.size()));
            Car.Color color = colors.get((int) (Math.random() * colors.size()));
            Car.Year year = years.get((int) (Math.random() * colors.size()));
            Car.WheelSize wheelSize = wheelSizes.get((int) (Math.random() * wheelSizes.size()));
            inventory.add(new Car(color, model,  year,  wheelSize, engineVolume));
        }
    }

    public void printYears() {
        System.out.println("Possible year:");
        for (Car.Year year : years) {
            System.out.println("- " + year);
        }
    }
    public void printModels() {
        System.out.println("Possible models:");
        for (Car.Model model : models) {
            System.out.println("- " + model);
        }
    }
    public void printEngineVolumes() {
        System.out.println("Possible engine volumes:");
        for (Car.EngineVolume volume : engineVolumes) {
            System.out.println("- " + volume);
        }
    }

    public void printColors() {
        System.out.println("Possible colors:");
        for (Car.Color color : colors) {
            System.out.println("- " + color);
        }
    }

    public void printWheelSizes() {
        System.out.println("Possible wheel sizes:");
        for (Car.WheelSize size : wheelSizes) {
            System.out.println("- " + size);
        }
    }

    public Car createCar(Car.Model model, Car.EngineVolume engineVolume, Car.Year year, Car.Color color, Car.WheelSize wheelSize) {
        Car car = null;
        for (Car c : inventory) {
            if (c.getModel().equals(model) && c.getEngineVolume() == engineVolume &&
                    c.getColor().equals(color) && c.getWheelSize() == wheelSize  && c.getYear() == year) {
                car = c;
                inventory.remove(c);
                break;
            }
        }
        if (car == null) {
            car = new Car(color, model,  year,  wheelSize, engineVolume);
        }
        return car;
    }



    public static void main(String[] args) {
        CarFactory factory = new CarFactory(
                new ArrayList<>(Arrays.asList(Car.Model.TOYOTA, Car.Model.AUDI, Car.Model.HONDA)),
                new ArrayList<>(Arrays.asList(Car.Year.YEAR_2021,Car.Year.YEAR_2020, Car.Year.YEAR_2022)),
                new ArrayList<>(Arrays.asList(Car.EngineVolume.V4_1_6, Car.EngineVolume.V6_3_0, Car.EngineVolume.V8_4_0)),
                new ArrayList<>(Arrays.asList(Car.Color.BLUE, Car.Color.RED, Car.Color.BLACK)),
                new ArrayList<>(Arrays.asList(Car.WheelSize.SIZE_16, Car.WheelSize.SIZE_18, Car.WheelSize.SIZE_19))
        );

        factory.printModels();
        factory.printEngineVolumes();
        factory.printColors();
        factory.printWheelSizes();
        factory.printYears();

        Car car1 = factory.createCar(Car.Model.AUDI, Car.EngineVolume.V6_3_0, Car.Year.YEAR_2022, Car.Color.BLACK, Car.WheelSize.SIZE_19);
        Car car2 = factory.createCar(Car.Model.TOYOTA, Car.EngineVolume.V6_3_0, Car.Year.YEAR_2022, Car.Color.BLACK, Car.WheelSize.SIZE_19);
        Car car5 = factory.inventory.get(2);
        Car car3 = (Car) factory.inventory.get(1);
        Car car4 = (Car) factory.inventory.remove(0);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}

