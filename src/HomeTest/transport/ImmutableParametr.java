package HomeTest.transport;

public class ImmutableParametr {
    protected String model;
    private  int yearOfCar;
    private int engineSizeCar;
    boolean sunroof;

    public ImmutableParametr(String model, int yearOfCar, int engineSizeCar, boolean sunroof) {
        this.model = model;
        this.yearOfCar = yearOfCar;
        this.engineSizeCar = engineSizeCar;
        this.sunroof = sunroof;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYearOfCar(int yearOfCar) {
        this.yearOfCar = yearOfCar;
    }

    public void setEngineSizeCar(int engineSizeCar) {
        this.engineSizeCar = engineSizeCar;
    }

    public void setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
    }

    @Override
    public String toString() {
        return "ImmutableParametr{" +
                "model='" + model + '\'' +
                ", yearOfCar=" + yearOfCar +
                ", engineSizeCar=" + engineSizeCar +
                ", sunroof=" + sunroof +
                '}';
    }

}
