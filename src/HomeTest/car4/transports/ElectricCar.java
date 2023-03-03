package HomeTest.car4.transports;

import HomeTest.car4.enums.CarOption;
import HomeTest.car4.enums.WheelSize;
import HomeTest.transport.Color;

import java.util.ArrayList;

public  class ElectricCar extends Transport.Car {
    private int batteryCapacity;

    public ElectricCar(Color colorCar, String model, int year, double engineVolume, WheelSize wheelSize, int batteryCapacity) {
        super(colorCar, model, year, engineVolume, wheelSize, new ArrayList<>());
        addOption(CarOption.MAGNITOLA);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return String.format("%s, Battery capacity: %dkWh", super.toString(), batteryCapacity);
    }
}