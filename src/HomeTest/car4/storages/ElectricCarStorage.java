package HomeTest.car4.storages;

import HomeTest.car4.enums.*;
import HomeTest.car4.transports.Car;
import HomeTest.car4.transports.ElectricCar;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ElectricCarStorage {
    private static final List<ElectricCar> cars = new ArrayList<>();

    public static void addCarToStorage(ElectricCar car) {
        cars.add(car);
    }

    public static ElectricCar getCarFromStorage(Model model, EngineVolume engineVolume, Color color, WheelSize wheelSize, Set<Option> options) {
        Car car = null;
        int index = 0;
        for (int i = 0; i < cars.size(); i++) {
            Car temp = cars.get(i);
            if (temp.getModel() == model && temp.getEngineVolume() == engineVolume) {
                if (car == null) {
                    car = temp;
                    index = i;
                    continue;
                }
                if (temp.getColor() == color && car.getColor() != color) {
                    car = temp;
                    index = i;
                    continue;
                }
                if (temp.getWheelSize() == wheelSize && car.getWheelSize() != wheelSize) {
                    car = temp;
                    index = i;
                    continue;
                }
                if (temp.getOptions() == options && car.getOptions() != options) {
                    car = temp;
                    index = i;
                    continue;
                }
            }
        }

        if (car != null) {
            cars.remove(index);
        }
        return (ElectricCar) car;
    }

}
