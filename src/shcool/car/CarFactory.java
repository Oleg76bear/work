package shcool.car;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarFactory {

 //   private final List<String> years;
    private List<Model> models;
    private List<EngineVolume> engineVolumes;
    private List<Color> colors;
    private List<WheelSize> wheelSizes;

    private List<Car> inventory;

    public CarFactory(List<Model> models, List<EngineVolume> engineVolumes, List<Color> colors, List<WheelSize> wheelSizes) {
        this.models = models;
      //  this.years = year;
        this.engineVolumes = engineVolumes;
        this.colors = colors;
        this.wheelSizes = wheelSizes;
        this.inventory = new ArrayList<>();
        produceCars(10);
    }

    private void produceCars(int amount) {
        for (int i = 0; i < amount; i++) {
            Model model = models.get(i % models.size());
            EngineVolume engineVolume = engineVolumes.get(i % engineVolumes.size());
            Color color = colors.get(i % colors.size());
            WheelSize wheelSize = wheelSizes.get(i % wheelSizes.size());
            inventory.add(new Car(color, model, wheelSize, engineVolume));
        }
    }

    public void printModels() {
        System.out.println("Possible models:");
        for (Model model : models) {
            System.out.println("- " + model);
        }
    }
    public void printEngineVolumes() {
        System.out.println("Possible engine volumes:");
        for (EngineVolume volume : engineVolumes) {
            System.out.println("- " + volume);
        }
    }

    public void printColors() {
        System.out.println("Possible colors:");
        for (Color color : colors) {
            System.out.println("- " + color);
        }
    }

    public void printWheelSizes() {
        System.out.println("Possible wheel sizes:");
        for (WheelSize size : wheelSizes) {
            System.out.println("- " + size);
        }
    }

    public Car createCar(Model model, EngineVolume engineVolume, Color color, WheelSize wheelSize) {
        Car car = null;
        for (Car c : inventory) {
            if (c.getModel().equals(model) && c.getEngineVolume() == engineVolume &&
                    c.getColor().equals(color) && c.getWheelSize() == wheelSize ) {
                car = c;
                inventory.remove(c);
                break;
            }
        }
        if (car == null) {
            car = new Car(color, model, wheelSize, engineVolume);
        }
        return car;
    }



    public static void main(String[] args) {
        CarFactory factory = new CarFactory(
                new ArrayList<>(Arrays.asList(Model.TOYOTA, Model.AUDI, Model.HONDA)),
               // new ArrayList<>(Arrays.asList(Year.YEAR_2021,Year.YEAR_2020, Year.YEAR_2022)),
                new ArrayList<>(Arrays.asList(EngineVolume.V4_1_6, EngineVolume.V6_3_0, EngineVolume.V8_4_0)),
                new ArrayList<>(Arrays.asList(Color.BLUE, Color.RED, Color.BLACK)),
                new ArrayList<>(Arrays.asList(WheelSize.SIZE_16, WheelSize.SIZE_18, WheelSize.SIZE_19))
        );

        factory.printModels();
        factory.printEngineVolumes();
        factory.printColors();
        factory.printWheelSizes();
      //  factory.printYears();

        Car car1 = factory.createCar(Model.AUDI, EngineVolume.V6_3_0,  Color.BLACK, WheelSize.SIZE_19);
        Car car2 = factory.createCar(Model.TOYOTA, EngineVolume.V6_3_0, Color.BLACK, WheelSize.SIZE_19);
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
