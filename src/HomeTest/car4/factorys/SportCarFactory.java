package HomeTest.car4.factorys;

import HomeTest.car4.enums.*;
import HomeTest.car4.transports.Car;
import HomeTest.car4.transports.SportCar;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SportCarFactory extends CarFactory {

    public SportCarFactory(Color[] colors, Model[] models, WheelSize[] wheelSizes, EngineVolume[] engineVolumes, Set<Option> options) {
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

        int maxSpeed = 200;
        boolean hasRacingStripes = false;
        return new SportCar(YEAR, model, engineVolume, color, wheelSize, options, maxSpeed, hasRacingStripes);
    }

    @Override
    protected void fillStorageWithCars() {
        Car car = new SportCar(YEAR, Model.MERCEDES, EngineVolume.HIGH, Color.RED, WheelSize.SMALL, options, 300, true);
        this.storage.addCarToStorage(car);
        Set<Option> options = new HashSet<>();
        options.add(Option.SUNROOF);
        car.setOptions(options);
    }
}
