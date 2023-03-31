package HomeTest.car4.factorys;

import HomeTest.car4.enums.*;
import HomeTest.car4.transports.Car;
import HomeTest.car4.transports.Truck;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TruckFactory extends CarFactory {

    public TruckFactory(Color[] colors, Model[] models, WheelSize[] wheelSizes, EngineVolume[] engineVolumes, Set<Option> options) {
        super(colors, models, wheelSizes, engineVolumes, options);
    }

    @Override
    public Car createCar(Model model, EngineVolume engineVolume, Color color, WheelSize wheelSize, Set<Option> options) {
        if (!Arrays.asList(models).contains(model)) {
            throw new IllegalArgumentException("Invalid model for this factory");
        }
        Car car = storage.getCarFromStorage(model, engineVolume, color, wheelSize,options);
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
        int cargoCapacity = 4000;
        String transmissionType = "mechanic";

        return new Truck(YEAR, model, engineVolume, color, wheelSize, options, cargoCapacity, transmissionType);
    }

    @Override
    public void fillStorageWithCars() {
        Car car = new Truck(YEAR, Model.BMV, EngineVolume.HIGH, Color.BLACK, WheelSize.LARGE, options, 40000, "mechanic");
        this.storage.addCarToStorage(car);
        Set<Option> options = new HashSet<>();
        options.add(Option.SUNROOF);
        car.setOptions(options);
    }
}
