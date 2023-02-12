package HomeTest.transport;

public class Main {
    public static void main(String[] args) {
        Car Audi = new Car("Audi", 1999, 2, true, Color.YELLOW, WheelSize.ENUM_SIZE22);
        Audi.setColorCar(Color.YELLOW);
       Audi.setWheelSizeCar(WheelSize.ENUM_SIZE15);
        System.out.println(Audi);
    }
}


