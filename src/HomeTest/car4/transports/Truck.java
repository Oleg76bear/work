package HomeTest.car4.transports;

import HomeTest.car4.enums.CarOption;
import HomeTest.car4.enums.WheelSize;
import HomeTest.transport.Color;

import java.util.ArrayList;

public  class Truck extends Car {
    private int cargoCapacity;

    public Truck(Color colorCar, String model, int year, double engineVolume, WheelSize wheelSize, int cargoCapacity) {
        super(colorCar, model, year, engineVolume, wheelSize, new ArrayList<>());
        addOption(CarOption.PARKING_ASSIST);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public String toString() {
        return String.format("%s, Cargo capacity: %dkg", super.toString(), cargoCapacity);
    }
}