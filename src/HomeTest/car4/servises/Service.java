package HomeTest.car4.servises;

public class Service {
    private String wheelColor;
    private int paintCans;

    public Service(String wheelColor, int paintCans) {
        this.wheelColor = wheelColor;
        this.paintCans = paintCans;
    }

    public void changeWheelColor(int numberOfWheels, String color) {
        if (numberOfWheels <= 0) {
            System.out.println("Invalid number of wheels");
            return;
        }

        if (numberOfWheels > 4) {
            numberOfWheels = 4;
        }

        if (paintCans < numberOfWheels) {
            System.out.println("Not enough paint cans. You can only paint " + paintCans + " wheels with the available paint.");
            numberOfWheels = paintCans;
        }

        this.wheelColor = color;
        paintCans -= numberOfWheels;

        System.out.println("Wheel color has been changed to " + color + " on " + numberOfWheels + " wheel(s).");
        if (paintCans <= 0) {
            System.out.println("You have run out of paint cans. Please purchase more.");
        }
    }

    public String getWheelColor() {
        return wheelColor;
    }

    public int getPaintCans() {
        return paintCans;
    }

    public void setPaintCans(int paintCans) {
        this.paintCans = paintCans;
    }


    public static void main(String[] args) {


        Service service = new Service("black", 2);
        System.out.println("Current wheel color: " + service.getWheelColor());
        service.changeWheelColor(3, "silver");
        System.out.println("Current wheel color: " + service.getWheelColor());
        System.out.println("Remaining paint cans: " + service.getPaintCans());
        service.setPaintCans(3);
        service.changeWheelColor(2, "blue");
        System.out.println("Remaining paint cans: " + service.getPaintCans());
    }
}