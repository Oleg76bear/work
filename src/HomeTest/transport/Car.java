
package HomeTest.transport;
    public class Car extends Color, WheelSize {
        private String colorCar;
        private int wheelSizeCar;

        public Car(String model, int yearOfCar, int engineSizeCar, boolean sunroof, String colorCar, int wheelSizeCar) {
            super(model, yearOfCar, engineSizeCar, sunroof);
            this.colorCar = colorCar;
            this.wheelSizeCar = wheelSizeCar;
        }

        public void levelColor() {
            this.colorCar;
        }

        public void levelSize() {
            this.wheelSizeCar;
        }

        public void setColorCar(String colorCar) {
        if(model ="Audi") {
            System.out.println("Выберите цвет из : Синий, Красный или Зеленый");
        } else if(model ="BMW")

        {
            System.out.println("Выберите цвет из : Оранжевый, Черный или Фиолетовый");
        } else if(model ="KIA")

        {
            System.out.println("Выберите цвет из : Желтый, Cерый или Белый");
        } else

        {
            System.out.println("На данный момент мы не можем Вам предложить другие варианты");
        }

            this.colorCar = colorCar;
        }

        public int getWheelSizeCar() {
            return wheelSizeCar;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "colorCar='" + colorCar + '\'' +
                    ", wheelSizeCar=" + wheelSizeCar +
                    '}';
        }
    }

