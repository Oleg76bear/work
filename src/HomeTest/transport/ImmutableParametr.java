package HomeTest.transport;

public class ImmutableParametr {
    protected final String model;
    private  int yearOfCar;
    private float engineSizeCar;
    boolean sunroof;

    public ImmutableParametr(String model, int yearOfCar, float engineSizeCar, boolean sunroof) {
        this.model = model;
        this.yearOfCar = yearOfCar;
        this.engineSizeCar = engineSizeCar;
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
