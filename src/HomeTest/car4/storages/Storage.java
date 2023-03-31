package HomeTest.car4.storages;


import HomeTest.car4.enums.*;
import HomeTest.car4.transports.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Storage {

    private final List<Car> cars = new ArrayList<>();

    public void addCarToStorage(Car car) {
        cars.add(car);
    }

    public Car getCarFromStorage(Model model, EngineVolume engineVolume, Color color, WheelSize wheelSize, Set<Option> options) {
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
                }
            }
        }

        if (car != null) {
            cars.remove(index);
        }
        return car;
    }

}
