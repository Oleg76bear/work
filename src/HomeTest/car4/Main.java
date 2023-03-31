package HomeTest.car4;

import HomeTest.car4.enums.*;
import HomeTest.car4.showroom.Showroom;
import HomeTest.car4.transports.Car;
import HomeTest.car4.factorys.CarFactory;
import HomeTest.car4.factorys.ElectricCarFactory;
import HomeTest.car4.factorys.SportCarFactory;
import HomeTest.car4.factorys.TruckFactory;
import HomeTest.car4.service.Service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        CarFactory factory = new TruckFactory(Color.values(), Model.values(), WheelSize.values(), EngineVolume.values(), new HashSet<>());
        CarFactory factory2 = new SportCarFactory(Color.values(), Model.values(), WheelSize.values(), EngineVolume.values(), new HashSet<>());
        CarFactory factory1 = new ElectricCarFactory(Color.values(), Model.values(), WheelSize.values(), EngineVolume.values(), new HashSet<>());
        Showroom showroom = new Showroom(service, factory);
        Showroom showroom1 = new Showroom(service, factory1);
        Showroom showroom2 = new Showroom(service, factory2);
        showroom.printFactorySettings();

        Car car = showroom.orderCar(
                Model.BMV,
                EngineVolume.HIGH,
                Color.GREEN,
                WheelSize.SMALL,
                new HashSet<>(Arrays.asList(Option.HEATED_SEATS, Option.MAGNITOLA, Option.NAVIGATION))

        );

        System.out.println(car);
        service.deleteOption(car, Option.MAGNITOLA);
        System.out.println(car);
        service.changeColor(car, Color.BLUE);
        service.changeWheels(car, WheelSize.MEDIUM);
        System.out.println(car);


        Set<Option> options = new HashSet<>();
        options.add(Option.SUNROOF);
        options.add(Option.CRUISE_CONTROL);

        Car car1 = showroom1.orderCar(
                Model.MERCEDES,
                EngineVolume.HIGH,
                Color.BLACK,
                WheelSize.LARGE,
                options


        );
        car1.setColor(Color.RED);
        service.deleteOption(car1, Option.CRUISE_CONTROL);
        System.out.println(car1);

        Car car2 = showroom2.orderCar(
                Model.AUDI,
                EngineVolume.HIGH,
                Color.GREEN,
                WheelSize.SMALL,
                new HashSet<>(Arrays.asList(Option.BACKUP_CAMERA, Option.AUTOMATIC_PARKING))

        );

        System.out.println(car2);
    }


//
//
//   public static void main(String[] args) {
//        CarFactory factory = new CarFactory(
//                Arrays.asList(Color.RED, Color.BLUE, Color.GREEN),
//                Arrays.asList("Truck", "SportCar", "ElectricCar"),
//                Arrays.asList(WheelSize.SMALL, WheelSize.MEDIUM, WheelSize.LARGE),
//                Arrays.asList(2.0, 3.0, 4.0),
//
//                10
//        );
//
//        factory.printAvailableOptions();
//
//        // You can now use the factory object to create cars, e.g.
//        Car car1 = factory.createCar("Truck", 3.0, WheelSize.LARGE, Color.RED);
//        Car car2 = factory.createCar("SportCar", 2.3, WheelSize.SMALL, Color.GRAY);
//        System.out.println(car1);
//        System.out.println(car2);
//        Autodealer dealer = new Autodealer();
//        dealer.orderCar(Color.RED,"Truck",2023,2.0, WheelSize.SMALL, 4000,"mechanika");
//        System.out.println(dealer);
//
//    }
//}


    //        Car car1 = new Car(null, "Toyota Corolla", 2020, 2.0, WheelSize.MEDIUM, null);
//        car1.changeColor(Color.RED);
//        car1.changeWheelSize(WheelSize.LARGE);
//      //  car1.addOption(CarOption.PARK_ASSIST);
//      //  car1.addOption(CarOption.MAGNITOLA);
//        System.out.println(car1);
//
//        SportCar car2 = new SportCar(Color.GRAY,"PORSCHE_911", 2020, 4.8, WheelSize.SMALL, 380, true);
//        car2.changeColor(Color.GRAY);
//        car2.removeOption(CarOption.CRUISE_CONTROL);
//        System.out.println(car2);
//
//        Truck car3 = new Truck(Color.YELLOW, "Volvo FH16", 2019, 12.0, WheelSize.LARGE, 40000,"mechanika");
//        car3.addOption(CarOption.CRUISE_CONTROL);
//        car3.addOption(CarOption.MAGNITOLA);
//        car3.removeOption(CarOption.PARK_ASSIST);
//        System.out.println(car3);
//
//    ElectricCar car4 = new ElectricCar(2023, Model.KIA, EngineVolume.HIGH, Color.GRAY, WheelSize.LARGE, Collections.singleton(Option.CRUISE_CONTROL), 150);
//
//        Car myCar = new Car(Color.BLACK, "PORSCHE_911", 2022, 2.5, WheelSize.SMALL, null);
//        System.out.println(myCar);
//        HomeTest.car4.servises.CarService car = new HomeTest.car4.servises.CarService("Toyota", "Camry", 2022, Color.RED, WheelSize.SMALL, new ArrayList<>(Arrays.asList("Bluetooth", "Backup Camera")));

//        car.setColor(Color.BLUE);
//        car.setWheelSize(WheelSize.LARGE);
//        car.addOption("Navigation");
//        car.removeOption("Bluetooth");
//        System.out.println(car);

}
//   ElectricCar car4 = new ElectricCar(2023, Model.KIA, EngineVolume.HIGH, Color.GRAY, WheelSize.LARGE, Collections.singleton(Option.CRUISE_CONTROL), 150);
//        CarFactory factory = new ElectricCarFactory();
//        Showroom showroom = new Showroom(new Service(), factory);
//        Set<Option> options = new HashSet<>();
//        options.add(Option.LEATHER_INTERIOR);
//        options.add(Option.PARKING_SENSORS);
//        Car car = showroom.orderCar(Model.TESLA, EngineVolume.LOW, Color.WHITE, WheelSize.SMALL, options);
//        Set<Option> newOptions = new HashSet<>(car.getOptions());
//        newOptions.add(Option.HEATED_SEATS);
//        newOptions.add(Option.AUTOMATIC_PARKING);
//        showroom.setOptions(car, newOptions);


//   CarFactory factory4 = new SportCarFactory();
//        Showroom showroom3 = new Showroom(new Service(), factory);
//        Car car3 = showroom.orderCar(Model.MERCEDES, EngineVolume.MEDIUM, Color.RED, WheelSize.SMALL, new HashSet<>());
//        showroom.changeColor(car, Color.BLUE);

