package HomeTest.car4.transports;


import HomeTest.car4.enums.*;

import java.util.HashSet;
import java.util.Set;

public class Truck extends Car {
    private int cargoCapacity;
    private String transmissionType;

    public Truck(int year, Model model, EngineVolume engineVolume, Color color, WheelSize wheelSize, Set<Option> options, int cargoCapacity, String transmissionType) {
        super(year, model, engineVolume, color, wheelSize, new HashSet<>());
        this.cargoCapacity = cargoCapacity;
        this.transmissionType = transmissionType;
    }


    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType() {
        this.transmissionType = transmissionType;
    }

    @Override
    public String toString() {

        return String.format("%s, Max  load capacity: %dkg, %s", super.toString(), cargoCapacity, transmissionType);
    }
}
