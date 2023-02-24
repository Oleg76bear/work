package shcool.car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    public void changeColor(Car car, Car.Color newColor) {
        car.setColor(newColor);
    }

    public void replaceWheels(Car car, Car.WheelSize newWheelSize) {
        car.setWheelSize(newWheelSize);
    }

    public void addOption(Car car, Car.Option option) {
        car.addOption(option);
    }

    public void removeOption(Car car, Car.Option option) {
        car.removeOption(option);
    }

    public void setOptions(Car car, List<Car.Option> options) {
        car.getOptions().clear();
        car.getOptions().addAll(options);
    }


    public static void main(String[] args) {
        Car car = new Car(Car.Color.BLACK, Car.Model.AUDI, Car.Year.YEAR_2022, Car.WheelSize.SIZE_17, Car.EngineVolume.V4_1_6);
        CarService carService = new CarService();
        carService.changeColor(car, Car.Color.GREEN);
        carService.replaceWheels(car, Car.WheelSize.SIZE_20);
        carService.addOption(car, Car.Option.LEATHER_SEATS);
        carService.addOption(car, Car.Option.NAVIGATION);
        carService.removeOption(car, Car.Option.NAVIGATION);
        List<Car.Option> options = new ArrayList<>();
        options.add(Car.Option.LEATHER_SEATS);
        options.add(Car.Option.PARK_ASSIST);
        carService.setOptions(car, options);
        car.printInfo();
    }
}
