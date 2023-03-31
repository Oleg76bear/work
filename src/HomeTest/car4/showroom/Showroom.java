package HomeTest.car4.showroom;


import HomeTest.car4.enums.*;
import HomeTest.car4.transports.Car;
import HomeTest.car4.factorys.CarFactory;
import HomeTest.car4.service.Service;

import java.util.Set;

public class Showroom {

    private final Service service;
    private final CarFactory factory;

    public Showroom(Service service, CarFactory factory) {
        this.service = service;
        this.factory = factory;
    }

    public Car orderCar(Model model, EngineVolume engineVolume, Color color, WheelSize wheelSize, Set<Option> options) {
        return factory.createCar(model, engineVolume, color, wheelSize, options);
    }

    public void changeColor(Car car, Color color) {
        service.changeColor(car, color);
    }

    public void changeWheels(Car car, WheelSize wheelSize) {
        service.changeWheels(car, wheelSize);
    }

    public void addOption(Car car, Option option) {
        service.addOption(car, option);
    }

    public void deleteOption(Car car, Option option) {
        service.deleteOption(car, option);
    }

    public void setOptions(Car car, Set<Option> options) {
        service.setOptions(car, options);
    }

    public void printFactorySettings() {
        System.out.println(factory.getConfigurations());
    }

}
