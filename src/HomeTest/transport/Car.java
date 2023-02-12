
package HomeTest.transport;

import static HomeTest.transport.Color.*;

public class Car extends ImmutableParametr {

    private Color colorCar;
    private WheelSize wheelSizeCar;

    private Color[] availableColors;


    public Car(String model, int yearOfCar, float engineSizeCar, boolean sunroof, Color colorCar, WheelSize wheelSizeCar) {
        super(model, yearOfCar, engineSizeCar, sunroof);
        this.wheelSizeCar = wheelSizeCar;

        if (model.equals("Audi")) {
            availableColors = new Color[]{BLUE, RED, GREEN};
        } else if (model.equals("BMW")) {
            availableColors = new Color[]{ORANGE, BLACK, VIOLET};
        } else if (model.equals("KIA")) {
            availableColors = new Color[]{YELLOW, GRAY, WHITE};
        }

        for (Color availableColor : availableColors) {
            if (availableColor.equals(colorCar)) {
                this.colorCar = colorCar;
                break;
            }
        }
        if (this.colorCar == null) {
            System.out.println("Вы выбрали не существующий цвет, предлагаем базовый цвет для вашей модели: " + availableColors[0].getColorCar());
            this.colorCar = availableColors[0];
        }
    }

    public void setWheelSizeCar(WheelSize wheelSizeCar) {
        this.wheelSizeCar = wheelSizeCar;
    }

    public void setColorCar(Color colorCar) {

        for (Color availableColor : availableColors) {
            if (availableColor.equals(colorCar)) {
                this.colorCar = colorCar;
                break;
            }
        }
        if (!this.colorCar.equals(colorCar)) {
            System.out.println("Вы выбрали не существующий цвет, предлагаем базовый цвет для вашей модели: " + availableColors[0].getColorCar());
        }
    }
    @Override
    public String toString() {
        return "Car{" + super.toString() +
                "  colorCar='" + colorCar.getColorCar() + '\'' +
                ", wheelSizeCar=" + wheelSizeCar.getWheelSizeCar() +
                '}';
    }
}

