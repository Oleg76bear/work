
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
            System.out.println("�������� ���� �� : �����, ������� ��� �������");
        } else if(model ="BMW")

        {
            System.out.println("�������� ���� �� : ���������, ������ ��� ����������");
        } else if(model ="KIA")

        {
            System.out.println("�������� ���� �� : ������, C���� ��� �����");
        } else

        {
            System.out.println("�� ������ ������ �� �� ����� ��� ���������� ������ ��������");
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

