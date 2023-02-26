package shcool.car;

import java.util.ArrayList;
import java.util.List;



public class CarSalon {
    private List<Car> cars;

    public CarSalon() {
        cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public void paintWheel(Car car, Color wheelPaintColor) {
        if (car == null) {
            return;
        }
        for (Car.Wheel wheel : car.getWheelSize().getWheels()) {
            wheel.setColor(wheelPaintColor);
        }
    }

    public void printCars() {
        if (cars.isEmpty()) {
            System.out.println("No cars in the salon.");
        } else {
            for (Car car : cars) {
                car.printInfo();
            }
        }
    }

    public List<Car> getCarsByModel(Model model) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getModel() == model) {
                result.add(car);
            }
        }
        return result;
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
        CarSalon salon = new CarSalon();
        Car car1 = new Car(Color.BLUE, Model.AUDI, "2022", WheelSize.SIZE_15, EngineVolume.V4_1_6);
        car1.addOption(Option.LEATHER_SEATS);
        car1.addOption(Option.NAVIGATION);
        salon.addCar(car1);

        Car car2 = new Car(Color.RED, Model.BMW, "2023", WheelSize.SIZE_18, EngineVolume.V6_2_0);
        car2.addOption(Option.PARKING_ASSIST);
        salon.addCar(car2);

        salon.printCars();
        salon.paintWheel(car1, Color.GREEN);
        System.out.println("After painting the wheels:");
        salon.printCars();
    }
}
