package shcool;

import HomeTest.transport.Car;

import java.util.ArrayList;
import java.util.List;

public class Automobil {
    public static void main(String[] args) {


        SpecialMachinery car1 = new SpecialMachinery("CAT", 2000, 45000, "Road", "USA", "Ivan", "Bulldozer", 4.5);

        UsedCars car2 = new UsedCars("Mercedes", 2011, 33000, "Classic", "Germany", "Alex", 2456, "Dan Madeskler");

        SportCars car3 = new SportCars("Porsche", 2020, 500000, "Lux", "Germany", "John Cena", 360, "4.6", 460);

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        System.out.println(carList);

        Storage storage = new Storage();
        storage.showStorageCars();

        for (Color value : Color.values()) {

            System.out.println("Color car: " + List.of(value.getColor()));
        }
        for (CarType carType : CarType.values()) {
            carType.getType();

            System.out.println("Car type: " + List.of(carType));
        }

    }
}

