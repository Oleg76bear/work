package shcool.car;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarFactory {
    private List<Model> models;
    private List<EngineVolume> engineVolumes;
    private List<Color> colors;
    private List<WheelSize> wheelSizes;

    public CarFactory(List<Model> models, List<EngineVolume> engineVolumes, List<Color> colors, List<WheelSize> wheelSizes) {
        this.models = models;
        this.engineVolumes = engineVolumes;
        this.colors = colors;
        this.wheelSizes = wheelSizes;
    }

    public CarFactory() {

    }

    public List<Model> getModels() {
        return models;
    }

    public List<EngineVolume> getEngineVolumes() {
        return engineVolumes;
    }

    public List<Color> getColors() {
        return colors;
    }

    public List<WheelSize> getWheelSizes() {
        return wheelSizes;
    }

    public Car createCar(Model model, EngineVolume engineVolume, Color color, WheelSize wheelSize) {
        return new Car(color, model, wheelSize, engineVolume);
    }

    public List<Car> createCars(int amount) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            Model model = getRandomModel();
            EngineVolume engineVolume = getRandomEngineVolume();
            Color color = getRandomColor();
            WheelSize wheelSize = getRandomWheelSize();
            cars.add(createCar(model, engineVolume, color, wheelSize));
        }
        return cars;
    }


    private Model getRandomModel() {
        if(models == null || models.isEmpty()) {
             throw new IllegalStateException("Models list is null or empty");
        }
        int index = (int) (Math.random() * models.size());
        return models.get(index);
    }

    private EngineVolume getRandomEngineVolume() {
        if(engineVolumes == null || engineVolumes.isEmpty()) {
                throw new IllegalStateException("EngineVolumes list is null or empty");
        }
        int index = (int) (Math.random() * engineVolumes.size());
        return engineVolumes.get(index);
    }

    private Color getRandomColor() {
        if(colors == null || colors.isEmpty()) {
            throw new IllegalStateException("Colors list is null or empty");
        }
        int index = (int) (Math.random() * colors.size());
        return colors.get(index);
    }

    private WheelSize getRandomWheelSize() {
        if(wheelSizes == null || wheelSizes.isEmpty()) {
            throw new IllegalStateException("WheelSizes list is null or empty");
        }
        int index = (int) (Math.random() * wheelSizes.size());
        return wheelSizes.get(index);
    }




        public static void main(String[] args) {
            List<Model> models = Arrays.asList(Model.values());
            List<EngineVolume> engineVolumes = Arrays.asList(EngineVolume.values());
            List<Color> colors = Arrays.asList(Color.values());
            List<WheelSize> wheelSizes = Arrays.asList(WheelSize.values());
            CarFactory factory = new CarFactory(models, engineVolumes, colors, wheelSizes);
            int amount = 10;
            CarService carService = new CarService(factory, amount);


        Car car1 = factory.createCar(Model.AUDI, EngineVolume.V6_3_0,  Color.BLACK, WheelSize.SIZE_19);
        Car car2 = factory.createCar(Model.TOYOTA, EngineVolume.V6_3_0, Color.BLACK, WheelSize.SIZE_19);
        Car car3 = factory.createCar(null, EngineVolume.V8_4_0, Color.WHITE, WheelSize.SIZE_20);


        System.out.println(car1);
        System.out.println(car2);
            System.out.println(car3);

    }
}
