package HomeTest.car4.factorys;

import HomeTest.car4.enums.*;
import HomeTest.car4.transports.Car;
import HomeTest.car4.transports.ElectricCar;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ElectricCarFactory extends CarFactory {

    public ElectricCarFactory(Color[] colors, Model[] models, WheelSize[] wheelSizes, EngineVolume[] engineVolumes, Set<Option> options) {
        super(colors, models, wheelSizes, engineVolumes, options);
    }

    @Override
    public Car createCar(Model model, EngineVolume engineVolume, Color color, WheelSize wheelSize, Set<Option> options) {
        if (!Arrays.asList(models).contains(model)) {
            throw new IllegalArgumentException("Invalid model for this factory");
        }
        Car car = storage.getCarFromStorage(model, engineVolume, color, wheelSize, options);
        if (car != null) {
            if (car.getColor() != color) {
                car.setColor(color);
            }
            if (car.getWheelSize() != wheelSize) {
                car.setWheelSize(wheelSize);
            }
            if (car.getOptions() != options) {
                car.setOptions(options);
            }
            return car;
        }
        int batteryCapacity = 10;
        return new ElectricCar(YEAR, model, engineVolume, color, wheelSize, options, batteryCapacity);
    }

    @Override
    protected void fillStorageWithCars() {


        Car car = new ElectricCar(2023, Model.BMV, EngineVolume.HIGH, Color.BLACK, WheelSize.LARGE, options, 100);
        this.storage.addCarToStorage(car);
        Set<Option> options = new HashSet<>();
        options.add(Option.HEATED_SEATS);
        car = new Car(YEAR, Model.BMV, EngineVolume.LOW, Color.RED, WheelSize.SMALL, options);
        options.add(Option.HEATED_SEATS);
        options.add(Option.MAGNITOLA);
        this.storage.addCarToStorage(car);
    }

}
