package shcool.car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CarSalon {
    private final CarFactory factory;
    private final List<Car> cars;

    public CarSalon(CarFactory factory) {
        this.factory = factory;
        this.cars = new ArrayList<>();
    }

    public Car orderCar(Model model, EngineVolume engineVolume, Color color, WheelSize wheelSize) {
        Car car = factory.createCar(model, engineVolume, color, wheelSize);
        cars.add(car);
        return car;
    }

    public void printInventory() {
        System.out.println("Комплектация:");
        for (Car car : cars) {
            System.out.println("- " + car);
        }
    }

    public void serviceCar(Car car, EngineVolume engineVolume, Color color, WheelSize wheelSize) {
        Car servicedCar = car;
        if (engineVolume != null) {
            servicedCar.setEngineVolume(engineVolume);
        }
        if (color != null) {
            servicedCar.setColor(color);
        }
        if (wheelSize != null) {
            servicedCar.setWheelSize(wheelSize);
        }
        cars.remove(car);
        cars.add(servicedCar);
    }

    public static void main(String[] args) {
        CarFactory factory = new CarFactory(
                new ArrayList<>(Arrays.asList(Model.TOYOTA, Model.AUDI, Model.HONDA)),

                new ArrayList<>(Arrays.asList(EngineVolume.V4_1_6, EngineVolume.V6_3_0, EngineVolume.V8_4_0)),
                new ArrayList<>(Arrays.asList(Color.BLUE, Color.RED, Color.BLACK)),
                new ArrayList<>(Arrays.asList(WheelSize.SIZE_16, WheelSize.SIZE_18, WheelSize.SIZE_19))
        );
        CarSalon salon = new CarSalon(factory);

        System.out.println("Заказ новых автомобилей...");
        Car car1 = salon.orderCar(Model.AUDI, EngineVolume.V6_3_0,  Color.BLACK, WheelSize.SIZE_19);
        Car car2 = salon.orderCar(Model.TOYOTA, EngineVolume.V6_3_0,  Color.BLACK, WheelSize.SIZE_19);
        Car car3 = salon.orderCar(Model.HONDA, EngineVolume.V4_1_6, Color.BLUE, WheelSize.SIZE_16);

        System.out.println("Комплектация после заказа:");
        salon.printInventory();

        System.out.println("Сервис существующих автомобилей...");
        salon.serviceCar(car1, EngineVolume.V8_4_0, Color.RED, null);
        salon.serviceCar(car2, null, Color.BLUE, WheelSize.SIZE_18);

        System.out.println("Комплектация после сервиса:");
        salon.printInventory();
    }
}

