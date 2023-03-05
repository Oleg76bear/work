package HomeTest.car4;


import HomeTest.car4.enums.CarOption;
import HomeTest.car4.enums.WheelSize;
import HomeTest.car4.transports.Car;
import HomeTest.car4.transports.ElectricCar;
import HomeTest.car4.transports.SportCar;
import HomeTest.car4.transports.Truck;
import HomeTest.transport.Color;


public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(null, "Toyota Corolla", 2020, 2.0, WheelSize.MEDIUM, null);
        // car1.changeColor(Color.GREEN);
        car1.changeWheelSize(WheelSize.LARGE);
        car1.addOption(CarOption.PARK_ASSIST);
        car1.addOption(CarOption.MAGNITOLA);
        System.out.println(car1);

        SportCar car2 = new SportCar(Color.GRAY,"PORSCHE_911", 2020, 4.8, WheelSize.SMALL, 380, true);
        car2.changeColor(Color.GRAY);
        car2.removeOption(CarOption.CRUISE_CONTROL);
        System.out.println(car2);

        Truck car3 = new Truck(Color.YELLOW, "Volvo FH16", 2019, 12.0, WheelSize.LARGE, 40000);
        car3.addOption(CarOption.CRUISE_CONTROL);
        car3.addOption(CarOption.MAGNITOLA);
        car3.removeOption(CarOption.PARK_ASSIST);
        System.out.println(car3);

        ElectricCar car4 = new ElectricCar(Color.BLACK, "Tesla Model S", 2022, 0.0, WheelSize.MEDIUM, 100);
        car4.changeWheelSize(WheelSize.SMALL);
        System.out.println(car4);
        Car myCar = new Car(Color.BLACK, "PORSCHE_911", 2022, 2.5, WheelSize.SMALL, null);
    }
}


