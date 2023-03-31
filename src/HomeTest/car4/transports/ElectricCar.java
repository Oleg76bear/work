package HomeTest.car4.transports;


import HomeTest.car4.enums.*;

import java.util.HashSet;
import java.util.Set;

public  class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar(int year, Model model, EngineVolume engineVolume, Color color, WheelSize wheelSize, Set<Option> options, int batteryCapacity) {
        super(year, model, engineVolume, color, wheelSize, new HashSet<>());
        // addOption(Option.MAGNITOLA);
        this.batteryCapacity = batteryCapacity;
    }



    @Override
    public String toString() {
        return String.format("%s, Battery capacity: %dkWh", super.toString(), batteryCapacity);
    }



    public void setBatteryCapacity(int i) {
    }
}