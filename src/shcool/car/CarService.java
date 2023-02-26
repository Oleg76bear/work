package shcool.car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarService {
    private List<Car> cars; // изменен тип поля на List<Car>
    private static final Model[] models = Model.values();
    public CarService(CarFactory factory, int amount) {
        this.cars = factory.createCars(amount);
    }

    public CarService(List<Car> cars) {
        this.cars = cars;
    }

    public void createCars(int amount) {
        CarFactory factory = new CarFactory();
        for (int i = 0; i < amount; i++) {
            Model model = getRandomModel(factory);
            EngineVolume engineVolume = getRandomEngineVolume(factory);
            Color color = getRandomColor(factory);
            WheelSize wheelSize = getRandomWheelSize(factory);
            cars.add(factory.createCar(model, engineVolume, color, wheelSize));
        }
    }

    private Model getRandomModel(CarFactory factory) {
        List<Model> models = factory.getModels();
        int index = (int) (Math.random() * models.size());
        return models.get(index);
    }

    private EngineVolume getRandomEngineVolume(CarFactory factory) {
        List<EngineVolume> engineVolumes = factory.getEngineVolumes();
        int index = (int) (Math.random() * engineVolumes.size());
        return engineVolumes.get(index);
    }

    private Color getRandomColor(CarFactory factory) {
        List<Color> colors = factory.getColors();
        int index = (int) (Math.random() * colors.size());
        return colors.get(index);
    }

    private WheelSize getRandomWheelSize(CarFactory factory) {
        List<WheelSize> wheelSizes = factory.getWheelSizes();
        int index = (int) (Math.random() * wheelSizes.size());
        return wheelSizes.get(index);
    }

    public void changeColor(Car car, Color newColor) {
        car.setColor(newColor);
    }

    public void replaceWheels(Car car, WheelSize newWheelSize) {
        car.setWheelSize(newWheelSize);
    }

    public void addOption(Car car, Option option) {
        car.addOption(option);
    }

    public void removeOption(Car car, Option option) {
        car.removeOption(option);
    }

    public void setOptions(Car car, List<Option> options) {
        car.getOptions().clear();
        car.getOptions().addAll(options);
    }

    public boolean checkCarAvailability(Color color, Model model, WheelSize wheelSize, EngineVolume engineVolume) {
        for (Car car : cars) {
            if (car.getColor() == color &&
                    car.getModel() == model &&
                    car.getWheelSize() == wheelSize &&
                    car.getEngineVolume() == engineVolume) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        CarService carService = new CarService(cars);
        carService.createCars(10);
       List<Model> models = Arrays.asList(Model.HONDA,Model.AUDI, Model.BMW, Model.TOYOTA, Model.MERCEDES);
        Car car = new Car(Color.BLACK, Model.AUDI, WheelSize.SIZE_17, EngineVolume.V4_1_6);
        Car car1 = new Car(Color.BLUE, Model.HONDA, WheelSize.SIZE_19, EngineVolume.V4_1_6);
        Car car2 = new Car(Color.RED, Model.BMW, WheelSize.SIZE_15, EngineVolume.V8_4_0);
        Car car3 = new Car(Color.WHITE, Model.AUDI, WheelSize.SIZE_18, EngineVolume.V6_3_0);

        carService.changeColor(car, Color.GREEN);
        carService.replaceWheels(car, WheelSize.SIZE_20);
        carService.addOption(car, Option.LEATHER_SEATS);
        carService.addOption(car, Option.NAVIGATION);
        System.out.println(car1);

    }
}