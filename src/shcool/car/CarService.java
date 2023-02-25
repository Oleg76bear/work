package shcool.car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

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

        List<Car> cars = new ArrayList<>();
         cars.add(new Car(Color.BLACK, Model.AUDI, WheelSize.SIZE_19, EngineVolume.V6_3_0));
        cars.add(new Car(Color.WHITE, Model.BMW, WheelSize.SIZE_18, EngineVolume.V6_3_0));
        cars.add(new Car(Color.RED, Model.MERCEDES, WheelSize.SIZE_19, EngineVolume.V8_4_0));


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
        Car car = new Car(Color.BLACK, Model.AUDI, WheelSize.SIZE_17, EngineVolume.V4_1_6);
        CarService carService = new CarService();
        carService.changeColor(car, Color.GREEN);
        carService.replaceWheels(car, WheelSize.SIZE_20);
        carService.addOption(car, Option.LEATHER_SEATS);
        carService.addOption(car, Option.NAVIGATION);
        carService.removeOption(car, Option.NAVIGATION);
        List<Option> options = new ArrayList<>();
        options.add(Option.LEATHER_SEATS);
        options.add(Option.PARK_ASSIST);
        carService.setOptions(car, options);
        car.printInfo();


        boolean isCarAvailable = carService.checkCarAvailability(Color.BLACK, Model.AUDI, WheelSize.SIZE_19, EngineVolume.V6_3_0);

        if (isCarAvailable) {
            System.out.println("Машина с заданными характеристиками есть на складе");
        } else {
            System.out.println("Машины с заданными характеристиками нет на складе");
        }
    }

}