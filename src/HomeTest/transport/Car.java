
package HomeTest.transport;
    public class Car  {
        private String model;
        private  int yearOfCar;
        private int engineSizeCar;
        boolean  sunroof;
        private String colorCar;
        private String wheelSizeCar;

        public Car(String model, int yearOfCar, int engineSizeCar, boolean sunroof, String colorCar, String wheelSizeCar) {
            super(model, yearOfCar, engineSizeCar, sunroof);
            this.colorCar = colorCar;
            this.wheelSizeCar = wheelSizeCar;
        }

        public void setColorCar(String colorCar) {

            if (model == "Audi") {
                System.out.println("Выберите цвет из : Синий, Красный или Зеленый");
            } else if (model == "BMW") {
                System.out.println("Выберите цвет из : Оранжевый, Черный или Фиолетовый");
            } else if (model == "KIA") {
                System.out.println("Выберите цвет из : Желтый, Cерый или Белый");
            } else {
                System.out.println("На данный момент мы не можем Вам предложить другие варианты");
            }
        }

        public String getWheelSizeCar() {
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

